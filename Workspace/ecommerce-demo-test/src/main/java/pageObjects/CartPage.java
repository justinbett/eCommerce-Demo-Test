package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CartPage extends BasePage{

	public WebDriver driver;
	
	By item1Qty = By.xpath("//*[contains(@name,'cart') and contains(@data-cart-item-id,'WS05-M-Black')]");
	By discountTotal = By.xpath("//div[@id='cart-totals']/div[@class='table-wrapper']/table[@class='data table totals']//tr[@class='totals']/td[@class='amount']");
	By checkoutBtn = By.cssSelector(".checkout.checkout-methods-items.items.methods  button[title='Proceed to Checkout']");
	
	public CartPage() throws IOException {
		this.driver = getDriver();
	}
	
	public WebElement getItem1Qty() {
		return driver.findElement(item1Qty);
	}
	
	public WebElement getDiscountTotal() {
		return driver.findElement(discountTotal);
	}
	
	public WebElement getCheckoutBtn() {
		return driver.findElement(checkoutBtn);
	}
}
