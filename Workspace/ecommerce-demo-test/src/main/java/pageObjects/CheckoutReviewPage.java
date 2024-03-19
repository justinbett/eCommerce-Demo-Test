package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CheckoutReviewPage extends BasePage{
	
	By placeOrderBtn = By.cssSelector("button[title='Place Order'] > span");
	By thankYou = By.cssSelector(".base");
	By orderNumber = By.cssSelector(".checkout-success > p:nth-of-type(1)");
	
	public WebDriver driver;
	
	public CheckoutReviewPage() throws IOException {
		super();
		this.driver = getDriver();	
	}
	
	public WebElement getPlaceOrderBtn() {
		return driver.findElement(placeOrderBtn);
	}
	
	public WebElement getThankYou() {
		return driver.findElement(thankYou);
	}
	
	public WebElement getOrderNumber() {
		return driver.findElement(orderNumber);
	}
	
}
