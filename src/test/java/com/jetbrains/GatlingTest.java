package com.jetbrains;

import com.jetbrains.youtrack.perftest.simulation.api.admin.telemetry.TelemetrySimulation;
import io.gatling.app.Gatling;
import io.gatling.shared.cli.CliOption;
import io.gatling.shared.cli.GatlingCliOptions;
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
        runSimulation(TelemetrySimulation.class);
    }
}