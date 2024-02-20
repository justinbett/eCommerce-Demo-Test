package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{

	public WebDriver driver;
	
	By createAccount = By.cssSelector(".header.panel > .header.links > li:nth-of-type(3) > a");
	By signIn = By.cssSelector(".header.panel > .header.links > .authorization-link > a");
	By signInBtn = By.cssSelector("fieldset button");
	By userNav = By.cssSelector(".header.panel > .header.links  span[role='button']");
	By signOut = By.cssSelector(".header.panel > .header.links  .customer-menu > .header.links > .authorization-link");
		
	public Homepage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getCreateAccount() {
		return driver.findElement(createAccount);
	}
	
	public WebElement getSignIn() {
		return driver.findElement(signIn);
	}
	
	public WebElement getSignInBtn() {
		return driver.findElement(signInBtn);
	}
	
	public WebElement getUserNav() {
		return driver.findElement(userNav);
	}
	
	public WebElement getSignOut() {
		return driver.findElement(signOut);
	}
}