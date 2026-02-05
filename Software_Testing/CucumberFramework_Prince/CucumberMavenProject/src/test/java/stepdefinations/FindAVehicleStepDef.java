package stepdefinations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.FindAVehiclePage;
import hooks.TestHooks;
import io.cucumber.java.en.And;

public class FindAVehicleStepDef {
	

	 FindAVehiclePage fav;
	 HomePage homepage;

	 WebDriver driver = TestHooks.driver;

	@And("Search for a Product(.*)$" )
	public void iSearchForAProduct(String Product) throws InterruptedException {
		fav.SearchForAProduct(Product);
		Thread.sleep(1000);
	}

	@And("Click on Search")
	public void ClickOnSearchbutton() throws InterruptedException {
		fav.ClickOnSearchbutton();
		homepage = new HomePage(driver);
		Thread.sleep(1000);
	}
	@Then("I should see the result in search page for validation (.*)$")
	public void I_should_see_the_result_in_search_page_for_validation(String Product) throws InterruptedException {
		// assertTrue(searchpage.getSearchHeader().contains(Product));
		assertEquals(fav.getSearchHeader(),Product);
		Thread.sleep(1000);
	}
}
