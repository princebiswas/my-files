package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class AutoPage extends Helper{
	
	public WebElement element = null;
	
	
	public AutoPage (WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement Make_dropdown()
	{
		element = getElementByName("Make");
		return element;
		
	}
	
	public WebElement Engine_Performance_Text_box()
	{
		element = getElementById("engineperformance");
		return element;
		
	}
	
	public WebElement Date_of_manufacture()
	{
		element = getElementByXpath("//a[text()='31']");
		return element;
		
	}
	
	public WebElement Number_of_Seats()
	{
		element = getElementById("numberofseats");
		return element;
		
	}
	
	public WebElement Fuel_Type()
	{
		element = getElementById("fuel");
		return element;
		
	}
	
	public WebElement List_Price()
	{
		element = getElementById("listprice");
		return element;
		
	}
	
	public WebElement Licence_Plate_Number()
	{
		element = getElementById("licenseplatenumber");
		return element;
		
	}
	
	public WebElement Annual_Milage()
	{
		element = getElementById("annualmileage");
		return element;
		
	}
	
	public WebElement Click_on_Next()
	{
		element = getElementById("nextenterinsurantdata");
		return element;
		
	}
	
	
}
