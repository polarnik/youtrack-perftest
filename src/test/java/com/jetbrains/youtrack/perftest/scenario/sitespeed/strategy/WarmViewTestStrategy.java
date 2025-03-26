package com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.BrowserBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.OneShotStartupWaitStrategy;
import lombok.NonNull;
import org.apache.commons.io.FileUtils;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class WarmViewTestStrategy extends AbstractTestStrategy implements TestStrategy {
    protected GenericContainer<?> getBrowserContainer(String url, String label) {
        BrowserBuilder browserBuilder = getBrowserBuilder()
                .withInfluxDBTag("CacheStatus", "WarmView")
                .withName(label);
        GenericContainer<?> container = browserBuilder.build(url);

        @NonNull OneShotStartupWaitStrategy oneShotStartupWaitStrategy =
                new OneShotStartupWaitStrategy().withTimeout(Duration.ofMinutes(2));
        container.waitingFor(oneShotStartupWaitStrategy);
        return container;
    }

    String getDomainNameFromUrl(String url) throws URISyntaxException {
        URI uri = new URI(url);
        return uri.getScheme() + "://" + uri.getHost() + ":" + uri.getPort();
    }

    @Override
    public void doTest(String url, String label) throws TimeoutException, IOException {
        String pre_path = getBrowserProfilePath(pre_label);
        if(FileUtils.isDirectory(new File(pre_path))) {
            return;
        } else {
            TestStrategy strategy =
                    new InitTestStrategy();

            strategy.doTest(pre_url, pre_label);
        }
        if(FileUtils.isDirectory(new File(pre_path))) {
            if(FileUtils.isDirectory(new File(getBrowserProfilePath(label)))) {
                if(!FileUtils.isEmptyDirectory(new File(getBrowserProfilePath(label)))) {
                    FileUtils.deleteDirectory(new File(getBrowserProfilePath(label)));
                    FileUtils.createParentDirectories(new File(getBrowserProfilePath(label)));
                }
            }
            FileUtils.copyDirectory(
                    new File(getBrowserProfilePath(pre_label)),
                    new File(getBrowserProfilePath(label))
            );
        }
        try(GenericContainer<?> container = getBrowserContainer(url, label)) {
            container.withFileSystemBind(getOutputPath(label), "/sitespeed.io", BindMode.READ_WRITE);
            container.withFileSystemBind(getBrowserProfilePath(label), "/browserProfile", BindMode.READ_WRITE);
            container.start();
        }
    }
}
