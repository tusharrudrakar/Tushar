 package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {
	@FindBy(xpath = "//a[@href='/forgot']")private WebElement forgotID;
	@FindBy(xpath = "//input[@id='radio-32']")private WebElement remUserID;
	@FindBy(xpath = "//input[@id='radio-33']")private WebElement forUserID;
	@FindBy(xpath = "//input[@placeholder='User ID']")private WebElement userID;
	@FindBy(xpath = "//input[@placeholder='PAN']")private WebElement panNo;
	@FindBy(xpath = "//input[@id='radio-37']")private WebElement email;
	@FindBy(xpath = "//input[@id='radio-38']")private WebElement SMS;
	@FindBy(xpath = "//input[@placeholder='E-mail (as on account)']")private WebElement enterEmail;
	@FindBy(xpath = "//input[@placeholder='Captcha']")private WebElement captcha;
	@FindBy(xpath = "//button[@type='submit']")private WebElement reset;
	@FindBy(xpath = "//a[Text()='� Back to login']")private WebElement backtologin;
	@FindBy(xpath = "//a[Text()='Don't have an account? Signup now!']")private WebElement Signup;
	
	public ZerodhaForgotPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnForgotID() {
		forgotID.click();
	}
	
	public void ClickOnRemUserID() {
		remUserID.click();
	}
	
	public void ClickOnForUserID() {
		forUserID.click();
	}
	
	public void EnterUserID() {
		userID.click();
	}
	 
	public void EnterPANNo(String PAN) {
		panNo.sendKeys(PAN);
	}
	
	public void ClickOnEmail() {
		email.click();
	}
	
	public void ClickOnSMS() {
		SMS.click();
	}
	
	public void EnterEmail(String Email) {
		enterEmail.sendKeys(Email);
	}
	
	public void EnterCaptcha(String Captcha) {
		captcha.sendKeys(Captcha);
	}
	
	public void ClickOnReset() {
		reset.click();
	}	

	public void ClickOnBackToLogin() {
		backtologin.click();
	}
	
	public void ClickOnSignUp() {
		Signup.click();
    }
}
