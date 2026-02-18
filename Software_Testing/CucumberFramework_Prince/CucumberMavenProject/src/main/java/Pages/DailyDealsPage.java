package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DailyDealsPage extends BasePage{

    public DailyDealsPage(WebDriver driver) {
        super(driver, "daily_deals_locator.json");
    }


    public String DealHeader() {
        return getElement("SearchDeals").getText();
    }

    public void hover_featured() {
        WebElement Men = driver.findElement(By.xpath("//span[contains(text(),'Featured')]"));

        Actions act = new Actions(driver);
        act.moveToElement(Men).perform();

    }
}
