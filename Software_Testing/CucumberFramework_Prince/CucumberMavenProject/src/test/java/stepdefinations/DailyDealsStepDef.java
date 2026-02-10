package stepdefinations;

import Pages.DailyDealsPage;
import hooks.TestHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;


public class DailyDealsStepDef {
    DailyDealsPage ddp;
    WebDriver driver = TestHooks.driver;

    @Given("I should see the result in search page for validation")
    public void i_should_see_the_result_in_search_page_for_validation() {
       ddp = new DailyDealsPage(driver);
       ddp.DealHeader();
    }


    @And("I click on Featured")
    public void i_click_on_Featured() {

    }
    @Then("I click on Deals on #3D printer link")
    public void i_click_on_Deals_on_3d_printer_link() {

    }



}
