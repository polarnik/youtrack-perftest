package com.jetbrains.youtrack.perftest.simulation.createUser;
import com.jetbrains.youtrack.perftest.scenario.createUser.UserCreator;
import io.gatling.javaapi.core.Simulation;
import lombok.extern.slf4j.Slf4j;

import static io.gatling.javaapi.core.CoreDsl.holdFor;
import static io.gatling.javaapi.core.CoreDsl.reachRps;

@Slf4j
public class CreateOneUser extends Simulation {
    {
        setUp(
                new UserCreator().users(Integer.parseInt(System.getProperty("users", "9")))
        ).throttle(
                reachRps(10).in(10),
                holdFor(111111)
        );
    }
}
