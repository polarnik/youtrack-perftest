package com.jetbrains.youtrack.perftest.simulation.api.admin.telemetry;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.PopulationBuilder;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpRequestActionBuilder;
import com.google.gson.Gson;
import com.jetbrains.youtrack.Telemetry;
import com.jetbrains.youtrack.perftest.protocol.HttpAdminConnection;
import io.gatling.javaapi.core.PopulationBuilder;
import io.gatling.javaapi.core.Simulation;
//import io.gatling.javaapi.core.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;
import com.influxdb.client.write.Point;
import com.influxdb.client.domain.WritePrecision;


@Slf4j
public class TelemetrySimulation extends Simulation {

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
        return Math.round(size * multiplicator);
    }

    private double percentStringToDouble(String str) {
        return Double.parseDouble(str.replace(" %", ""));
    }

    private double stringToDouble(String str) {
        return Double.parseDouble(str);
    }

    ScenarioBuilder myFirstScenario = scenario("telemetry")
            .exec(
                    http("(GET)/api/admin/telemetry")
                    .get("/api/admin/telemetry?fields=allocatedMemory,availableMemory,availableProcessors,blobStringsCacheHitRate,cachedResultsCountInDBQueriesCache,databaseBackgroundThreads,databaseLocation,databaseQueriesCacheHitRate,databaseSize,fullDatabaseSize,id,installationFolder,logsLocation,notificationAnalyzerThreads,onlineUsers,pendingAsyncJobs,reportCalculatorThreads,requestsPerSecond,startedTime,textIndexSize,totalTransactions,transactionsPerSecond,uptime,usedMemory")
                    .check(status().is(200))
                            .check(bodyString().saveAs("telemetryJson"))
            )
            .exec(
                    session -> {
                        String telemetryJson = session.getString("telemetryJson");
                        Telemetry telemetry = new Gson().fromJson(telemetryJson, Telemetry.class);
                        log.debug("Retrieved the Telemetry from the server: {}", telemetry);
                        Point point = Point.measurement("telemetry");
                        point.addField("allocatedMemoryMB", sizeStringToMegaBytes(telemetry.getAllocatedMemory()));
                        point.addField("availableMemoryMB", sizeStringToMegaBytes(telemetry.getAvailableMemory()));
                        point.addField("availableProcessors", telemetry.getAvailableProcessors());
                        point.addField("blobStringsCacheHitRate", percentStringToDouble(telemetry.getBlobStringsCacheHitRate()));
                        point.addField("cachedResultsCountInDBQueriesCache", telemetry.getCachedResultsCountInDBQueriesCache());
                        point.addField("databaseBackgroundThreads", telemetry.getDatabaseBackgroundThreads());
                        point.addTag("databaseLocation", telemetry.getDatabaseLocation());
                        point.addField("databaseQueriesCacheHitRate", percentStringToDouble(telemetry.getDatabaseQueriesCacheHitRate()));
                        point.addField("databaseSizeMB", sizeStringToMegaBytes(telemetry.getDatabaseSize()));
                        point.addField("fullDatabaseSizeMB", sizeStringToMegaBytes(telemetry.getFullDatabaseSize()));
                        point.addTag("id", telemetry.getId());
                        point.addTag("installationFolder", telemetry.getInstallationFolder());
                        point.addTag("logsLocation", telemetry.getLogsLocation());
                        point.addField("notificationAnalyzerThreads", telemetry.getNotificationAnalyzerThreads());
                        point.addField("pendingAsyncJobs", telemetry.getPendingAsyncJobs());
                        point.addField("reportCalculatorThreads", telemetry.getReportCalculatorThreads());
                        point.addField("requestsPerSecond", telemetry.getRequestsPerSecond());
                        point.addField("startedTime", telemetry.getStartedTime());
                        point.addField("textIndexSizeMB", sizeStringToMegaBytes(telemetry.getTextIndexSize()));
                        point.addField("totalTransactions", telemetry.getTotalTransactions());
                        point.addField("transactionsPerSecond", telemetry.getTransactionsPerSecond());
                        point.addField("uptime", telemetry.getUptime());
                        point.addField("usedMemoryMB", sizeStringToMegaBytes(telemetry.getUsedMemory()));
                        return session;
                    }
            );

    {
        setUp(
                myFirstScenario.injectOpen(constantUsersPerSec(1).during(Long.MAX_VALUE))
        ).protocols(HttpAdminConnection.build());
    }
}