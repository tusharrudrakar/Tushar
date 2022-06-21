package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submit;
	@FindBy(xpath = "//a[Text()='Forgot 2FA?']")private WebElement Forgot;
	@FindBy(xpath = "//a[Text()='Don't have an account? Signup now!']")private WebElement SignUp;
	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
  
	public void enterpin(String PinNumber) {
		pin.sendKeys(PinNumber);
	}
	
	public void clickOnContinue() {
		submit.click();
	}
	
	public void clickOnForgot() {
		Forgot.click();
	}
	
	public void clickOnSignUp() {
		SignUp.click();
	}

}
