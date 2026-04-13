package hooks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ConfigReader;

public class TestHooks {
	
	public static WebDriver driver;
	
	
	@Before
	public void SetUp() throws IOException {
		
		if (driver == null) {
			driver = new ChromeDriver();
			ConfigReader.loadConfig();
			driver.get(ConfigReader.getBaseUrl());
			driver.manage().window().maximize();
		}
	}
	
	@AfterStep
	public void AfterEachStep(Scenario scenario) {
		takeScreenshotonFailure(scenario);
	}
	
	public void takeScreenshotonFailure(Scenario scenario)
	{
		if(scenario.isFailed()) {
			if (driver != null) {
				try {
					byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", "Failed step screenshot");
				} catch (Exception e) {
					System.out.println("Unable to take screenshot: " + e.getMessage());
				}
				
				try {
					String ts= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyymmdd_HHmmss_SSS"));
					Path outDir = Path.of("target/extentreport/screenshots");
					Files.createDirectories(outDir);
					Files.write(outDir.resolve("FAIL_"+ts+".png"),
							((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
				}
				catch(Exception e)
				{
					System.out.println("Error saving screenshot file: " + e.getMessage());
				}
			}
		}
	}
	
	@After
	public void CleanUp()
	{
		// Keep driver open between scenarios for reusability
		// The driver will be closed only when all scenarios complete
		if (driver != null) {
			try {
				// Verify driver is still accessible
				driver.getCurrentUrl();
			} catch (Exception e) {
				System.out.println("Driver is already closed or inaccessible: " + e.getMessage());
				driver = null;
			}
		}
		// Uncomment below if you want to close driver after each scenario
		// if(driver!=null)
		// {
		//	driver.quit();
		//	driver = null;
		// }
	}

}
