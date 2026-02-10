package Pages;

import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {


    public SearchPage(WebDriver driver) {

        super(driver,"SearchPage_locator.json");
    }

    public String getSearchHeader()    {

        return getElement("SearchHeader").getText();
    }
    //return getElement("SearchHeader").getText();

    public void SearchForAProduct(String Product) {
        getElement("SearchForAProduct").sendKeys(Product);
    }

    public void ClickOnSearchbutton() {

        getElement("ClickOnSearchbutton").click();
    }

}
