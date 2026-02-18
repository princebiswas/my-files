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

    @And("I hover on Featured")
    public void i_hover_on_Featured() {
        ddp = new DailyDealsPage(driver);
        ddp.hover_featured();

    }
    @Then("I click on Deals on #3D printer link")
    public void i_click_on_Deals_on_3d_printer_link() {

    }



}
