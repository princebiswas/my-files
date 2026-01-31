package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class LoginPage extends Helper {

	public WebElement element = null ;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
		public WebElement SignInFirst()
		{
			element = getElementByXpath("(//a[text()='Sign in'])[1]");
			return element;
		}
		
		public WebElement EmailTextBox()
		{
			element = getElementById("userid");
			return element;
		}
		
		public WebElement ContinueBtn()
		{
			element = getElementByName("signin-continue-btn");
			return element;
		}
		
		public WebElement PasswordTextBox()
		{
			element = getElementById("pass");
			return element;
		}

		public WebElement SignInButton()
		{
			element = getElementByXpath("(//a[text()='Sign in'])[2]");
			return element;
		}
		
	
		
		public WebElement SignInAfterPassword()
		{
			element = getElementByXpath("(//button[text()='Sign in']");
			return element;
		}
		
		public WebElement getErrorData()
		{
			element = getElementByXpath("(//p[@id='errormsg']']']");
			return element;
		}

	
}
