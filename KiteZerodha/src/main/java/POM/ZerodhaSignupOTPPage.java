package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignupOTPPage {
	@FindBy(xpath = "//input[@type='text']")private WebElement enterotp;
	@FindBy(xpath = "//p[@class='text-black text-12']")private WebElement resendotp;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submit;
	
	public ZerodhaSignupOTPPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterotp(String otp) {
		enterotp.sendKeys(otp);
	}
	public void ClickOnResendotp() {
		resendotp.click();
	}
	
	public void ClickOnSubmit() {
		submit.click();
	}

}
