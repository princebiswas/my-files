package process;

import org.openqa.selenium.WebDriver;

import pageobject.AutoPage;
import utility.Helper;

public class AutoProcess extends Helper {
	
	AutoPage apg = new AutoPage(driver);

	public AutoProcess(WebDriver driver) {
		super(driver);
		
		
	}
	
	public void Make_dropdown() 
	{
		apg.Make_dropdown().
	}
	
	
	
	
	
	
	
	

}
