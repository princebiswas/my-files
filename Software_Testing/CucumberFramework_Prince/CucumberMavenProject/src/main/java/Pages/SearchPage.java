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

    public void ClickOnSearchbutton() throws InterruptedException {
        getElement("ClickOnSearchbutton").click();
    }

    public void selectYearForm(int year) {
        getElement("SelectYearForm").sendKeys("2000");
    }

    public void selectYearTo(int year) {
        getElement("SelectYearTo").sendKeys("2010");
    }

    public void selectDistance(String Distance) {
        SelectDropdownByVisibleText("SelectDistance", Distance);
    }

    public void ClickOnFindVehicleButton() {
        getElement("ClickOnFindVehicleButton").click();
    }

    public void make_dropdown(String Make) throws InterruptedException {
        Thread.sleep(1000);
        getElement("make_Dropdown").click();
        Thread.sleep(2000);
        SelectDropdownByValue("make_Dropdown", Make);
    }
}
