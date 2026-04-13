package Pages;

import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getSearchHeader()
	{
		return getElement("searchHeader").getText();
	}

}
