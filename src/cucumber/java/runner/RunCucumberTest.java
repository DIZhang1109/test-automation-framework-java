package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Di on 11/01/18.
 * Cucumber JUnit runner
 *
 * @author Di
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/java/features",
        glue = "stepdefs",
        plugin = {"pretty", "json:build/cucumber-reports/json-report/cucumber.json", "usage:build/cucumber-reports/json-report/cucumber-usage.json"})
public class RunCucumberTest {
}
