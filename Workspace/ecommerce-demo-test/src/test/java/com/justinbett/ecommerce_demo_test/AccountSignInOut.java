package com.justinbett.ecommerce_demo_test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.CreateAccountPage;
import pageObjects.Homepage;
import pageObjects.SignInPage;
import pageObjects.SignOutPage;

@Listeners(resources.Listeners.class)
public class AccountSignInOut extends Hooks {
	
	public AccountSignInOut() throws IOException {
		super();
	}
	
	Homepage homePage = new Homepage();
	CreateAccountPage createAccountPage = new CreateAccountPage();
	SignInPage signInPage = new SignInPage();
	SignOutPage signOutPage = new SignOutPage();
	
	@Test
	public void signIn() throws IOException {
		// Sign In from Home Page
		homePage.getSignIn().click();
		signInPage.getEmail().sendKeys("jbtest123@test.com");
		signInPage.getPassword().sendKeys("AB#$12345");
		homePage.getSignInBtn().click();
		Assert.assertEquals("Home Page", BasePage.getDriver().getTitle());
		System.out.println("User successfully signed in.");
	}
	
	@Test
	public void signOut() throws IOException {
		// Sign Out from Home Page
		homePage.getUserNav().click();
		homePage.getSignOut().click();
		Assert.assertEquals("You are signed out", signOutPage.getSignOutConfirm().getText());
		System.out.println("User successfully signed out.");
	}
}
