package com.jetbrains.youtrack.perftest.simulation.createTask;

import com.jetbrains.youtrack.perftest.scenario.createTask.TaskCreator;
import io.gatling.javaapi.core.Simulation;

public class Create_100_000_Tasks extends Simulation {
    {
        setUp(
                new TaskCreator().tasks_100_000()
        );
    }
}
