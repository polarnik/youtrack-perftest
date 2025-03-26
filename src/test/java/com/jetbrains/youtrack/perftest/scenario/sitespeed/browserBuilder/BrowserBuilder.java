package com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.SiteSpeedAgrs;
import org.slf4j.Logger;
import org.testcontainers.containers.GenericContainer;

import java.time.Duration;

public interface BrowserBuilder {
    GenericContainer<?> build(String url);
    BrowserBuilder withName(String name);
    BrowserBuilder withLogger(Logger logger);
    BrowserBuilder withInfluxDBTag(String key, String value);
    BrowserBuilder withViewPort(SiteSpeedAgrs.ViewPort viewPort);
    BrowserBuilder withTimeout(Duration timeout);
}
