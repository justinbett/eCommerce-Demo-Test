package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{

	public WebDriver driver;
	
	By promoFree = By.cssSelector(".block-promo.home-t-shirts  .action.icon.more");
	
	public Homepage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getPromoFree() {
		return driver.findElement(promoFree);
	}
	
}