package com.jetbrains.youtrack.perftest.protocol;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import static io.gatling.javaapi.http.HttpDsl.*;

public class HttpAdminConnection extends HttpUserConnection {
    public HttpProtocolBuilder build() {

        HttpProtocolBuilder protocolBuilder =
                http.baseUrl(System.getProperty("youtrack"))
                        .disableWarmUp()
                        .header("Authorization", "Bearer " + System.getProperty("youtrack_token"))
                        ;

        if(System.getProperty("proxy_host") != null &&
                System.getProperty("proxy_port") != null) {
            protocolBuilder = protocolBuilder.proxy(
                    Proxy(System.getProperty("proxy_host"),
                            Integer.parseInt(System.getProperty("proxy_port"))));
        }

        return protocolBuilder;
    }
}
