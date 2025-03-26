package com.jetbrains.youtrack.perftest.scenario.sitespeed;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.OneShotStartupWaitStrategy;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.output.Slf4jLogConsumer;
import org.testcontainers.utility.DockerImageName;
import org.slf4j.Logger;

import java.util.concurrent.TimeoutException;

@Slf4j
public class FirstView implements SiteSpeedScenario {

    String getTags() {
        StringBuilder tags = new StringBuilder();
        tags
                .append("Version").append("=").append("2025.1")
                .append(",").append("Build").append("=").append("62967")
                .append(",").append("limitedRunData").append("=").append("false")
        ;
        return tags.toString();
    }

    @Override
    public GenericContainer<?> getChromeContainer(String name, String slug, String url, Logger logger) {
        StringBuilder command = new StringBuilder();
        // https://raw.githubusercontent.com/sitespeedio/sitespeed.io/refs/heads/main/docs/documentation/sitespeed.io/configuration/config.md
        command
                .append("--debugMessages")
                .append(" ").append("--verbose")
                // -b, --browsertime.browser, --browser
                // Choose which Browser to use when you test. Safari only works on Mac OS X and iOS 13 (or later).
                // [choices: "chrome", "firefox", "safari", "edge"]
                // [default: "chrome"]
                .append(" ").append("--browser").append(" ").append("chrome")
                // -n, --browsertime.iterations
                // How many times you want to test each page
                // [default: 3]
                .append(" ").append("--browsertime.iterations").append(" ").append("1")
                // --browsertime.spa, --spa
                // Convenient parameter to use if you test a SPA application: will automatically wait for X seconds after last network activity and use hash in file names. Read https://www.sitespeed.io/documentation/sitespeed.io/spa/
                // [boolean]
                // [default: false]
                .append(" ").append("--browsertime.spa").append(" ").append("true")
                // --browsertime.limitedRunData
                // Send only limited metrics from one run to the datasource.
                // [boolean]
                // [default: true]
                .append(" ").append("--browsertime.limitedRunData").append(" ").append("false")
                // --browsertime.viewPort, --viewPort
                // The browser view port size WidthxHeight like 400x300
                // [default: "1366x708"]
                .append(" ").append("--browsertime.viewPort").append(" ").append("1920x1080")
                // --browsertime.appendToUserAgent, --appendToUserAgent
                // Append a String to the user agent. Works in Chrome/Edge and Firefox.
                .append(" ").append("--appendToUserAgent").append(" ").append("crawler/1.0")
                // Plugins
                // List all configured plugins in the log.  [boolean]
                .append(" ").append("--plugins.list").append(" ").append("true")
                // Extra plugins that you want to run. Relative or absolute path to the plugin. Specify multiple plugin names separated by comma, or repeat the --plugins.add option
                // https://github.com/sitespeedio/plugin-influxdb
                .append(" ").append("--plugins.add").append(" ").append("@sitespeed.io/plugin-influxdb")
//                .append(" ").append("--influxdb.organisation").append(" ").append("youtrack")
//                .append(" ").append("--influxdb.token").append(" ").append("-F1qh_md8H07Fvo9uxtb_3D7ggAXYXFqy-N1G-TpbARKc0IFYW5WZ0ipE4UUrLP4MR87kPcjkDWO6KQtvwtY8Nw==")
                .append(" ").append("--influxdb.version").append(" ").append("2")
                .append(" ").append("--influxdb.tags").append(" ").append(getTags())

                .append(" ").append("--plugins.remove").append(" ").append("@sitespeed.io/plugin-lighthouse")

                .append(" ").append("--metrics.list").append(" ").append("true")
                .append(" ").append("--metrics.filterList").append(" ").append("true")

                // general
                // The decimal points browsertime statistics round to.  [number] [default: 0]
                .append(" ").append("--decimals").append(" ").append("3")


                // timeouts
                // Timeout when waiting for browser to start, in milliseconds  [number] [default: 60000]
                .append(" ").append("--timeouts.browserStart 60000").append(" ")
                // Timeout when waiting for url to load, in milliseconds  [number] [default: 300000]
                .append("--timeouts.pageLoad 300000").append(" ")
                // Timeout when running browser scripts, in milliseconds  [number] [default: 120000]
                .append("--timeouts.script 120000").append(" ")
                // Timeout when waiting for page to complete loading, in milliseconds  [number] [default: 120000]
                .append("--timeouts.pageCompleteCheck 120000").append(" ")
                // Timeout when running pageCompleteCheckNetworkIdle, in milliseconds  [number] [default: 5000]
                .append("--timeouts.networkIdle 5000").append(" ")

                .append("--timeouts.networkIdle 5000")

                .append(" ").append("--name").append(" ").append(name)
                .append(" ").append("--slug").append(" ").append(slug)
                .append(" ").append(url)

        ;
        Slf4jLogConsumer logConsumer = new Slf4jLogConsumer(logger);
        GenericContainer<?> chrome = new GenericContainer<>(
                DockerImageName.parse("sitespeedio/sitespeed.io:37.1.1-plus1"))
                .withEnv("MAX_OLD_SPACE_SIZE", "3072")
//                .withNetwork(Network.builder()
//                        .driver("bridge")
//                        .id("9d7ff5a79133a859aee62c7357e366a715e85d6406b536bdfe9c106ac5abbaf2")
//                        .build()
//                )
                .withFileSystemBind("target/sitespeed.io", "/sitespeed.io", BindMode.READ_WRITE);
        command
                .append(" ").append("--influxdb.protocol").append(" ").append("http")
                .append(" ").append("--influxdb.host").append(" ").append("host.docker.internal")
                .append(" ").append("--influxdb.port").append(" ").append("8091");
        chrome = chrome
                .withCommand(command.toString());
        chrome = chrome
                .withLogConsumer(logConsumer)
                ;
        chrome = chrome.withSharedMemorySize(2L * 1024 * 1024 * 1024);
        return chrome;
    }

    @Override
    public void startTest() throws TimeoutException {
        try (GenericContainer container = getChromeContainer("MainPage", "MainPage", "https://youtrack.jetbrains.com", log)) {
            @NonNull OneShotStartupWaitStrategy oneShotStartupWaitStrategy = new OneShotStartupWaitStrategy();
            container.waitingFor(oneShotStartupWaitStrategy);
            container.start();
//            WaitingConsumer resultConsumer = new WaitingConsumer();
//            container.followOutput(resultConsumer, STDOUT);
//            int waitDuration = 10;
//            resultConsumer.waitUntil(frame -> frame.getUtf8String().contains("[sitespeedio.plugin.html] HTML stored in"),
//                    waitDuration, TimeUnit.MINUTES);
        }
    }
}
