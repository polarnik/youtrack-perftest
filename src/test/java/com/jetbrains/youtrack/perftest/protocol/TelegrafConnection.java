package com.jetbrains.youtrack.perftest.protocol;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class TelegrafConnection {
    public HttpProtocolBuilder build() {
        return http.baseUrl(System.getProperty("telegraf"))
                .acceptHeader("application/json")
                .shareConnections()
                .check(status().is(204))
                .header("Content-Encoding", "identity")
                .contentTypeHeader("plain/text");
    }
}
