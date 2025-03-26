package com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.BrowserBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.YouTrackConfig;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeoutException;

public interface TestStrategy {

    TestStrategy withConfig(YouTrackConfig config);

    TestStrategy withBrowser(BrowserBuilder browserBuilder);

    TestStrategy withPreTest(
            String url,
            String label
    ) throws UnsupportedOperationException;

    void doTest(
            String url,
            String label
    ) throws TimeoutException, IOException;

}
