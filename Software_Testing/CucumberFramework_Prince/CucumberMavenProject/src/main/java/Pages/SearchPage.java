package Pages;

import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {


    public SearchPage(WebDriver driver) {
        super(driver,"Searchpage_locator.json");
    }

    public void SearchForAProduct(String Product) {
        getElement("SearchForAProduct").sendKeys(Product);
    }

    public void ClickOnSearchbutton() {
        getElement("ClickOnSearchbutton").click();
    }

   // public String getSearchHeader() {
   //    return getElement("SearchHeader").getText();
   // }

    public String getSearchHeader()    {
       String ExpectedValue=  getElement("SearchHeader").getText();
       return ExpectedValue;
    }



}
