package com.jetbrains.youtrack.perftest.protocol;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class HttpAdminConnection  {
    public HttpProtocolBuilder build() {
        return http.baseUrl(System.getProperty("youtrack"))
                .acceptHeader("application/json")
                .enableHttp2()
                .check(status().is(200))
                .shareConnections()
                .header("Authorization", "Bearer " + System.getProperty("youtrack_token"))
                .contentTypeHeader("application/json");
    }
}
