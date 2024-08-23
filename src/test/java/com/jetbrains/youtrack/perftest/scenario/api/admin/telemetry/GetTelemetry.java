package com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry;

import com.google.gson.Gson;
import com.influxdb.client.write.Point;
import com.jetbrains.youtrack.Telemetry;
import com.jetbrains.youtrack.perftest.protocol.HttpAdminConnection;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.PopulationBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Session;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpRequestActionBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;

import static io.gatling.javaapi.core.CoreDsl.bodyString;
import static io.gatling.javaapi.http.HttpDsl.status;


@Slf4j
public class GetTelemetry {
    private final HttpAdminConnection protocolBuilders = new HttpAdminConnection();

    private double sizeStringToMegaBytes(String str) {
        String[] parts = str.split(" ");
        double size = Double.parseDouble(parts[0]);
        String suffix = parts[1];
        double multiplicator = switch (suffix.toUpperCase()) {
            case "B" -> 1 / (1024 * 1024);
            case "KB" -> 1 / 1024;
            case "MB" -> 1;
            case "GB" -> 1024;
            case "TB" -> 1024 * 1024;
            default -> throw new IllegalStateException("Unexpected value: " + suffix);
        };
        return size * multiplicator;
    }

    private double percentStringToDouble(String str) {
        return Double.parseDouble(str.replace("%", ""));
    }

    private ScenarioBuilder buildTelemetry(ConcurrentLinkedQueue<Point> influxdbPoints) {

        HttpRequestActionBuilder telemetryGet = HttpDsl
                .http("youtrack(GET)/api/admin/telemetry")
                .get("/api/admin/telemetry?fields=allocatedMemory,availableMemory,availableProcessors,blobStringsCacheHitRate,cachedResultsCountInDBQueriesCache,databaseBackgroundThreads,databaseQueriesCacheHitRate,databaseSize,fullDatabaseSize,notificationAnalyzerThreads,onlineUsers,pendingAsyncJobs,reportCalculatorThreads,requestsPerSecond,textIndexSize,totalTransactions,transactionsPerSecond,usedMemory")
                .check(status().is(200))
                .check(bodyString().saveAs("telemetryJson"));

        Function<Session, Session> telemetryPutInQueue = session -> {
            String telemetryJson = session.getString("telemetryJson");
            log.debug("Retrieved the Telemetry content from the server: {}", telemetryJson);
            Telemetry telemetry = new Gson().fromJson(telemetryJson, Telemetry.class);
            log.debug("Retrieved the Telemetry from the server: {}", telemetry);
            if(telemetry != null) {
                Point point = Point.measurement("telemetry");
                point.addField("allocatedMemoryMB", sizeStringToMegaBytes(telemetry.getAllocatedMemory()));
                point.addField("availableMemoryMB", sizeStringToMegaBytes(telemetry.getAvailableMemory()));
                point.addField("availableProcessors", telemetry.getAvailableProcessors());
                point.addField("blobStringsCacheHitRate", percentStringToDouble(telemetry.getBlobStringsCacheHitRate()));
                point.addField("cachedResultsCountInDBQueriesCache", telemetry.getCachedResultsCountInDBQueriesCache());
                point.addField("databaseBackgroundThreads", telemetry.getDatabaseBackgroundThreads());
                point.addField("databaseQueriesCacheHitRate", percentStringToDouble(telemetry.getDatabaseQueriesCacheHitRate()));
                point.addField("databaseSizeMB", sizeStringToMegaBytes(telemetry.getDatabaseSize()));
                point.addField("fullDatabaseSizeMB", sizeStringToMegaBytes(telemetry.getFullDatabaseSize()));
                point.addField("notificationAnalyzerThreads", telemetry.getNotificationAnalyzerThreads());
                point.addField("pendingAsyncJobs", telemetry.getPendingAsyncJobs());
                point.addField("reportCalculatorThreads", telemetry.getReportCalculatorThreads());
                point.addField("requestsPerSecond", Double.parseDouble(telemetry.getRequestsPerSecond()));
                point.addField("textIndexSizeMB", sizeStringToMegaBytes(telemetry.getTextIndexSize()));
                point.addField("totalTransactions", telemetry.getTotalTransactions());
                point.addField("transactionsPerSecond", Double.parseDouble(telemetry.getTransactionsPerSecond()));
                point.addField("usedMemoryMB", sizeStringToMegaBytes(telemetry.getUsedMemory()));

                influxdbPoints.add(point);
                log.debug("InfluxDB Point: {}", point.toLineProtocol());
                log.debug("Queue size: {}", influxdbPoints.size());
            }
            return session;
        };

        return CoreDsl.scenario("Telemetry scenario")
                .exec(telemetryGet)
                .exitHereIfFailed()
                .exec(telemetryPutInQueue);
    }


    public PopulationBuilder storeIn(ConcurrentLinkedQueue<Point> influxdbPoints) {
        return buildTelemetry(influxdbPoints)
                .injectOpen(CoreDsl.constantUsersPerSec(1).during(24 * 60 * 60))
                .protocols(protocolBuilders.build());
    }
}
