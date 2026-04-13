package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void SearchFor(String searchvalue)
	{
		
		getElement("searchbox").sendKeys(searchvalue);
		getElement("searchbutton").click();
		
	}
	
	public void selectSearchCategory(String category)
	{
		selectDropDownByVisibleText("searchCategory",category);
	}
	

}
