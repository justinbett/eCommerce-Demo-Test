package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{

	public WebDriver driver;
	
	By createAccount = By.cssSelector(".header.panel > .header.links > li:nth-of-type(3) > a");
		
	public Homepage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getCreateAccount() {
		return driver.findElement(createAccount);
	}	
}