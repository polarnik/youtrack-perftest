package com.jetbrains.youtrack.perftest.protocol;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.http;

public class HttpAdminConnection  {
    public HttpProtocolBuilder build() {
        return http.baseUrl("https://127.0.0.1:443")
                .acceptHeader("application/json")
                .enableHttp2()
                .shareConnections()
                .header("Authorization", "Bearer perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry")
                .contentTypeHeader("application/json");
    }
}
