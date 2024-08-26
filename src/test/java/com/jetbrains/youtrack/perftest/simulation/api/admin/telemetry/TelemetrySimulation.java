package com.jetbrains.youtrack.perftest.simulation.api.admin.telemetry;

import com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry.GetTelemetry;
import com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry.SaveTelemetry;
import io.gatling.javaapi.core.Simulation;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.influxdb.client.write.Point;

import static io.gatling.javaapi.core.CoreDsl.holdFor;
import static io.gatling.javaapi.core.CoreDsl.reachRps;

@Slf4j
public class TelemetrySimulation extends Simulation {
    {
        String rps = System.getProperty("rps");
        int rps_val = Integer.parseInt(rps != null ? rps : "1" );
        String duration = System.getProperty("duration");
        long duration_val = Long.parseLong(duration != null ? duration : "600" );

        final ConcurrentLinkedQueue<Point> influxdbPoints = new ConcurrentLinkedQueue<>();

        setUp(
                new GetTelemetry()
                        .storeIn(influxdbPoints),
                new SaveTelemetry()
                        .getFrom(influxdbPoints)
        ).throttle(
                reachRps(rps_val).in(20),
                holdFor(duration_val > 20 ? duration_val - 20 : duration_val),
                reachRps(0).in(20)
        );
    }
}