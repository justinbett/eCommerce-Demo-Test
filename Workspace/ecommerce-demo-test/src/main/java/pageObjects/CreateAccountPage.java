package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CreateAccountPage extends BasePage {

	public WebDriver driver;
	
	By firstName = By.cssSelector("input#firstname");
	By lastName = By.cssSelector("input#lastname");
	By email = By.cssSelector("input#email_address");
	By password = By.cssSelector("input#password");
	By confirmPassword = By.cssSelector("input#password-confirmation");
	By createAccountBtn = By.cssSelector("button[title='Create an Account']");
	By createError = By.cssSelector("main#maincontent > .messages.page");
	
		
	public CreateAccountPage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getConfirmPassword() {
		return driver.findElement(confirmPassword);
	}
	
	public WebElement getCreateAccountBtn() {
		return driver.findElement(createAccountBtn);
	}
	
	public WebElement getCreateError() {
		return driver.findElement(createError);
	}
}
