package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.LocatorReader;

public class BasePage {
	public WebDriver driver;
	public LocatorReader locatorReader;
	
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		this.locatorReader = new LocatorReader("Locators\\homepage_locator.json");
		
	}
	
	public WebElement getElement(String key)
	{
		String type = locatorReader.getLocatorType(key);
		String value = locatorReader.getLocatorValue(key);
		switch(type)
		{
		case "id" : return driver.findElement(By.id(value));
		case "name" : return driver.findElement(By.name(value));
		case "xpath" : return driver.findElement(By.xpath(value));
		case "css" : return driver.findElement(By.cssSelector(value));
		case "linktext" :return driver.findElement(By.linkText(value));
		default : throw new IllegalArgumentException("Unsupported Locator Type :"+type);
		
		}
	}
	
	public void selectDropDownByVisibleText(String key , String visibleText)
	{
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchDropdownBox")));

		WebElement dropdown = getElement(key);
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(visibleText);
	}
	
	
	

}
