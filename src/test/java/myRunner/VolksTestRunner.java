package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		    features = {"C:\\eclipse\\Illumination\\Volks.com\\src/test\\resources\\volksLogin.feature"},
	        format = {"pretty" ,"json:target/cucumber.json"},
	        strict = false,
	        monochrome = true,
	        glue = {"volkStepDefinition"}
	             )

public class VolksTestRunner {

}
