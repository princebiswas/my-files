package stepdefinations;

import static org.junit.jupiter.api.Assertions.assertEquals;


import io.cucumber.java.en.Then;

import Pages.SearchPage;
import hooks.TestHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.Scenario;
import io.cucumber.java.Before;

public class SearchPageStepDef  {


	SearchPage searchpage;
	private Scenario scenario;

	@Before
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

    @And("Search for a Product(.*)$" )
	public void iSearchForAProduct(String Product) throws InterruptedException {
		 searchpage = new SearchPage(TestHooks.driver);
		searchpage.SearchForAProduct(Product);
		Thread.sleep(1000);
	}

	@And("Click on Search")
	public void ClickOn_Searchbutton() throws InterruptedException {
		searchpage.ClickOnSearchbutton();
			Thread.sleep(3000);
	}
	@Then("I should see the result in search page for validation (.*)$")
	public void I_should_see_the_result_in_search_page_for_validation(String Product) throws InterruptedException {
		// assertTrue(searchpage.getSearchHeader().contains(Product));
		assertEquals(searchpage.getSearchHeader(),Product);
		Thread.sleep(4000);
	}

//	@And("I enter Year From (.*)$")
//	public void iEnterYearFromYearFrom(int Year) throws InterruptedException {
//		searchpage.selectYearForm(Year);
//	}
//
//	@And("I enter Year To (.*)$")
//	public void iEnterYearTo(int Year) throws InterruptedException {
//		searchpage.selectYearTo(Year);
//
//	}
//
//	@And("I select Distance from dropdown (.*)$")
//	public void iSelectDistanceFromDropdown(String Distance) throws InterruptedException {
//		searchpage.selectDistance(Distance);
//
//	}
//	@Then("I select Make_from dropdown(.*)$")
//	public void iSelectMake_fromDropdown(String Make) throws InterruptedException {
//		searchpage.make_dropdown(Make);
//
//	}
//
//	@And("I select Model from dropdown (.*)$")
//	public void iSelectModelFromDropdown(String Model) throws InterruptedException {
//		searchpage.model_dropdown(Model);
//
//	}
	//	@And("I select Make from dropdown (.*)$")
//	public void iSelectMakeFromDropdown(String Make) throws InterruptedException {
//		searchpage.make_dropdown(Make);
//		Thread.sleep(1000);
//	}
//
//	@And("I select Model from dropdown (.*)$")
//	public void iSelectModelFromDropdown(String Model) throws InterruptedException {
//		searchpage.model_dropdown(Model);
//		Thread.sleep(1000);
//	}

	@Then("I click on Find Vehicle button")
	public void iClickOnDindVehicleButton() {
		searchpage.ClickOnFindVehicleButton();

	}

	@Then("I enter information for Find a Vehicle")
	public void iEnterInformationForFindAVehicle() {
		try {
			if (searchpage.Make_DropdownIsDisplayed()) {
				searchpage.make_dropdown();  // Default value or pass from feature file
				searchpage.model_dropdown();
				searchpage.selectYearForm();
				searchpage.selectYearTo();
				searchpage.selectDistance();
				searchpage.zipcode();
				// Default value or pass from feature file
			} else {
				scenario.log("Make and Model dropdowns are not displayed");
			}
		} catch (Exception e) {
			scenario.log("Make and Model dropdowns are not displayed");
		}
	}
}
