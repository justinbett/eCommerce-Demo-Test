package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class SignInPage extends BasePage {

	public WebDriver driver;
	
	By email = By.cssSelector("input#email");
	By password = By.cssSelector("input#pass");

	
	public SignInPage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	

}
