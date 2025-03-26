package com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.SiteSpeedAgrs;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.YouTrackConfig;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.testcontainers.containers.GenericContainer;

import java.time.Duration;
import java.util.HashMap;

@Slf4j
public abstract class AbstractBrowserBuilder implements BrowserBuilder, InternalBrowserBuilder {

    public AbstractBrowserBuilder(YouTrackConfig config) {
        siteSpeedAgrs = new SiteSpeedAgrs();

        this.withInfluxDBTag("youtrack_build", config.build);
        this.withInfluxDBTag("youtrack_version", config.version);
        this.withInfluxDBTag("youtrack_readOnly", String.valueOf(config.readOnly));
    }

    SiteSpeedAgrs siteSpeedAgrs;
    Logger logger;
    Duration timeout;
    HashMap<String, String> influxdbTags = new HashMap<>();
    SiteSpeedAgrs.ViewPort viewPort;
    String name;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public Duration getTimeout() {
        return timeout;
    }
    @Override
    public String getInfluxDBTags() {
        if(influxdbTags.isEmpty())
            return "";
        else {
            StringBuilder tags = new StringBuilder();
            for(String key : influxdbTags.keySet()) {
                if(!tags.isEmpty()) {
                    tags.append(",");
                }
                tags.append(key).append("=").append(influxdbTags.get(key));
            }
            return tags.toString();
        }
    }

    @Override
    public SiteSpeedAgrs.ViewPort getViewPort() {
        return viewPort;
    }

    @Override
    public Logger getLogger() {
        if (logger == null) {
            return log;
        } else {
            return logger;
        }
    }

    @Override
    public abstract GenericContainer<?> build(String url);

    @Override
    public BrowserBuilder withLogger(Logger logger) {
        this.logger = logger;
        return this;
    }

    @Override
    public BrowserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BrowserBuilder withInfluxDBTag(String key, String value) {
        if(influxdbTags.containsKey(key)) {
            influxdbTags.replace(key, value);
        } else {
            influxdbTags.put(key, value);
        }
        return this;
    }

    @Override
    public BrowserBuilder withViewPort(SiteSpeedAgrs.ViewPort viewPort) {
        this.viewPort = viewPort;
        this.withInfluxDBTag("viewPort", viewPort.toString());
        return this;
    }

    @Override
    public BrowserBuilder withTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }
}
