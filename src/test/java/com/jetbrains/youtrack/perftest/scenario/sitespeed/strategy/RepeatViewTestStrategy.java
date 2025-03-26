package com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.BrowserBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.OneShotStartupWaitStrategy;
import lombok.NonNull;
import org.testcontainers.containers.GenericContainer;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class RepeatViewTestStrategy extends AbstractTestStrategy implements TestStrategy{
    protected GenericContainer<?> getBrowserContainer(String url, String label) {
        BrowserBuilder browserBuilder = getBrowserBuilder()
                .withInfluxDBTag("CacheStatus", "RepeatView")
                .withName(label);
        GenericContainer<?> container = browserBuilder.build(url);
        @NonNull OneShotStartupWaitStrategy oneShotStartupWaitStrategy =
                new OneShotStartupWaitStrategy().withTimeout(Duration.ofMinutes(2));
        container.waitingFor(oneShotStartupWaitStrategy);
        return container;
    }




    @Override
    public void doTest(String url, String label) throws TimeoutException {
        try(GenericContainer<?> container = getBrowserContainer(url, label)) {
            container.start();
        }
    }
}
