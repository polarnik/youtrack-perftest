package com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.BrowserBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.OneShotStartupWaitStrategy;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.SiteSpeedAgrs;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.YouTrackConfig;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

@Slf4j
public class FirstViewTestStrategy extends AbstractTestStrategy implements TestStrategy {

    protected GenericContainer<?> getBrowserContainer(String url, String label) {
        BrowserBuilder browserBuilder = getBrowserBuilder()
                .withInfluxDBTag("CacheStatus","FirstView")
                .withName(label);
        GenericContainer<?> container = browserBuilder.build(url);
        container.withFileSystemBind(getOutputPath(label), "/sitespeed.io", BindMode.READ_WRITE);
        container.withFileSystemBind(getBrowserProfilePath(label), "/browserProfile", BindMode.READ_WRITE);

        @NonNull OneShotStartupWaitStrategy oneShotStartupWaitStrategy =
                new OneShotStartupWaitStrategy().withTimeout(Duration.ofMinutes(2));
        container.waitingFor(oneShotStartupWaitStrategy);
        return container;
    }

    @Override
    public TestStrategy withPreTest(
            String url,
            String label
    ) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void doTest(String url, String label) throws TimeoutException  {
        try(GenericContainer<?> container = getBrowserContainer(url, label)) {
            container.start();
        }
    }
}
