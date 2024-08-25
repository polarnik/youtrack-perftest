package com.jetbrains;

import com.jetbrains.youtrack.perftest.simulation.api.admin.telemetry.TelemetrySimulation;
import io.gatling.app.Gatling;
import io.gatling.shared.cli.CliOption;
import io.gatling.shared.cli.GatlingCliOptions;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.testng.annotations.*;

public class GatlingTest {

    void runSimulation(Class simulationClass) {
        runSimulation(simulationClass, "");
    }

    void runSimulation(Class simulationClass, String description) {
        String[] gatlingArgs = {
                config(GatlingCliOptions.Simulation, simulationClass.getCanonicalName()),
                config(GatlingCliOptions.ResultsFolder, "target/load-test-results"),
                config(GatlingCliOptions.RunDescription, description)
        };
        Gatling.main(gatlingArgs);
    }
    private String config(CliOption option, String value) {
        return "--" + option.longName + "=" + value;
    }

    @Test(groups = {"monitoring"})
    public void get_hub_metrics_and_send_to_telegraf() {
        System.setProperty("youtrack", "https://nginx:443");
        System.setProperty("youtrack_token", "perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry");
        System.setProperty("telegraf", "http://telegraf:8090");
        System.setProperty("gatling.http.requestTimeout", "10000");
        System.setProperty("gatling.charting.indicators.lowerBound", "200");
        System.setProperty("gatling.charting.indicators.higherBound", "500");

        System.setProperty("duration", String.valueOf(24 * 60 * 60));
        System.setProperty("rps", String.valueOf(1));

        runSimulation(TelemetrySimulation.class);
    }

    @Test(groups = {"monitoring-debug-local"})
    public void get_hub_metrics_and_send_to_telegraf_DEBUG() {
        System.setProperty("youtrack", "https://127.0.0.1:443");
        System.setProperty("youtrack_token", "perm:YWRtaW4=.NDctMA==.H0e3bvoqo4HCePTiavxftedsE0M7ry");
        System.setProperty("telegraf", "http://127.0.0.1:8090");
        System.setProperty("gatling.ssl.useOpenSsl", "false");
        System.setProperty("gatling.data.console.writePeriod", "5");
        System.setProperty("gatling.http.requestTimeout", "800");
        System.setProperty("gatling.charting.indicators.lowerBound", "200");
        System.setProperty("gatling.charting.indicators.higherBound", "500");

        System.setProperty("duration", String.valueOf(3 * 60));
        System.setProperty("rps", String.valueOf(50));

        Logger root = (Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
        root.setLevel(Level.INFO);

        runSimulation(TelemetrySimulation.class);
    }
}