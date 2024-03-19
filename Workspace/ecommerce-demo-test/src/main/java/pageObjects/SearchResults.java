package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class SearchResults extends BasePage{
	
	public WebDriver driver;
	
	By yogaShorts1 = By.cssSelector(".items.list.product-items.products > li:nth-of-type(1)");
	By yogaShorts1Name = By.cssSelector("li:nth-of-type(1) > .product-item-info .product-item-link");
	By yogaShorts1Size = By.cssSelector(".swatch-opt-1983 > .size.swatch-attribute > div[role='listbox'] > div:nth-of-type(2)");
	By yogaShorts1Color = By.cssSelector(".swatch-opt-1983 > .color.swatch-attribute > div[role='listbox'] > div:nth-of-type(1)");
	By yogaShorts1Add = By.cssSelector("li:nth-of-type(1) > .product-item-info form[method='post'] > button[title='Add to Cart'] > span");
	By yogaShorts2 = By.cssSelector(".items.list.product-items.products > li:nth-of-type(4)");
	By yogaShorts2Name = By.cssSelector("li:nth-of-type(4) > .product-item-info .product-item-link");
	By yogaShorts2Size = By.cssSelector(".swatch-opt-950 > .size.swatch-attribute > div[role='listbox'] > div:nth-of-type(3)");
	By yogaShorts2Color = By.cssSelector(".swatch-opt-950 > .color.swatch-attribute > div[role='listbox'] > div:nth-of-type(3)");
	By yogaShorts2Add = By.cssSelector("li:nth-of-type(4) > .product-item-info form[method='post'] > button[title='Add to Cart'] > span");	
	By addedMessage = By.cssSelector("div[role='alert'] > div > div");
	
	
	public SearchResults() throws IOException {
		this.driver = getDriver();
	}
	
	public WebElement getYogaShorts1() {
		return driver.findElement(yogaShorts1);
	}
	
	public WebElement getYogaShorts1Name() {
		return driver.findElement(yogaShorts1Name);
	}
	
	public WebElement getYogaShorts1Size() {
		return driver.findElement(yogaShorts1Size);
	}
	
	public WebElement getYogaShorts1Color() {
		return driver.findElement(yogaShorts1Color);
	}
	
	public WebElement getYogaShorts1Add() {
		return driver.findElement(yogaShorts1Add);
	}
	
	public WebElement getYogaShorts2() {
		return driver.findElement(yogaShorts2);
	}
	
	public WebElement getYogaShorts2Name() {
		return driver.findElement(yogaShorts2Name);
	}
	
	public WebElement getYogaShorts2Size() {
		return driver.findElement(yogaShorts2Size);
	}
	
	public WebElement getYogaShorts2Color() {
		return driver.findElement(yogaShorts2Color);
	}
	
	public WebElement getYogaShorts2Add() {
		return driver.findElement(yogaShorts2Add);
	}
	
	public WebElement getAddedMessage() {
		return driver.findElement(addedMessage);
	}
}
