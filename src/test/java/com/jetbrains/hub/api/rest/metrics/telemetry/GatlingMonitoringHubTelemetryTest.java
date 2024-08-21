package com.jetbrains.hub.api.rest.metrics.telemetry;

import org.testng.annotations.*;

public class GatlingMonitoringHubTelemetryTest {
    @Test(groups = {"monitoring"})
    public void get_hub_metrics_and_send_to_telegraf() {
        System.out.println("Fast test");
    }
}