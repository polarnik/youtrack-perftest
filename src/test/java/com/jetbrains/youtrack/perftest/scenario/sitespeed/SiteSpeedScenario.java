package com.jetbrains.youtrack.perftest.scenario.sitespeed;

import org.slf4j.Logger;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.containers.output.WaitingConsumer;
import org.testcontainers.utility.DockerImageName;

import java.util.concurrent.TimeoutException;

public interface SiteSpeedScenario {
    GenericContainer getChromeContainer(String name, String slug, String url, Logger logger);

    void startTest() throws TimeoutException;
}
