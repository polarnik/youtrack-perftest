package com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry;

import com.influxdb.client.write.Point;
import com.jetbrains.youtrack.perftest.protocol.TelegrafConnection;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.PopulationBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpRequestActionBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentLinkedQueue;

import static io.gatling.javaapi.core.CoreDsl.StringBody;

@Slf4j
public class SaveTelemetry {
    private final TelegrafConnection protocolBuilders = new TelegrafConnection();

    public PopulationBuilder getFrom(ConcurrentLinkedQueue<Point> influxdbPoints) {


        HttpRequestActionBuilder sendMetrics = HttpDsl.http("telegraf(POST)/write")
                .post("/write?db=youtrack_telemetry")
                .body(StringBody("#{telemetry}"));

        ScenarioBuilder applicationScenario = CoreDsl.scenario("Telegraf scenario")
                .exec(session -> {
                    StringBuilder builder = new StringBuilder();
                    int i = 0;
                    while (!influxdbPoints.isEmpty()) {
                        Point point = influxdbPoints.remove();
                        builder.append(point.toLineProtocol()).append("\n");
                        i++;
                    }
                    log.debug("Retrieved points from the queue: {}", i);
                    log.debug("Retrieved points from the queue: {}", builder.toString());

                    return session.set("telemetry", builder.toString());
                })
                .exitHereIfFailed()
                .exec(sendMetrics);

        return applicationScenario.injectOpen(
                        CoreDsl.constantUsersPerSec(1.0 / 60).during(24 * 60 * 60))
                .protocols(protocolBuilders.build());
    }
}
