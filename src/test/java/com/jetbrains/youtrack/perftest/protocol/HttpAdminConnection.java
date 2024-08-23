package com.jetbrains.youtrack.perftest.protocol;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class HttpAdminConnection  {
    public HttpProtocolBuilder build() {
        return http.baseUrl("https://nginx:443")
                .acceptHeader("application/json")
                .enableHttp2()
                .check(status().is(200))
                .shareConnections()
                .header("Authorization", "Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry")
                .contentTypeHeader("application/json");
    }
}
