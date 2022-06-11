package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/main/resources/features",
		glue = {"stepdefinitions"},
		plugin = {"pretty", "json:target/cucumber-reports"},
		monochrome = true
)
public class TestRunner {

}
