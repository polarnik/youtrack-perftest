package com.jetbrains.youtrack.perftest.scenario.api.admin.telemetry;

import org.testng.annotations.*;

public class GatlingMonitoringYoutrackTelemetryTest {
    @Test(groups = {"monitoring"})
    public void get_youtrack_metrics_and_send_to_telegraf() {
        System.out.println("Fast test");
    }
}
