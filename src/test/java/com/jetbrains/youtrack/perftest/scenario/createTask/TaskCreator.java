package com.jetbrains.youtrack.perftest.scenario.createTask;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jetbrains.youtrack.SingleEnumIssueCustomField;
import com.jetbrains.youtrack.Issue;
import com.jetbrains.youtrack.IssueCustomField;

import com.jetbrains.youtrack.perftest.protocol.HttpUserConnection;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.PopulationBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Session;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpRequestActionBuilder;
import lombok.extern.slf4j.Slf4j;

import java.lang.management.OperatingSystemMXBean;
import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

import static io.gatling.javaapi.core.CoreDsl.StringBody;
import static io.gatling.javaapi.core.CoreDsl.atOnceUsers;
import static io.gatling.javaapi.core.CoreDsl.bodyString;
import static io.gatling.javaapi.core.CoreDsl.csv;
import static io.gatling.javaapi.core.CoreDsl.exec;
import static io.gatling.javaapi.core.CoreDsl.group;
import static io.gatling.javaapi.core.CoreDsl.holdFor;
import static io.gatling.javaapi.core.CoreDsl.jmesPath;
import static io.gatling.javaapi.core.CoreDsl.jsonPath;
import static io.gatling.javaapi.core.CoreDsl.reachRps;
import static io.gatling.javaapi.http.HttpDsl.status;

@Slf4j
public class TaskCreator {

    private final HttpUserConnection protocolBuilders = new HttpUserConnection();

