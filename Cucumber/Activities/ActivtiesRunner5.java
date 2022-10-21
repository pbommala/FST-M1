package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
    glue = {"stepDefinitions"},
    tags = "@activity5",
    plugin = {"html: test-report-Activity5"},
    monochrome = true
)
	
 
public class ActivtiesRunner5 {
//empty
}