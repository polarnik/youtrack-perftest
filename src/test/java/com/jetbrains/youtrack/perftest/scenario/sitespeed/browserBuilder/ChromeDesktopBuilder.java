package com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.SiteSpeedAgrs;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.YouTrackConfig;
import org.slf4j.Logger;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.utility.DockerImageName;

public class ChromeDesktopBuilder  extends AbstractBrowserBuilder {
    public ChromeDesktopBuilder(YouTrackConfig config) {
        super(config);
    }

    @Override
    public GenericContainer<?> build(String url) {
        GenericContainer<?> chrome = buildTmp(url);
        if(getName() != null) {
            siteSpeedAgrs.withName(getName());
        }
        if(getViewPort() != null) {
            siteSpeedAgrs.withViewPort(getViewPort());
            this.withInfluxDBTag("ViewPort", getViewPort().toString());
        }
        String tags = getInfluxDBTags();
        if(!tags.isEmpty()) {
            siteSpeedAgrs.withInfluxDB(tags);
        }
        siteSpeedAgrs.withOutputFolder("/sitespeed.io");
        siteSpeedAgrs.withCustomArgs("--browsertime.chrome.args", "user-data-dir=/browserProfile");
        siteSpeedAgrs.withCustomArgs("--browsertime.chrome.args", "enable-logging");
        siteSpeedAgrs.withCustomArgs("--browsertime.chrome.args", "enable-sandbox-logging");
        siteSpeedAgrs.withCustomArgs("--browsertime.chrome.args", "log-level=0");
        chrome.withCommand(this.siteSpeedAgrs.build(url));
        return chrome;
    }

    @Override
    public GenericContainer<?> buildTmp(String url) {
        Slf4jLogConsumer logConsumer = new Slf4jLogConsumer(this.getLogger());
        GenericContainer<?> chrome = new GenericContainer<>(
                DockerImageName.parse("sitespeedio/sitespeed.io:37.1.1-plus1"));
        chrome.withEnv("MAX_OLD_SPACE_SIZE", "3072");
        chrome.withLogConsumer(logConsumer);
        chrome.withSharedMemorySize(2L * 1024 * 1024 * 1024);
        SiteSpeedAgrs siteSpeedAgrsTmp = new SiteSpeedAgrs();
        siteSpeedAgrsTmp.withOutputFolder("/sitespeed.io");
        siteSpeedAgrsTmp.withCustomArgs("--browsertime.chrome.args", "user-data-dir=/browserProfile");
        siteSpeedAgrsTmp.withCustomArgs("--browsertime.chrome.args", "enable-logging");
        siteSpeedAgrsTmp.withCustomArgs("--browsertime.chrome.args", "enable-sandbox-logging");
        siteSpeedAgrsTmp.withCustomArgs("--browsertime.chrome.args", "log-level=0");
        chrome.withCommand(siteSpeedAgrsTmp.build(url));
        return chrome;
    }
}
