package com.jetbrains.youtrack.perftest.scenario.sitespeed.util;

import org.testcontainers.containers.startupcheck.OneShotStartupCheckStrategy;
import org.testcontainers.containers.wait.strategy.AbstractWaitStrategy;

import java.time.Duration;

public class OneShotStartupWaitStrategy extends AbstractWaitStrategy {
    Duration timeout;
    public OneShotStartupWaitStrategy withTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }
    Duration getTimeout() {
        if(timeout == null) {
            return Duration.ofMinutes(1);
        }
        else {
            return timeout;
        }
    }

    @Override
    protected void waitUntilReady() {
        if (!new OneShotStartupCheckStrategy()
                .withTimeout(getTimeout())
                .waitUntilStartupSuccessful(
                        waitStrategyTarget.getDockerClient(),
                        waitStrategyTarget.getContainerId()
                )
        ) {
            // throw an exception to indicate failure
        }
    }
}
