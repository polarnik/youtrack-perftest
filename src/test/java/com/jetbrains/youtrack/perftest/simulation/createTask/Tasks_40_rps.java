package com.jetbrains.youtrack.perftest.simulation.createTask;

import com.jetbrains.youtrack.perftest.scenario.createTask.TaskCreator;
import io.gatling.javaapi.core.Simulation;

public class Tasks_40_rps extends Simulation {
    {
        setUp(
                new TaskCreator().tasks_40_rps()
        );
    }
}