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
import pageObjects.NavigationHeader;
import pageObjects.SignInPage;
import pageObjects.SignOutPage;

@Listeners(resources.Listeners.class)
public class AccountSignInOut extends Hooks {
	
	public AccountSignInOut() throws IOException {
		super();
	}
	
	@Test()
	public void signIn() throws IOException {
		NavigationHeader navHeader = new NavigationHeader();
		SignInPage signInPage = new SignInPage();
		
		navHeader.getSignIn().click();
		signInPage.getEmail().sendKeys("jbtest123@test.com");
		signInPage.getPassword().sendKeys("AB#$12345");
		navHeader.getSignInBtn().click();
		Assert.assertEquals("Home Page", BasePage.getDriver().getTitle());
		System.out.println("signIn(): User successfully signed in.");
	}
	
	@Test(dependsOnMethods = {"signIn"})
	public void signOut() throws IOException {
		NavigationHeader navHeader = new NavigationHeader();
		SignOutPage signOutPage = new SignOutPage();
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(navHeader.getUserNav())).click();
		navHeader.getSignOut().click();
		Assert.assertEquals("You are signed out", signOutPage.getSignOutConfirm().getText());
		System.out.println("signOut(): User successfully signed out.");
	}
}
