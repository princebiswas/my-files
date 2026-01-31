package hooks;

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

public class TestHooks {
	
	public static WebDriver driver;
	
	
	@Before
	public void SetUp()
	{
		
		driver = new ChromeDriver();
	}
	
	@AfterStep
	public void takeScreenshotonFailure(Scenario scenario)
	{
		if(scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Failed step screenshot");
			try {
				String ts= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyymmdd_HHmmss_SSS"));
				Path outDir = Path.of("target/extentreport/screenshots");
				Files.createDirectories(outDir);
				Files.write(outDir.resolve("FAIL_"+ts+".png"),
						((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	@After
	public void CleanUp()
	{
		if(driver!=null)
		{
			driver.quit();
		}
		
	}

}
