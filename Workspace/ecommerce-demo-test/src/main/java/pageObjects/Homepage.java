package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{

	public WebDriver driver;
	
	By shopNewYoga = By.cssSelector(".action.button.more");
		
	public Homepage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	public WebElement getShopNewYoga() {
		return driver.findElement(shopNewYoga);
	}
	
}
