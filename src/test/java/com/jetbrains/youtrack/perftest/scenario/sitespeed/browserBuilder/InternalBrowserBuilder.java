package com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.SiteSpeedAgrs;
import org.slf4j.Logger;
import org.testcontainers.containers.GenericContainer;

import java.time.Duration;

public interface InternalBrowserBuilder extends BrowserBuilder {
    String getName();
    Logger getLogger();
    SiteSpeedAgrs.ViewPort getViewPort();
    Duration getTimeout();
    String getInfluxDBTags();
    GenericContainer<?> buildTmp(String url);
}