    private ScenarioBuilder taskCreator() {

        String userTokensPath = System.getProperty("userTokensPath");
        String postsPath = System.getProperty("postsPath");

        Function<Session, Session> prepareValues = session -> {
            Session newSession = session;

            String summary = session.getString("Title");
            String description = session.getString("Body");
            if(summary == null || summary.isEmpty()) {
                if(description == null || description.isEmpty()) {
                    log.warn("Title and Body were empty");
                    newSession = newSession.set("summary",
                            String.format("User %d has some problems with Title and Body at %s",
                                    session.userId(), new Date().toString())
                            );
                } else {
                    if(description.length() > 100)
                        summary = description.substring(0, 100);
                    else
                        summary = description;
                    summary = summary
                            .replaceAll("\\s+", " ")
                            .replaceAll("[^a-z,A-Z,0-1,\\,, ,\\.,',\\?,\\!,\\-]", "")
                            .replaceAll(" ([^ ]+)$", "")
                            .trim()
                    ;
                    newSession = newSession.set("summary", summary);
                }
            } else {
                newSession = newSession.set("summary", summary);
            }
            if(description == null || description.isEmpty()) {
                log.warn("Body is empty");
                newSession = newSession.set("description",
                        String.format("User %d has some problems with Title and Body at %s",
                                session.userId(), new Date().toString())
                );
            } else {
                newSession = newSession.set("description", description);
            }
            log.debug("userId: {}, youtrackUserId: {}, summary: {}",
                    newSession.userId(),
                    newSession.getString("youtrackUserId"),
                    newSession.getString("summary")
            );
            return newSession;
        };

        Double maxLoadAverage = Double.parseDouble(System.getProperty("maxLoadAverage") != null ?
                System.getProperty("maxLoadAverage") : "15.0");

        String draftFields = "description,updated,attachments(id,name,author(ringId,avatarUrl,canReadProfile,isLocked,login,name),created,updated,mimeType,url,size,visibility(@visibility),imageDimensions(width,height),thumbnailURL,recognizedText,searchResults(textSearchResult(highlightRanges(@textRange))),comment(id,visibility(@visibility)),embeddedIntoDocument(id),embeddedIntoComments(id)),mentionedUsers(@reporter),mentionedIssues(id,reporter(@reporter),resolved,updated,created,unauthenticatedReporter,fields(@fields),project(@project),visibility(@visibility),tags(@tags),votes,voters(hasVote),watchers(hasStar),usersTyping(timestamp,user(@permittedUsers)),canUndoComment,idReadable,summary),mentionedArticles(id,idReadable,reporter(@permittedUsers),summary,project(@project),parentArticle(idReadable),ordinal,visibility(@visibility),hasUnpublishedChanges,hasChildren,tags(@tags)),widgets(id,key,appId,description,appName,name,collapsed,indexPath,extensionPoint(),iconPath,appIconPath,expectedHeight,expectedWidth),canUpdateVisibility,canAddPublicComment,id,summary,created,project(@project),reporter(@reporter),fields(@fields),visibility(@visibility),tags(id,name,color(@color),query,issuesUrl,isDeletable,isShareable,isUpdatable,isUsable,pinnedByDefault,untagOnResolve,owner(@permittedUsers),readSharingSettings(@updateSharingSettings),tagSharingSettings(@updateSharingSettings),updateSharingSettings(@updateSharingSettings)),watchers(hasStar),markdownEmbeddings(key,settings,widget(id));@fields:value(id,minutes,presentation,name,description,localizedName,isResolved,color(@color),buildIntegration,buildLink,text,issueRelatedGroup(@permittedGroups),ringId,login,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id),allUsersGroup,icon,teamForProject(name,shortName)),id,$type,hasStateMachine,isUpdatable,projectCustomField($type,id,field(id,name,ordinal,aliases,localizedName,fieldType(id,presentation,isBundleType,valueType,isMultiValue)),bundle(id,$type),canBeEmpty,emptyFieldText,hasRunningJob,ordinal,isSpentTime,isPublic),searchResults(id,textSearchResult(highlightRanges(@textRange),textRange(@textRange))),pausedTime;@visibility:$type,implicitPermittedUsers(@permittedUsers),permittedGroups(@permittedGroups),permittedUsers(@permittedUsers);@project:id,ringId,name,shortName,iconUrl,template,pinned,archived,isDemo,organization(),hasArticles,team(@permittedGroups),fieldsSorted,restricted,plugins(timeTrackingSettings(id,enabled),helpDeskSettings(id,enabled,defaultForm(uuid,title)),vcsIntegrationSettings(hasVcsIntegrations),grazie(disabled));@updateSharingSettings:permittedGroups(@permittedGroups),permittedUsers(@permittedUsers);@reporter:issueRelatedGroup(@permittedGroups),id,ringId,login,name,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id);@permittedUsers:id,ringId,login,name,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id);@permittedGroups:id,name,ringId,allUsersGroup,icon,teamForProject(name,shortName);@tags:id,name,color(@color);@color:id,background,foreground;@textRange:startOffset,endOffset";
        String issueFields = "description,updater(@reporter),creator(@reporter),attachments(@attachments),mentionedUsers(@reporter),mentionedIssues(@mentionedIssues),mentionedArticles(@mentionedArticles),workItems(id,author(@user),creator(@user),text,type(@value),duration(minutes,presentation),textPreview,created,updated,date,usesMarkdown,attributes(id,name,value(@value))),usesMarkdown,hasEmail,wikifiedDescription,messages,tags(id,name,color(@color),query,issuesUrl,isDeletable,isShareable,isUpdatable,isUsable,pinnedByDefault,untagOnResolve,owner(@user),readSharingSettings(@updateSharingSettings),tagSharingSettings(@updateSharingSettings),updateSharingSettings(@updateSharingSettings)),pinnedComments(author(@user),id,text,textPreview,deleted,pinned,visibility(@visibility),attachments(@attachments),mentionedUsers(@reporter),mentionedIssues(@mentionedIssues),mentionedArticles(@mentionedArticles),reactions(id,reaction,author(@user)),reactionOrder,usesMarkdown,hasEmail,canUpdateVisibility,suspiciousEmail,created,updated,issue(id,project(id)),markdownEmbeddings(@markdownEmbeddings)),canUpdateVisibility,canAddPublicComment,widgets(id,key,appId,description,appName,name,collapsed,indexPath,extensionPoint(),iconPath,appIconPath,expectedHeight,expectedWidth),externalIssue(key,name,url),summaryTextSearchResult(@textSearchResult),descriptionTextSearchResult(@textSearchResult),channel($type,id,name,mailboxRule(id)),id,reporter(@reporter),resolved,updated,created,unauthenticatedReporter,fields(@fields),project(@project),visibility(@visibility),votes,voters(hasVote),watchers(hasStar),usersTyping(@usersTyping),canUndoComment,idReadable,summary,markdownEmbeddings(@markdownEmbeddings);@mentionedIssues:id,reporter(@reporter),resolved,updated,created,unauthenticatedReporter,fields(@fields),project(@project),visibility(@visibility),tags(@tags),votes,voters(hasVote),watchers(hasStar),usersTyping(@usersTyping),canUndoComment,idReadable,summary;@attachments:id,name,author(ringId,avatarUrl,canReadProfile,isLocked,login,name),created,updated,mimeType,url,size,visibility(@visibility),imageDimensions(width,height),thumbnailURL,recognizedText,searchResults(textSearchResult(highlightRanges(@textRange))),comment(id,visibility(@visibility)),embeddedIntoDocument(id),embeddedIntoComments(id);@mentionedArticles:id,idReadable,reporter(@user),summary,project(@project),parentArticle(idReadable),ordinal,visibility(@visibility),hasUnpublishedChanges,hasChildren,tags(@tags);@fields:value(id,minutes,presentation,name,description,localizedName,isResolved,color(@color),buildIntegration,buildLink,text,issueRelatedGroup(@permittedGroups),ringId,login,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id),allUsersGroup,icon,teamForProject(name,shortName)),id,$type,hasStateMachine,isUpdatable,projectCustomField($type,id,field(id,name,ordinal,aliases,localizedName,fieldType(id,presentation,isBundleType,valueType,isMultiValue)),bundle(id,$type),canBeEmpty,emptyFieldText,hasRunningJob,ordinal,isSpentTime,isPublic),searchResults(id,textSearchResult(@textSearchResult)),pausedTime;@visibility:$type,implicitPermittedUsers(@user),permittedGroups(@permittedGroups),permittedUsers(@user);@project:id,ringId,name,shortName,iconUrl,template,pinned,archived,isDemo,organization(),hasArticles,team(@permittedGroups),fieldsSorted,restricted,plugins(timeTrackingSettings(id,enabled),helpDeskSettings(id,enabled,defaultForm(uuid,title)),vcsIntegrationSettings(hasVcsIntegrations),grazie(disabled));@updateSharingSettings:permittedGroups(@permittedGroups),permittedUsers(@user);@reporter:issueRelatedGroup(@permittedGroups),id,ringId,login,name,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id);@usersTyping:timestamp,user(@user);@value:id,name,autoAttach,description,hasRunningJobs,color(@color),attributes(id,timeTrackingSettings(id,project(id)));@user:id,ringId,login,name,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id);@textSearchResult:highlightRanges(@textRange),textRange(@textRange);@permittedGroups:id,name,ringId,allUsersGroup,icon,teamForProject(name,shortName);@tags:id,name,color(@color);@color:id,background,foreground;@markdownEmbeddings:key,settings,widget(id);@textRange:startOffset,endOffset";
        String similarFields = "id,reporter(issueRelatedGroup(@permittedGroups),id,ringId,login,name,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id)),resolved,updated,created,unauthenticatedReporter,fields(value(id,minutes,presentation,name,description,localizedName,isResolved,color(@color),buildIntegration,buildLink,text,issueRelatedGroup(@permittedGroups),ringId,login,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id),allUsersGroup,icon,teamForProject(name,shortName)),id,$type,hasStateMachine,isUpdatable,projectCustomField($type,id,field(id,name,ordinal,aliases,localizedName,fieldType(id,presentation,isBundleType,valueType,isMultiValue)),bundle(id,$type),canBeEmpty,emptyFieldText,hasRunningJob,ordinal,isSpentTime,isPublic),searchResults(id,textSearchResult(highlightRanges(@textRange),textRange(@textRange))),pausedTime),project(id,ringId,name,shortName,iconUrl,template,pinned,archived,isDemo,organization(),hasArticles,team(@permittedGroups),fieldsSorted,restricted,plugins(timeTrackingSettings(id,enabled),helpDeskSettings(id,enabled,defaultForm(uuid,title)),vcsIntegrationSettings(hasVcsIntegrations),grazie(disabled))),visibility($type,implicitPermittedUsers(@user),permittedGroups(@permittedGroups),permittedUsers(@user)),tags(id,name,color(@color)),votes,voters(hasVote),watchers(hasStar),usersTyping(timestamp,user(@user)),canUndoComment,idReadable,summary;@user:id,ringId,login,name,email,isEmailVerified,guest,fullName,avatarUrl,online,banned,banBadge,canReadProfile,isLocked,userType(id);@permittedGroups:id,name,ringId,allUsersGroup,icon,teamForProject(name,shortName);@color:id,background,foreground;@textRange:startOffset,endOffset";
        HttpRequestActionBuilder firstDraft = HttpDsl
                .http("(POST)"+
                        "/api/users/me/drafts?fields={draftFields}")
                .post("/api/users/me/drafts?fields=" + draftFields)
                .body(StringBody("{}")).asJson()
                .header("Authorization", "Bearer #{token}")
                .header("userId", session -> { return String.valueOf(session.userId()); } )
                .header("scenario", session -> { return String.valueOf(session.scenario()); } )
                .check(status().is(200))
                .check(bodyString().saveAs("draftJson"))
                ;

        Function<Session, Session> prepareIssueWithout_projectCustomField = session -> {
            String draftJson = session.getString("draftJson");
            Issue issue = new Issue();
            Gson gson = new GsonBuilder().create();
            issue = gson.fromJson(draftJson, Issue.class);
            for(IssueCustomField issueCustomField : issue.getFields()) {
                issueCustomField.setProjectCustomField(null);
            }
            issue.setReporter(null);
            issue.setVisibility(null);
            issue.setWatchers(null);
            return session.set("draftIssue", issue).set("draft_id", issue.getId());
        };

        Function<Session, String> prepareDraftMessageWithPartOfText = session -> {
            String summary = session.getString("summary");
            String description = session.getString("description");
            String shortSummary = "";
            String shortDescription = null;
            int summarySize = session.getInt("SummarySize");
            int descriptionSize = session.getInt("DescriptionSize");
            if(summarySize > 0) {
                if(summary.length() > summarySize) {
                    shortSummary = summary.substring(0, summarySize);
                } else {
                    shortSummary = summary;
                }
            }
            if(descriptionSize > 0) {
                if (description.length() > descriptionSize) {
                    shortDescription = description.substring(0, descriptionSize);
                } else {
                    shortDescription = description;
                }
            }
            Issue draftIssue = session.get("draftIssue");
            draftIssue.setSummary(shortSummary);
            draftIssue.setDescription(shortDescription);
            String issueJson = new Gson().toJson(draftIssue, Issue.class);
            log.debug("userId: {} Issue text:\n{}", session.userId(), issueJson);
            return issueJson;
        };

        Function<Session, Session> prepareShortSummarySize = session -> {
            return session
                    .set("SummarySize", 0)
                    .set("SummarySize_iteration", 0)
                    ;
        };
        Function<Session, Session> prepareShortDescriptionSize = session -> {
            return session
                    .set("DescriptionSize", 0)
                    .set("DescriptionSize_iteration", 0)
                    ;
        };
        Function<Session, Session> increaseSummarySize = session -> {
            return session
                    .set("SummarySize", session.getInt("SummarySize") + 10)
                    .set("SummarySize_iteration", session.getInt("SummarySize_iteration") + 1)
                    ;
        };
        Function<Session, Session> increaseDescriptionSize = session -> {
            return session
                    .set("DescriptionSize", session.getInt("DescriptionSize") + 10)
                    .set("DescriptionSize_iteration", session.getInt("DescriptionSize_iteration") + 1)
                    ;
        };

        HttpRequestActionBuilder intermediateDraft = HttpDsl
                    .http("(POST)"+
                            "/api/users/me/drafts/{ID}?fields={FIELDS}")
                    .post("/api/users/me/drafts/#{draft_id}?fields=" + draftFields)
                    .body(StringBody(prepareDraftMessageWithPartOfText)).asJson()
                    .header("Authorization", "Bearer #{token}")
                    .header("userId", session -> { return String.valueOf(session.userId()); } )
                    .header("scenario", session -> { return String.valueOf(session.scenario()); } )
                ;

        HttpRequestActionBuilder api_issues_similar = HttpDsl
                .http("(POST)"+
                        "/api/issues/similar?$top=20,fields={FIELDS},customFields=Priority")
                .post("/api/issues/similar?$top=20&fields=" + similarFields + "&customFields=Priority")
                .body(StringBody("""
                        {"idReadable": "#{draft_id}"}
                        """)).asJson()
                .header("Authorization", "Bearer #{token}")
                .header("userId", session -> { return String.valueOf(session.userId()); } )
                .header("scenario", session -> { return String.valueOf(session.scenario()); } )
                ;

        Function<Session, String> prepareFinalDraftMessage = session -> {
            String summary = session.getString("summary");
            String description = session.getString("description");
            Issue draftIssue = session.get("draftIssue");
            draftIssue.setSummary(summary);
            draftIssue.setDescription(description);
            return new Gson().toJson(draftIssue, Issue.class);
        };

        HttpRequestActionBuilder finalDraft = HttpDsl
                .http("(POST)"+
                          "/api/users/me/drafts/{ID}?fields={FIELDS}")
                .post("/api/users/me/drafts/#{draft_id}?fields=" + draftFields)
                .body(StringBody(prepareFinalDraftMessage)).asJson()
                .header("Authorization", "Bearer #{token}")
                .header("userId", session -> { return String.valueOf(session.userId()); } )
                .header("scenario", session -> { return String.valueOf(session.scenario()); } )
                ;

        HttpRequestActionBuilder convertDraftToIssue = HttpDsl
                .http("(POST)"+
                        "/api/issues/?draftId={ID}&fields={issueFields}")
                .post("/api/issues/?draftId=#{draft_id}&fields=" + issueFields)
                .body(StringBody("{}")).asJson()
                .header("Authorization", "Bearer #{token}")
                .header("userId", session -> { return String.valueOf(session.userId()); } )
                .header("scenario", session -> { return String.valueOf(session.scenario()); } )
                ;

        Function<Session, Session> checkCpuUsage = session -> {
            OperatingSystemMXBean os = java.lang.management.ManagementFactory.getOperatingSystemMXBean();
            if(os.getSystemLoadAverage() > maxLoadAverage) {
                log.error("the system load average for the last minute: {}", os.getSystemLoadAverage());
                return session.markAsFailed();
            }
            else {
                log.debug("the system load average for the last minute: {}", os.getSystemLoadAverage());
                return session.markAsSucceeded();
            }
        };
        return CoreDsl.scenario("TaskCreator")
                .exec(checkCpuUsage)
                .exitHereIfFailed()
                .feed(csv(userTokensPath).circular())
                .feed(csv(postsPath).circular().batch(100))
                .exec(prepareValues)
                .group("createIssue").on(
                    exec(firstDraft)
                        .exitHereIfFailed()
                        .exec(prepareIssueWithout_projectCustomField)
                    .exec(prepareShortSummarySize)
                    .exec(prepareShortDescriptionSize)
                    .doWhile(session -> session.getInt("SummarySize_iteration") < 3).on(
                            exec(intermediateDraft).exec(increaseSummarySize)
                                    .exec(api_issues_similar)
                    )
                    .doWhile(session -> session.getInt("DescriptionSize_iteration") < 10).on(
                            exec(intermediateDraft).exec(increaseDescriptionSize)
                                    .exec(api_issues_similar)
                    )
                    .exec(finalDraft)
                    .exec(convertDraftToIssue)
                )
                ;
    }
    public PopulationBuilder tasks_100_000() {
        int meanResponseTimeMS = 900;
        int requests = 16;
        int rps = 3;
        double tps_in_one_vu = 1000.0 / (meanResponseTimeMS * requests);
        double rps_in_one_vu = 1000.0 / meanResponseTimeMS;
        double tps = tps_in_one_vu * rps / rps_in_one_vu;

        log.debug("""
                \n
                One VU will provide {} rps. 
                For one VU (1 active user) we should use TPS = {}.
                  
                I would like to have {} rps, the target RPS is {}.
                The target RPS in X time higher then one VU rps, X = {}.
                
                We will start "One VU TPS" x "X" = {} x {} == {} tps
                """,
                rps_in_one_vu, tps_in_one_vu,
                rps, rps,
                1.0 * rps / rps_in_one_vu,
                tps_in_one_vu, 1.0 * rps / rps_in_one_vu, tps
                );
        log.debug("tps: {}, rps: {}", tps, rps);
        Duration step_duration = Duration.ofSeconds(60);
        Duration rumpUp_duration = Duration.ofSeconds(10);
        return taskCreator()
                .injectOpen(
                        CoreDsl.incrementUsersPerSec(tps)
                                .times(50)
                                .eachLevelLasting(step_duration)
                                .separatedByRampsLasting(rumpUp_duration)
                                .startingFrom(tps)
                )
                .throttle(
                        // 18 HTTP request per scenario
                        reachRps(1 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(2 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(3 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(4 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(5 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(6 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(6 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(7 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(8 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(9 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(10 * rps).in(rumpUp_duration), holdFor(step_duration),

                        reachRps(11 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(12 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(13 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(14 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(15 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(16 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(16 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(17 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(18 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(19 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(20 * rps).in(rumpUp_duration), holdFor(step_duration),

                        reachRps(21 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(22 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(23 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(24 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(25 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(26 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(26 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(27 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(28 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(29 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(30 * rps).in(rumpUp_duration), holdFor(step_duration),

                        reachRps(31 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(32 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(33 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(34 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(35 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(36 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(36 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(37 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(38 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(39 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(40 * rps).in(rumpUp_duration), holdFor(step_duration),

                        reachRps(41 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(42 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(43 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(44 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(45 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(46 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(46 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(47 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(48 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(49 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(50 * rps).in(rumpUp_duration), holdFor(step_duration),

                        reachRps(51 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(52 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(53 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(54 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(55 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(56 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(56 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(57 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(58 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(59 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(60 * rps).in(rumpUp_duration), holdFor(step_duration),

                        reachRps(61 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(62 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(63 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(64 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(65 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(66 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(66 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(67 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(68 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(69 * rps).in(rumpUp_duration), holdFor(step_duration),
                        reachRps(70 * rps).in(rumpUp_duration), holdFor(step_duration),

                        reachRps(0).in(step_duration)
                )
                .protocols(protocolBuilders.build())
                ;
    }
}
