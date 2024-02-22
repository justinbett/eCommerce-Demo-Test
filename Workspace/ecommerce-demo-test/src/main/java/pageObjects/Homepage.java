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
	By womenNav = By.cssSelector("[data-action] > [role] > [role='presentation']:nth-of-type(2)");
	By womenNavTops = By.cssSelector("li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(1) > a[role='menuitem'] > span:nth-of-type(2)");
	By womenNavBottoms = By.cssSelector("li:nth-of-type(2) > ul[role='menu'] > li:nth-of-type(2) > a[role='menuitem'] > span:nth-of-type(2)");
	By menNav = By.cssSelector("li:nth-of-type(3) > a[role='menuitem'] > span:nth-of-type(2)");
	By menNavTops = By.cssSelector("li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(1) > a[role='menuitem']");
	By menNavBottoms = By.cssSelector("li:nth-of-type(3) > ul[role='menu'] > li:nth-of-type(2) > a[role='menuitem']");
	By gearNav = By.cssSelector("li:nth-of-type(4) > a[role='menuitem'] > span:nth-of-type(2)");
	By trainingNav = By.cssSelector("li:nth-of-type(5) > a[role='menuitem'] > span:nth-of-type(2)");
	
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
	
	public WebElement getWomenNav() {
		return driver.findElement(womenNav);
	}
	
	public WebElement getWomenNavTops() {
		return driver.findElement(womenNavTops);
	}
	
	public WebElement getWomenNavBottoms() {
		return driver.findElement(womenNavBottoms);
	}
	
	public WebElement getMenNav() {
		return driver.findElement(menNav);
	}
	
	public WebElement getMenNavTops() {
		return driver.findElement(menNavTops);
	}
	
	public WebElement getMenNavBottoms() {
		return driver.findElement(menNavBottoms);
	}
	
	public WebElement getGearNav() {
		return driver.findElement(gearNav);
	}
	
	public WebElement getTrainingNav() {
		return driver.findElement(trainingNav);
	}
}