package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ShirtsPromoPage extends BasePage{

	public WebDriver driver;
	
	By shirt1 = By.cssSelector(".items.list.product-items.products > li:nth-of-type(1)");
	By shirt1Size = By.cssSelector(".swatch-opt-1588 > .size.swatch-attribute > div[role='listbox'] > div:nth-of-type(3)");
	By shirt1Color = By.cssSelector(".swatch-opt-1588 > .color.swatch-attribute > div[role='listbox'] > div:nth-of-type(1)");
	By shirt1Add = By.cssSelector("li:nth-of-type(1) > .product-item-info form[method='post'] > button[title='Add to Cart'] > span");
	By shirt2 = By.cssSelector(".items.list.product-items.products > li:nth-of-type(2)");
	By shirt2Size = By.cssSelector(".swatch-opt-1572 > .size.swatch-attribute > div[role='listbox'] > div:nth-of-type(2)");
	By shirt2Color = By.cssSelector(".swatch-opt-1572 > .color.swatch-attribute > div[role='listbox'] > div:nth-of-type(2)");
	By shirt2Add = By.cssSelector("li:nth-of-type(2) > .product-item-info form[method='post'] > button[title='Add to Cart']");
	By shirt3 = By.cssSelector(".items.list.product-items.products > li:nth-of-type(3)");
	By shirt3Size = By.cssSelector(".swatch-opt-1556 > .size.swatch-attribute > div[role='listbox'] > div:nth-of-type(1)");
	By shirt3Color = By.cssSelector(".swatch-opt-1556 > .color.swatch-attribute > div[role='listbox'] > div:nth-of-type(2)");
	By shirt3Add = By.cssSelector("li:nth-of-type(3) > .product-item-info form[method='post'] > button[title='Add to Cart'] > span");
	By shirt4 = By.cssSelector(".items.list.product-items.products > li:nth-of-type(4)");
	By shirt4Size = By.cssSelector(".swatch-opt-1540 > .size.swatch-attribute > div[role='listbox'] > div:nth-of-type(1)");
	By shirt4Color = By.cssSelector(".swatch-opt-1540 > .color.swatch-attribute > div[role='listbox'] > div:nth-of-type(3)");
	By shirt4Add = By.cssSelector("li:nth-of-type(4) > .product-item-info form[method='post'] > button[title='Add to Cart'] > span");
	By cart = By.cssSelector(".minicart-wrapper > .action.showcart");
	By cartQty = By.xpath("//body//div[@class='minicart-wrapper']/a[@href='https://magento.softwaretestingboard.com/checkout/cart/']/span[@class='counter qty']/span[@class='counter-number']");
	By viewEditCart = By.cssSelector(".action.viewcart");
	
	public ShirtsPromoPage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getShirt1() {
		return driver.findElement(shirt1);
	}
	
	public WebElement getShirt1Size() {
		return driver.findElement(shirt1Size);
	}
	
	public WebElement getShirt1Color() {
		return driver.findElement(shirt1Color);
	}
	
	public WebElement getShirt1Add() {
		return driver.findElement(shirt1Add);
	}
	
	public WebElement getShirt2() {
		return driver.findElement(shirt2);
	}
	
	public WebElement getShirt2Size() {
		return driver.findElement(shirt2Size);
	}
	
	public WebElement getShirt2Color() {
		return driver.findElement(shirt2Color);
	}
	
	public WebElement getShirt2Add() {
		return driver.findElement(shirt2Add);
	}
	
	public WebElement getShirt3() {
		return driver.findElement(shirt3);
	}
	
	public WebElement getShirt3Size() {
		return driver.findElement(shirt3Size);
	}
	
	public WebElement getShirt3Color() {
		return driver.findElement(shirt3Color);
	}
	
	public WebElement getShirt3Add() {
		return driver.findElement(shirt3Add);
	}
	
	public WebElement getShirt4() {
		return driver.findElement(shirt4);
	}
	
	public WebElement getShirt4Size() {
		return driver.findElement(shirt4Size);
	}
	
	public WebElement getShirt4Color() {
		return driver.findElement(shirt4Color);
	}
	
	public WebElement getShirt4Add() {
		return driver.findElement(shirt4Add);
	}
	
	public WebElement getCart() {
		return driver.findElement(cart);
	}
	
	public WebElement getCartQty() {
		return driver.findElement(cartQty);
	}
	
	public WebElement getViewEditCart() {
		return driver.findElement(viewEditCart);
	}
}
