package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features = "src/test/resources/features",
            glue = {"stepdefinations", "hooks"},
            plugin = {"pretty","html:target/cucumber-reports.html"},
            tags = "@Smoke",
			monochrome = true

			)
	
	public class TestRunner extends AbstractTestNGCucumberTests{



	

}
