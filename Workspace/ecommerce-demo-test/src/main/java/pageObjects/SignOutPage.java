package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class SignOutPage extends BasePage {
	
	public WebDriver driver;
	
	By signOutConfirm = By.cssSelector(".base");
	
	public SignOutPage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getSignOutConfirm() {
		return driver.findElement(signOutConfirm);
	}
}
