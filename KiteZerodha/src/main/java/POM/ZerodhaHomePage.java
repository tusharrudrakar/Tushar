package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	
	@FindBy(xpath="//input[@icon='search']")private WebElement search;
	@FindBy(xpath="//span[text()='ADANIPOWER']")private WebElement ADANIPOWER;
	@FindBy(xpath="(//button[@class='button-blue'])[1]")private WebElement buy;
	@FindBy(xpath="//input[@autofocus='autofocus']")private WebElement qty;
	@FindBy(xpath="//label[@for='radio-196']")private WebElement market;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancel;
	@FindBy(xpath="//button[@class='button-orange']")private WebElement sell;
	
	public ZerodhaHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void entersearch(String shares) {
		search.click();
		search.sendKeys(shares);
	}
    
	public void buy(WebDriver driver) {
		Actions Act = new Actions(driver);
		Act.moveToElement(ADANIPOWER).perform();
		Act.moveToElement(buy);
		Act.click().perform();
	}
	
	public void sell(WebDriver driver) {
        Actions Act = new Actions(driver);
		Act.moveToElement(ADANIPOWER).perform();
		Act.moveToElement(sell);
		Act.click().perform();
	}
	
	public void Quantity(WebDriver driver) {
	    qty.sendKeys();
	}
	
	public void Market(WebDriver driver) {
		market.click();
		
	}
	
	public void Submit(WebDriver driver) {
		submit.click();
	}
	
	public void Cancel(WebDriver driver) {
		cancel.click();
	}
	
}
