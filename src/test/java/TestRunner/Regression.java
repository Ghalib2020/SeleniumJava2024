package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(plugin = "json:target/cucumber-report.json",
		//plugin = "html:target/reports",
features="src/test/resources/Featuers",
glue={"StepDefinations"},
monochrome = true
)



public class Regression {

}
