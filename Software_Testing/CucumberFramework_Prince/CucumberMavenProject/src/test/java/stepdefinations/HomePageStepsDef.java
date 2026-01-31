package stepdefinations;

import Pages.BasePage;
import Pages.HomePage;

import hooks.TestHooks;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageStepsDef  {

    HomePage homepage;
    WebDriver driver = TestHooks.driver;



    @Given("I navigate to the Ebay UI")
    public void iNavigateToTheEbayUI() {
        driver.get("https://www.ebay.com/");
        homepage = new HomePage(driver);
    }

    @And("I click on Shop by category")
    public void iClickOnShopByCategory() throws InterruptedException {
        homepage.ShopByCategory();
        Thread.sleep(1000);
    }

    @And("I select a product from Motors(.*)$" )
    public void iSelectAProductFromMotorsProduct(String Product1) throws InterruptedException {
    	homepage.SelectProduct(Product1);
       Thread.sleep(4000);
    }


//    @And("I click on all available links on the page")
//    public void iClickOnAllAvailableLinksOnThePage() {
//        // Get all the available Links
//        List<WebElement> links
//                = driver.findElements(By.tagName("a"));
//
//        // Iterating through all the Links and printing link
//        // text
//        for (WebElement link : links) {
//            //link.click();
//            System.out.println(link.getText());
//        }
//
//    }


    //@And("I select Make {string} from dropdown")
    @And("I select Make from dropdown (.*)$")
    public void iSelectMakeFromDropdown(String Make) throws InterruptedException {
        homepage.iSelectMakeFromDropdown(Make);
        Thread.sleep(4000);



    }

    @And("I enter ZIP code")
    public void iEnterZIPCode() throws InterruptedException {
        homepage.enterZipCode();
        Thread.sleep(2000);

    }


    @And("I select Model from dropdown (.*)$")
    public void iSelectModelFromDropdown(String Model) throws InterruptedException {
       homepage.selectModel(Model);
        Thread.sleep(4000);



    }

    @And("I select Conditions from dropdown (.*)$")
    public void iSelectConditionsFromDropdown(String Conditions) throws InterruptedException {
        homepage.selectConditions(Conditions);


    }
}
