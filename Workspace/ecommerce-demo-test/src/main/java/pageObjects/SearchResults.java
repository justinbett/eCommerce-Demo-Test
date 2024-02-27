package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class SearchResults extends BasePage{
	
	public WebDriver driver;
	
	By yogaShorts1 = By.cssSelector(".items.list.product-items.products > li:nth-of-type(1)");
	By yogaShorts1Size29 = By.cssSelector(".swatch-opt-1983 > .size.swatch-attribute > div[role='listbox'] > div:nth-of-type(2)");
	By yogaShorts1ColorBlue = By.cssSelector(".swatch-opt-1983 > .color.swatch-attribute > div[role='listbox'] > div:nth-of-type(1)");
	By yogaShorts1Add = By.cssSelector("li:nth-of-type(1) > .product-item-info form[method='post'] > button[title='Add to Cart'] > span");
	By yogaShorts2 = By.cssSelector(".items.list.product-items.products > li:nth-of-type(4)");
	By yogaShorts2Size34 = By.cssSelector(".swatch-opt-950 > .size.swatch-attribute > div[role='listbox'] > div:nth-of-type(3)");
	By yogaShorts2ColorRed = By.cssSelector(".swatch-opt-950 > .color.swatch-attribute > div[role='listbox'] > div:nth-of-type(3)");
	By yogaShorts2Add = By.cssSelector("li:nth-of-type(4) > .product-item-info form[method='post'] > button[title='Add to Cart'] > span");
	By cart = By.cssSelector(".minicart-wrapper > .action.showcart");
	By cartQty = By.xpath("//body//div[@class='minicart-wrapper']/a[@href='https://magento.softwaretestingboard.com/checkout/cart/']/span[@class='counter qty']/span[@class='counter-number']");
	By proceedCart = By.cssSelector("button#top-cart-btn-checkout");
	
	public SearchResults() throws IOException {
		this.driver = getDriver();
	}
	
	public WebElement getYogaShorts1() {
		return driver.findElement(yogaShorts1);
	}
	
	public WebElement getYogaShorts1Size29() {
		return driver.findElement(yogaShorts1Size29);
	}
	
	public WebElement getYogaShorts1ColorBlue() {
		return driver.findElement(yogaShorts1ColorBlue);
	}
	
	public WebElement getYogaShorts1Add() {
		return driver.findElement(yogaShorts1Add);
	}
	
	public WebElement getYogaShorts2() {
		return driver.findElement(yogaShorts2);
	}
	
	public WebElement getYogaShorts2Size34() {
		return driver.findElement(yogaShorts2Size34);
	}
	
	public WebElement getYogaShorts2ColorRed() {
		return driver.findElement(yogaShorts2ColorRed);
	}
	
	public WebElement getYogaShorts2Add() {
		return driver.findElement(yogaShorts2Add);
	}
	
	public WebElement getCart() {
		return driver.findElement(cart);
	}
	
	public WebElement getCartQty() {
		return driver.findElement(cartQty);
	}
	
	public WebElement getProceedCart() {
		return driver.findElement(proceedCart);
	}
}
