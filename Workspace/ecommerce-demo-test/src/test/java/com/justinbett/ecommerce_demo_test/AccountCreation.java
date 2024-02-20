package com.justinbett.ecommerce_demo_test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.CreateAccountPage;
import pageObjects.Homepage;
import pageObjects.SignInPage;
import pageObjects.SignOutPage;

@Listeners(resources.Listeners.class)
public class AccountCreation extends Hooks{
	
	public AccountCreation() throws IOException {
		super();
	}
	
	Homepage homePage = new Homepage();
	CreateAccountPage createAccountPage = new CreateAccountPage();
	SignInPage signInPage = new SignInPage();
	SignOutPage signOutPage = new SignOutPage();
	
	//Initial test to check setup functionality
	@Test
	public void createAccount() throws IOException {
		homePage.getCreateAccount().click();
		createAccountPage.getFirstName().sendKeys("Justin");
		createAccountPage.getLastName().sendKeys("B");
		createAccountPage.getEmail().sendKeys("jbtest123@test.com");
		createAccountPage.getPassword().sendKeys("AB#$12345");
		createAccountPage.getConfirmPassword().sendKeys("AB#$12345");
		createAccountPage.getCreateAccountBtn().click();
		if (createAccountPage.getCreateError().isDisplayed()) {
			System.out.println("createAccount() Test: An account is already created with the credentials used. Consider this a passed test");
		}
		createAccountPage.getHomePage().click();
	}
}
