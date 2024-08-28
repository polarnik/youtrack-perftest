package com.jetbrains.youtrack.perftest.protocol;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class HttpAdminConnection extends HttpUserConnection {
    public HttpProtocolBuilder build() {
        return super.build()
                .header("Authorization", "Bearer " + System.getProperty("youtrack_token"));
    }
}
