package Pages;

import org.openqa.selenium.WebDriver;

public class DailyDealsPage extends BasePage{

    public DailyDealsPage(WebDriver driver) {
        super(driver, "daily_deals_locator.json");
    }


    public String DealHeader() {
        return getElement("SearchDeals").getText();
    }
}
