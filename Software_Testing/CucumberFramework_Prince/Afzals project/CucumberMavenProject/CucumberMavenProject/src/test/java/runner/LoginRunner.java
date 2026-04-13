package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = {"stepdefinations","hooks"},
	tags = "@smoke",
			 plugin = {
				        "pretty",
				        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				    },
		monochrome = true
			
		
	)

public class LoginRunner extends AbstractTestNGCucumberTests {

	
	
	
	
}
