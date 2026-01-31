package stepdefinations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.SearchPage;
import hooks.TestHooks;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class SearchPageStepDef {
	

	 SearchPage searchpage;
	 WebDriver driver = TestHooks.driver;
	
	 	@And("Search for a Product(.*)$" )
	    public void iSearchForAProduct(String Product) throws InterruptedException {
            searchpage = new SearchPage(driver);
	    	searchpage.SearchForAProduct(Product);

	       Thread.sleep(4000);
	    }

	    @And("Click on Search")
	    public void ClickOnSearchbutton() throws InterruptedException {
	    	searchpage.ClickOnSearchbutton();
	       Thread.sleep(4000);
	    }
	    
	    @And("I should see the result in search page for validation (.*)$")
	    public void I_should_see_the_result_in_search_page_for_validation(String Product) throws InterruptedException {
	   // assertTrue(searchpage.getSearchHeader().contains(Product));

        assertEquals(searchpage.getSearchHeader(),Product);


        Thread.sleep(2000);

	    }

}
