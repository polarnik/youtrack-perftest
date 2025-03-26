package com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.BrowserBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.ChromeDesktopBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.OneShotStartupWaitStrategy;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.YouTrackConfig;
import lombok.NonNull;
import org.testcontainers.containers.GenericContainer;

import java.net.URL;
import java.time.Duration;

public abstract class AbstractTestStrategy implements TestStrategy {
    protected BrowserBuilder browserBuilder;
    protected YouTrackConfig config;
    protected String pre_url;
    protected String pre_label;

    @Override
    public TestStrategy withConfig(YouTrackConfig config) {
        this.config = config;
        return this;
    }

    @Override
    public TestStrategy withPreTest(
            String url,
            String label
    ) throws UnsupportedOperationException {
        this.pre_url = url;
        this.pre_label = label;
        return this;
    }

    @Override
    public TestStrategy withBrowser(BrowserBuilder browserBuilder) {
        this.browserBuilder = browserBuilder;
        return this;
    }

    public String getBrowserProfilePath(String label) {
        return String.format("target/browserProfile/%s.%s.%s",
                label,
                config.getVersion(),
                config.getBuild()
        );
    }

    protected String getOutputPath(String label) {
        return String.format("target/sitespeed.io/%s.%s.%s",
                label,
                config.getVersion(),
                config.getBuild()
        );
    }

    protected BrowserBuilder getBrowserBuilder() {
        if(browserBuilder == null) {
            browserBuilder = new ChromeDesktopBuilder(this.config);
        }
        return browserBuilder;
    }

    protected abstract GenericContainer<?> getBrowserContainer(String url, String label);

}
