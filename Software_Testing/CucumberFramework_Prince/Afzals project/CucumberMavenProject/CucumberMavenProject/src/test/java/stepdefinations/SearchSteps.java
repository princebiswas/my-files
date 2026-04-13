package stepdefinations;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.SearchPage;
import hooks.TestHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	HomePage homepage;
	WebDriver driver = TestHooks.driver;
	SearchPage searchpage;
	
	
	@Given("I am on the Amazon Homepage")
	public void i_am_on_the_amazonhomepage() throws InterruptedException
	{
		//driver.get("https://amazon.com/");
		Thread.sleep(6000);
		homepage = new HomePage(driver);
	}
	
	@When("I search for {string}")
	public void i_search_for(String keyword)
	{
		homepage.SearchFor(keyword);
		searchpage = new SearchPage(driver);
		
	}
	
	@Then("I should see result for {string} on search page")
	public void i_should_result_for(String keyword)
	{
		assertTrue(searchpage.getSearchHeader().contains(keyword));
		
	}
	
	@When("I select {string} from the search dropdown")
	public void i_select_dropdown(String category) throws InterruptedException
	{
		homepage = new HomePage(driver);
		homepage.selectSearchCategory(category);
		Thread.sleep(6000);
	}

	
}
