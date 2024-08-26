package com.jetbrains.youtrack.perftest.simulation.createUser;
import com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry.GetTelemetry;
import com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry.SaveTelemetry;
import com.jetbrains.youtrack.perftest.scenario.createUser.UserCreator;
import io.gatling.javaapi.core.Simulation;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.influxdb.client.write.Point;

import static io.gatling.javaapi.core.CoreDsl.holdFor;
import static io.gatling.javaapi.core.CoreDsl.reachRps;

@Slf4j
public class CreateOneUser extends Simulation {
    {
        setUp(
                new UserCreator().ten()
        ).throttle(
                reachRps(1).in(10),
                holdFor(111111)
        );
    }
}
