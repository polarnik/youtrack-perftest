package com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.BrowserBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.InternalBrowserBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.OneShotStartupWaitStrategy;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.YouTrackConfig;
import lombok.Getter;
import lombok.NonNull;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;


@Getter
public class InitTestStrategy extends AbstractTestStrategy implements TestStrategy {


    @Override
    protected GenericContainer<?> getBrowserContainer(String url, String label) {
        InternalBrowserBuilder browserBuilder = (InternalBrowserBuilder) getBrowserBuilder();
        browserBuilder
                .withName(label)
        ;

        GenericContainer<?> container = browserBuilder.buildTmp(url);
        @NonNull OneShotStartupWaitStrategy oneShotStartupWaitStrategy =
                new OneShotStartupWaitStrategy().withTimeout(Duration.ofMinutes(2));
        container.waitingFor(oneShotStartupWaitStrategy);
        return container;
    }

    @Override
    public void doTest(String url, String label) throws TimeoutException {
        String path = getBrowserProfilePath(label);
        if(FileUtils.isDirectory(new File(path))) {
            return;
        } else {
            try (GenericContainer<?> container = getBrowserContainer(url, label)) {
                container.withFileSystemBind(getOutputPath(label), "/sitespeed.io", BindMode.READ_WRITE);
                container.withFileSystemBind(getBrowserProfilePath(label), "/browserProfile", BindMode.READ_WRITE);
                container.start();
            }
        }
    }
}
