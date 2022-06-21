package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
	@FindBy(xpath= "//input[@type='text']")private WebElement mobNo;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submit;
	
	public void ZerodhaSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EntermobNo(String MobNo) {
		mobNo.sendKeys(MobNo);
	}
	
	public void ClickOnSubmit() {
		submit.click();
	}
}
