package com.jetbrains.youtrack.perftest.scenario.createUser;
import com.jetbrains.youtrack.perftest.protocol.HttpAdminConnection;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.PopulationBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Session;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpRequestActionBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

import static io.gatling.javaapi.core.CoreDsl.StringBody;
import static io.gatling.javaapi.core.CoreDsl.atOnceUsers;
import static io.gatling.javaapi.core.CoreDsl.jmesPath;
import static io.gatling.javaapi.core.CoreDsl.jsonPath;
import static io.gatling.javaapi.http.HttpDsl.status;


@Slf4j
public class UserCreator {
    private final HttpAdminConnection protocolBuilders = new HttpAdminConnection();

    private ScenarioBuilder userCreator() {

        /**
         * example:
         * {
         *   "type": "user",
         *   "id": "8faccce9-f469-4f51-bb00-6b48dba2ef04"
         * }
         */
        HttpRequestActionBuilder createUser = HttpDsl
                .http("(POST)/hub/api/rest/users")
                .post("/hub/api/rest/users?failOnPermissionReduce=true&fields=id")
                .body(StringBody("""
                          {
                          "details": [
                            {
                              "type": "EmailuserdetailsJSON",
                              "email": {
                                "type": "EmailJSON",
                                "verified": true,
                                "email": "#{email}"
                              },
                              "password": {
                                "type": "PlainpasswordJSON",
                                "value": "#{password}"
                              },
                              "passwordChangeRequired": false
                            }
                          ],
                          "name": "#{lastname} #{firstname} #{surname}"
                        }
                        """.trim())).asJson()
                .check(status().is(200))
                .check(jsonPath("$.id").saveAs("user_id"));

        /**
         * example:
         * {
         *   "type": "ServicesPage",
         *   "skip": 0,
         *   "top": 100,
         *   "total": 4,
         *   "services": [
         *     {
         *       "type": "service",
         *       "id": "284d1506-8cfa-4a1c-aa3d-23a6f86ea027",
         *       "name": "YouTrack",
         *       "applicationName": "YouTrack"
         *     },
         *     {
         *       "type": "service",
         *       "id": "0-0-0-0-0",
         *       "name": "YouTrack Administration",
         *       "applicationName": "Hub"
         *     },
         *     {
         *       "type": "service",
         *       "id": "99caa652-bfce-4e27-ba9f-6e6cbb6426b1",
         *       "name": "YouTrack Konnector",
         *       "applicationName": "YouTrack Konnector"
         *     },
         *     {
         *       "type": "service",
         *       "id": "02310123-551c-422e-bb1d-1758f7a02243",
         *       "name": "YouTrack Mobile",
         *       "applicationName": "YouTrack Mobile"
         *     }
         *   ]
         * }
         */
        HttpRequestActionBuilder getYouTrackID = HttpDsl
                .http("(GET)/hub/api/rest/services")
                .get("/hub/api/rest/services?query=&fields=id,applicationName,name,icon&orderBy=name")
                .check(status().is(200))
                .check(jmesPath("services[?name == 'YouTrack'].id | [0]").saveAs("youtrack_id"));

        /**
         * example:
         * {
         *   "token": "perm:U21pcm5vdl9WaWFjaGVzbGF2X0FsZWtzYW5kcml2aWNo.NDctNQ==.rExbLhq4zVjKZsLiRBkWjqjbbxPrm3"
         * }
         */
        HttpRequestActionBuilder createToken = HttpDsl
                .http("(POST)/hub/api/rest/users/{ID}/permanenttokens/")
                .post("/hub/api/rest/users/#{user_id}/permanenttokens/?failOnPermissionReduce=true&fields=token")
                .body(StringBody("""
                    {
                      "scope": [
                        {
                          "id": "#{youtrack_id}",
                          "key": "#{youtrack_id}",
                          "label": "YouTrack",
                          "data": {
                            "type": "service",
                            "id": "#{youtrack_id}",
                            "name": "YouTrack",
                            "applicationName": "YouTrack"
                          }
                        }
                      ],
                      "name": "#{lastname} #{firstname} #{surname} YouTrack Token"
                    }
                    """.trim())).asJson()
                .check(status().is(200))
                .check(jmesPath("token").saveAs("token"));;

        Function<Session, Session> putUserInQueue = session -> {
            if(session.contains("token")) {
                log.error("{},{}", session.userId(), session.get("token"));
            }
            return session;
        };

        Function<Session, Session> feedValues = session -> {
            log.info("*********** UserID: {}", session.userId());
            return session
                    .set("email", String.format("user%s@load.qa", session.userId()))
                    .set("lastname", String.format("Lastname%s", session.userId()))
                    .set("firstname", String.format("Firstname%s", session.userId()))
                    .set("surname", String.format("Surname%s", session.userId()))
                    .set("password", System.getProperty("users_password"))
                    ;
        };

        HttpRequestActionBuilder getRoles = HttpDsl
                .http("(GET)/hub/api/rest/roles?fields=id,name&orderBy=name")
                .get("/hub/api/rest/roles?fields=id,name&orderBy=name")
                .check(status().is(200))
                .check(jmesPath("roles[?name == 'Contributor'].id | [0]").saveAs("Contributor"))
                ;
        HttpRequestActionBuilder addRole_Contributor = HttpDsl
                .http("(POST)/hub/api/rest/users/{ID}/projectroles?failOnPermissionReduce=true")
                .post("/hub/api/rest/users/#{user_id}/projectroles/?failOnPermissionReduce=true")
                .body(StringBody("""
                        {
                          "project": {
                            "id": "0",
                            "name": "Global"
                          },
                          "role": {
                            "id": "#{Contributor}",
                            "name": "Contributor",
                          }
                        }
                    """.trim())).asJson()
                .check(status().is(200))
                .check(jmesPath("token").saveAs("token"));

        return CoreDsl.scenario("UserCreator")
                .exec(feedValues)
                .exec(createUser)
                .exitHereIfFailed()
                .exec(getYouTrackID)
                .exitHereIfFailed()
                .exec(createToken)
//                .exec(getRoles)
//                .exec(addRole_Contributor)
                .exec(putUserInQueue)
                ;
    }

    public PopulationBuilder one() {

        return userCreator()
                .injectOpen(atOnceUsers(1))
                .protocols(protocolBuilders.build());
    }

    public PopulationBuilder users(Integer count) {

        return userCreator()
                .injectOpen(CoreDsl.atOnceUsers(count))
                .protocols(protocolBuilders.build())
                ;
    }
}
