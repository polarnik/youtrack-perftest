package com.jetbrains;

import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.BrowserBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.browserBuilder.ChromeDesktopBuilder;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy.FirstViewTestStrategy;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy.InitTestStrategy;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.strategy.TestStrategy;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.SiteSpeedAgrs;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.YouTrackConfig;
import com.jetbrains.youtrack.perftest.scenario.sitespeed.util.YouTrackUtil;
import org.testng.annotations.*;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.MessageFormat;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import static java.lang.StringTemplate.STR;

@Slf4j
public class SiteSpeedTest {
    String baseUrl = "https://youtrack.jetbrains.com";
    YouTrackConfig config;
    String mainChromeProfile;

    BrowserBuilder getChrome(String testName) {
        return new ChromeDesktopBuilder(this.config)
                .withViewPort(SiteSpeedAgrs.ViewPort.MacBook_Pro_2016_15)
                .withTimeout(Duration.ofMinutes(2))
                .withInfluxDBTag("test", testName);
    }

    @BeforeTest
    public void initDefaultChromeProfile() throws TimeoutException, IOException {
        TestStrategy strategy =
                new InitTestStrategy()
                        .withConfig(this.config)
                        .withBrowser(
                            getChrome("SiteSpeedTest.initDefaultChromeProfile")
                        );

        strategy.doTest(baseUrl, "MainPage");
        this.mainChromeProfile = ((InitTestStrategy)strategy).getBrowserProfilePath("MainPage");
    }

    @BeforeSuite
    public void getYouTrackVersion() throws IOException, InterruptedException {
        YouTrackUtil util = new YouTrackUtil();
        this.config = util.getConfig(baseUrl);

    }

    @Test(invocationCount = 1, singleThreaded = true)
    public void chromeFirstViewIssues() throws TimeoutException, IOException {
        new FirstViewTestStrategy()
                .withConfig(this.config)
                .withBrowser(getChrome("SiteSpeedTest.chromeFirstViewIssues"))
                .doTest(baseUrl + "/issues", "Issues");
    }


}
