package com.jetbrains.youtrack.perftest.simulation.api.admin.telemetry;

import com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry.GetTelemetry;
import com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry.SaveTelemetry;
import io.gatling.javaapi.core.Simulation;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.influxdb.client.write.Point;

@Slf4j
public class TelemetrySimulation extends Simulation {
    {
        final ConcurrentLinkedQueue<Point> influxdbPoints = new ConcurrentLinkedQueue<>();

        setUp(
                new GetTelemetry()
                        .storeIn(influxdbPoints),
                new SaveTelemetry()
                        .getFrom(influxdbPoints)
        );
    }
}