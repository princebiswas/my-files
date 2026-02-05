package Pages;

import org.openqa.selenium.WebDriver;

public class FindAVehiclePage extends BasePage {


    public FindAVehiclePage(WebDriver driver) {

        super(driver,"find_a_vehicle_locator.json");
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
