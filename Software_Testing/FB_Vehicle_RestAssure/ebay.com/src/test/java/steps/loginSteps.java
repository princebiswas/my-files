package steps;

import static steps.Hooks.driver;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import process.LoginProcess;

public class loginSteps {
	
	

	LoginProcess lp;
	
	
	@Given("User enters the url in browser")
	public void user_login_with_ebay_website() {
	    
	    
	}
	
	@Then("Click on Sign in")
	public void SigInFirst() throws InterruptedException {
		lp = new LoginProcess(driver);
	    lp.SignInFirst();
	    Thread.sleep(3000);
	  
	}

	@Then("User enters incorrect email address or username in the textbox")
	public void enter_incorrect_email_id() throws InterruptedException {
		lp = new LoginProcess(driver);
		lp.IncorrectEmail();
	    Thread.sleep(3000);
	}

	@Then("User enters the correct password in the textbox")
	public void enter_correct_password() throws InterruptedException {
		lp = new LoginProcess(driver);
		lp.CorrectPassword();
	    Thread.sleep(3000);
	}

	@Then("Click on sign in after entering password")
	public void SigIn() throws InterruptedException {
		lp = new LoginProcess(driver);
	    lp.SignInAfterPass();
	    Thread.sleep(3000);
	  
	}



	@Then("Enter Correct Email id")
	public void enter_correct_email_id() throws InterruptedException {
		lp = new LoginProcess(driver);
		lp.CorrectEmail();
	    Thread.sleep(3000);
	}

	@Then("Enter Incorrect Password")
	public void enter_incorrect_password() throws InterruptedException {
		lp = new LoginProcess(driver);
		lp.IncorrectPassword();
	    Thread.sleep(3000);
	    
	}



	@Then("User enters correct email")
	public void enter_correct_email() throws InterruptedException {
	   lp = new LoginProcess(driver);
	   lp.CorrectEmail();
	   Thread.sleep(3000);
	}
	
	@Then("User enters correct Password")
	public void enter_correct_password1() throws InterruptedException {
	   lp = new LoginProcess(driver);
	  	   lp.CorrectPassword();
	   Thread.sleep(3000);
	}
	@Then("Click on Continue button")
	public void Click_on_Continue_button() throws InterruptedException {
	   lp = new LoginProcess(driver);
	   lp.ContinueBtn();
	   Thread.sleep(3000);
	  
	}
	
	
	@Then("Validate the error")
		public String ExpectedResult()
		{
		lp = new LoginProcess(driver);
		 String ExpectedValue =  lp.getErrorData();

	        Assert.assertEquals(ExpectedValue,"Oops, that's not a match.");
			return ExpectedValue;
			
	    }
		
	    
	@Then("Close the browser")
	public void CloseBrowser() {
		lp = new LoginProcess(driver);
		lp.CloseBrowser();
	    
	}
	
}
