package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	@FindBy(xpath = "//input[@id='userid']")private WebElement userID;
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement Login;
	@FindBy(xpath = "//a[@href='/forgot']")private WebElement Forgot;
	@FindBy(xpath = "//a[@target='_blank']")private WebElement SignUp;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void enterUserID(String user) {
	userID.sendKeys(user);
	}
	
	public void enterpassword(String pass) {
	password.sendKeys(pass);
	}
	
	public void ClickOnLogin() {
		Login.click();
	}
		
	public void ClickOnForgotPassword() {
		Forgot.click(); 
	}
		
	public void ClickOnSignUp() {
	SignUp.click();
	}
}
