package Pages;

import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver,"SearchPage_locator.json");
    }

    public String getSearchHeader()    {
        return getElement("SearchHeader").getText();
    }

    public void SearchForAProduct(String Product) {
        getElement("SearchForAProduct").sendKeys(Product);
    }

    public void ClickOnSearchbutton() throws InterruptedException {
        getElement("ClickOnSearchbutton").click();
    }

    public void selectYearForm() throws InterruptedException {
        getElement("SelectYearForm").sendKeys("2010");
        Thread.sleep(1000);
    }

    public void selectYearTo() throws InterruptedException {
        getElement("SelectYearTo").sendKeys("2020");
        Thread.sleep(1000);
    }

    public void selectDistance() {
        SelectDropdownByVisibleText("SelectDistance", "1000 Miles");
        //getElement("select_Distance_1000").click();
    }

    public void ClickOnFindVehicleButton() {
        getElement("ClickOnFindVehicleButton").click();
    }

    public void make_dropdown() throws InterruptedException {
        Thread.sleep(1000);
        getElement("make_Dropdown").click();
        Thread.sleep(2000);
        SelectDropdownByVisibleText("make_Dropdown", "Honda");
    }

    public void model_dropdown() throws InterruptedException {
        Thread.sleep(1000);
        getElement("model_Dropdown").click();
        Thread.sleep(2000);
        SelectDropdownByVisibleText("model_Dropdown","CB1100");
    }

    public boolean Make_DropdownIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return getElement("make_Dropdown").isDisplayed();
    }

    public boolean model_dropdownIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        return getElement("model_Dropdown").isDisplayed();
    }

    public void zipcode() {
        getElement("zipCode").sendKeys("20903");
    }
}
