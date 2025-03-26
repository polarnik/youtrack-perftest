package com.jetbrains.youtrack.perftest.scenario.sitespeed.util;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

@Slf4j
public class SiteSpeedAgrs {
    StringBuilder commands;
    ViewPort viewPort;

    public SiteSpeedAgrs() {
        this.commands = new StringBuilder();
        this.setDefaultArgs();
    }

    public SiteSpeedAgrs withCustomArgs(@NotNull String key, @NotNull String value) {
        this.commands.append(" ").append(key).append(" ").append(value);
        return this;
    }

    public void withOutputFolder(String outputFolder) {
        // The folder where the result will be stored.
        // If you do not set it, the result will be stored in "DOMAIN_OR_FILENAME_OR_SLUG/TIMESTAMP"  [string]
        commands.append(" ").append("--outputFolder").append(" ").append(outputFolder);
    }

    public enum ViewPort {
        HD("1920x1080", "HD"),
        MacBook_Pro_2016_15("1440x900", "MacBook Pro 2016 15"),
        MacBook_Air_2018_13("1280x800", "MacBook Air 2018 13"),
        Apple_iPad_Pro_12_9_2020("1024x1366", "Apple iPad Pro 12.9 (2020)")
        ;

        private final String viewPort;
        private final String name;
        ViewPort(String viewPort, String name) {
            this.viewPort = viewPort;
            this.name = name;
        }

        @Override
        public String toString() {
            return viewPort;
        }
    }


    void setDefaultArgs() {
        // Send only limited metrics from one run to the datasource.
        // [boolean]
        // [default: true]
        commands.append("--browsertime.limitedRunData").append(" ").append("false");
        // --browsertime.appendToUserAgent, --appendToUserAgent
        // Append a String to the user agent. Works in Chrome/Edge and Firefox.
        commands.append(" ").append("--appendToUserAgent").append(" ").append("crawler/1.0");
        // -n, --browsertime.iterations
        // How many times you want to test each page
        // [default: 3]
        commands.append(" ").append("--browsertime.iterations").append(" ").append("1");
        // --browsertime.spa, --spa
        // Convenient parameter to use if you test a SPA application: will automatically wait for X seconds after last network activity and use hash in file names. Read https://www.sitespeed.io/documentation/sitespeed.io/spa/
        // [boolean]
        // [default: false]
        commands.append(" ").append("--browsertime.spa").append(" ").append("true");
    }

    public SiteSpeedAgrs withViewPort(ViewPort viewPort) {
        this.viewPort = viewPort;

        // --browsertime.viewPort, --viewPort
        // The browser view port size WidthxHeight like 400x300
        // [default: "1366x708"]
        commands.append(" ").append("--browsertime.viewPort").append(" ").append(this.viewPort.toString());

        return this;
    }

    public SiteSpeedAgrs withName(String name) {
        commands.append(" ").append("--name").append(" ").append(name);
        commands.append(" ").append("--slug").append(" ").append(name);
        return this;
    }

    public String build(String url) {
        commands.append(" ").append(url);
        String output = commands.toString().strip();
        log.info("**************** commands: {}", output);
        return output;

    }

    public SiteSpeedAgrs withInfluxDB(String tags) {
        commands.append(" ").append("--plugins.add").append(" ").append("@sitespeed.io/plugin-influxdb")
                .append(" ").append("--influxdb.protocol").append(" ").append("http")
                .append(" ").append("--influxdb.version").append(" ").append("2")
                .append(" ").append("--influxdb.host").append(" ").append("host.docker.internal")
                .append(" ").append("--influxdb.port").append(" ").append("8091");

        commands.append(" ").append("--influxdb.tags").append(" ").append(tags);
        return this;
    }
}
