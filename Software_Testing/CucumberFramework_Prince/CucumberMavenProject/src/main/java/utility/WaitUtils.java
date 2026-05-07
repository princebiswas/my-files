package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private  static final int TimeOut_seconds = 10;

    public static WebElement waitForElementVisibility(WebDriver driver, By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut_seconds));

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static WebElement waitForElementClickable(WebDriver driver, By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeOut_seconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
