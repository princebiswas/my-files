package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver,"homepage_locator.json");
		
	}
	public void ShopByCategory()
	{

		getElement("ShopByCategory").click();
	}
	
	public void SelectProduct(String Product1)
	{

		getElement("Motorcycle").click();
	}
	
	public void enterZipCode()	{
		getElement("ZipCode").clear();
		getElement("ZipCode").sendKeys("20903");
	}

	public void selectConditions(String conditions) {
		//getElement("Conditions").click();
		SelectDropdownByVisibleText("Conditions", conditions);
	}

	public void iSelectMakeFromDropdown(String Make) {

		SelectDropdownByVisibleText("SelectMakeFromDropdown", Make);
	}

	public void selectModel(String Model) {

		SelectDropdownByVisibleText("SelectModelFromDropdown", Model);
	}


}
