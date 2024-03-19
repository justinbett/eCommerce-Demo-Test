package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CheckoutPage extends BasePage{

	public WebDriver driver;
	
	By email = By.cssSelector("[data-role='email-with-possible-login'] #customer-email");
	By password = By.cssSelector("input#customer-password");
	By loginBtn = By.cssSelector(".action.login.primary");
	By firstName = By.cssSelector("input[name='firstname']");
	By lastName = By.cssSelector("input[name='lastname']");
	By streetAddress = By.cssSelector("input[name='street[0]']");
	By city = By.cssSelector("input[name='city']");
	By province = By.cssSelector("select[name='region_id']");
	By postalCode = By.cssSelector("input[name='postcode']");
	By country = By.cssSelector("select[name='country_id']");
	By phoneNumber = By.cssSelector("input[name='telephone']");
	By shippingMethod1 = By.cssSelector("input[name='ko_unique_1']");
	By shippingMethod2 = By.cssSelector("input[name='ko_unique_2']");
	By nextBtn = By.cssSelector("div#shipping-method-buttons-container > .primary");
	By shippingMethod = By.cssSelector("li#opc-shipping_method");
	
	public CheckoutPage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}
	
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement getStreetAddress() {
		return driver.findElement(streetAddress);
	}
	
	public WebElement getCity() {
		return driver.findElement(city);
	}
	
	public WebElement getProvince() {
		return driver.findElement(province);
	}
	
	public WebElement getPostalCode() {
		return driver.findElement(postalCode);
	}
	
	public WebElement getCountry() {
		return driver.findElement(country);
	}
	
	public WebElement getPhoneNumber() {
		return driver.findElement(phoneNumber);
	}
	
	public WebElement getShippingMethod() {
		return driver.findElement(shippingMethod);
	}
	
	public WebElement getShippingMethod1() {
		return driver.findElement(shippingMethod1);
	}
	
	public WebElement getShippingMethod2() {
		return driver.findElement(shippingMethod1);
	}
	
	public WebElement getNextBtn() {
		return driver.findElement(nextBtn);
	}
	
	
}
