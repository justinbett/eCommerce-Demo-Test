package com.justinbett.ecommerce_demo_test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.CreateAccountPage;
import pageObjects.Homepage;

@Listeners(resources.Listeners.class)
public class AccountCreationSignIn extends Hooks {
	public AccountCreationSignIn() throws IOException {
		super();
	}
	
	//Initial test to check setup functionality
	@Test
	public void createAccount() throws IOException {
		Homepage homePage = new Homepage();
		homePage.getCreateAccount().click();
		
		CreateAccountPage createAccountPage = new CreateAccountPage();
		createAccountPage.getFirstName().sendKeys("Justin");
		createAccountPage.getLastName().sendKeys("B");
		createAccountPage.getEmail().sendKeys("jbtest123@test.com");
		createAccountPage.getPassword().sendKeys("AB#$12345");
		createAccountPage.getConfirmPassword().sendKeys("AB#$12345");
		createAccountPage.getCreateAccountBtn().click();
	}
	
	public void loginAccount() {
		
	}
}
