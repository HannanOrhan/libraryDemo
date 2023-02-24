package com.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        publish = true,
        features = "src/test/resources/features",
        glue = "com/library/step_definition",
        dryRun = false,
        tags = ""
)
public class CukesRunner {
}
