package com.justinbett.ecommerce_demo_test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.SignInPage;
import pageObjects.SignOutPage;

@Listeners(resources.Listeners.class)
public class AccountSignInOut extends Hooks {
	
	public AccountSignInOut() throws IOException {
		super();
	}
	
	@Test()
	public void signIn() throws IOException {
		Homepage homePage = new Homepage();
		SignInPage signInPage = new SignInPage();
		
		homePage.getSignIn().click();
		signInPage.getEmail().sendKeys("jbtest123@test.com");
		signInPage.getPassword().sendKeys("AB#$12345");
		homePage.getSignInBtn().click();
		Assert.assertEquals("Home Page", BasePage.getDriver().getTitle());
		System.out.println("signIn() Test: User successfully signed in.");
	}
	
	@Test(dependsOnMethods = {"signIn"})
	public void signOut() throws IOException {
		Homepage homePage = new Homepage();
		SignOutPage signOutPage = new SignOutPage();
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(homePage.getUserNav()));
		homePage.getUserNav().click();
		homePage.getSignOut().click();
		Assert.assertEquals("You are signed out", signOutPage.getSignOutConfirm().getText());
		System.out.println("signOut() Test: User successfully signed out.");
	}
}
