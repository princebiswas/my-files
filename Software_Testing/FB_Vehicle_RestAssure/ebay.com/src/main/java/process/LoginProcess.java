package process;

import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;
import utility.Helper;

public class LoginProcess extends Helper{
	
	public final static String CorrectEmail="neelnodi2024@hotmail.com";
	public final static String CorrectPassword="Mymensingh1!";
	

	LoginPage Lpa = new LoginPage(driver);
	public LoginProcess(WebDriver driver) {
		super(driver);
		
	}

	public void CorrectEmail() throws InterruptedException {
		Lpa.EmailTextBox().sendKeys(CorrectEmail);
		
		
	}
	
	public void CorrectPassword() throws InterruptedException {
		
		Lpa.PasswordTextBox().sendKeys(CorrectPassword);
		
	}
	
	public void SignInFirst() {
		Lpa.SignInFirst().click();
	}
	
	public void ContinueBtn() {
		Lpa.ContinueBtn().click();
	}
	
	public void IncorrectEmail() {
		Lpa.EmailTextBox().sendKeys("neelnodi@hotmail.com");
	}
	
	public void IncorrectPassword() throws InterruptedException {
		Lpa.EmailTextBox().sendKeys("12345678");
		Thread.sleep(3000);
	}
	public void SignInAfterPass() {
		Lpa.SignInAfterPassword().click();
	}
	
	public String getErrorData()
	{
		String ExpedtedValue = Lpa.getErrorData().getText();
		return ExpedtedValue;
	}
	
	public void CloseBrowser() {
		driver.close();
	}



	
	
}
