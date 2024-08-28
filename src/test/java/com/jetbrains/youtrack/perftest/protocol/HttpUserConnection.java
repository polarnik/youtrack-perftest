package com.jetbrains.youtrack.perftest.protocol;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.Proxy;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;

public class HttpUserConnection {
    public HttpProtocolBuilder build() {
        HttpProtocolBuilder protocolBuilder =
                http.baseUrl(System.getProperty("youtrack"))
                        .acceptHeader("application/json")
                        .check(status().is(200))
                        .shareConnections()
                        .warmUp(System.getProperty("youtrack"))
                        .contentTypeHeader("application/json");
        if(System.getProperty("proxy_host") != null &&
                System.getProperty("proxy_port") != null) {
            protocolBuilder = protocolBuilder.proxy(
                    Proxy(System.getProperty("proxy_host"),
                        Integer.parseInt(System.getProperty("proxy_port"))));
        } else {
            protocolBuilder = protocolBuilder.enableHttp2();
        }
        return protocolBuilder;
    }
}
