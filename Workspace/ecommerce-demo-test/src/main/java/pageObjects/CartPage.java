package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CartPage extends BasePage{

	public WebDriver driver;
	
	By shirt1ItemQty = By.xpath("//*[contains(@name,'cart') and contains(@data-cart-item-id,'WS05-M-Black')]");
	
	public CartPage() throws IOException {
		this.driver = getDriver();
	}
	
	public WebElement getshirt1ItemQty() {
		return driver.findElement(shirt1ItemQty);
	}
	
}
