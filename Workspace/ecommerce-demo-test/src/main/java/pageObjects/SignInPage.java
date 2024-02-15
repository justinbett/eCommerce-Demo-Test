package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base.BasePage;

public class SignInPage extends BasePage {

	public WebDriver driver;
	
	
	
	public SignInPage() throws IOException {
		super();
		this.driver = getDriver();
	}
	
	
	
}
