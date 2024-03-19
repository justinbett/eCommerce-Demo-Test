package com.justinbett.ecommerce_demo_test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.CheckoutPage;
import pageObjects.CheckoutReviewPage;
import pageObjects.NavigationHeader;
import pageObjects.SearchResults;

@Listeners(resources.Listeners.class)
public class ItemSearch extends Hooks{

	public ItemSearch() throws IOException {
		super();
	}
	
	@Test()
	public void search() throws IOException {
		NavigationHeader navHeader = new NavigationHeader();
		
		navHeader.getSearchBar().sendKeys("yoga shorts", Keys.ENTER);
		Assert.assertEquals("Search results for: 'yoga shorts'", BasePage.getDriver().getTitle());
		System.out.println("search(): " + BasePage.getDriver().getTitle());
	}
	
	@Test(dependsOnMethods = {"search"})
	public void addSearch() throws IOException{
		Actions action = new Actions(BasePage.getDriver());
		SearchResults searchResults = new SearchResults();
		NavigationHeader navHeader = new NavigationHeader();
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(30));
		String getAddedMessageText;
		action.moveToElement(searchResults.getYogaShorts1()).perform();
		searchResults.getYogaShorts1Size().click();
		searchResults.getYogaShorts1Color().click();
		searchResults.getYogaShorts1Add().click();
		getAddedMessageText = BasePage.getDriver().findElement(By.cssSelector("div[role='alert'] > div > div")).getText();
		wait.until(ExpectedConditions.textToBePresentInElement(BasePage.getDriver().findElement(By.cssSelector("div[role='alert'] > div > div")), getAddedMessageText));
		System.out.println("addSearch(): " + getAddedMessageText);
		wait.until(ExpectedConditions.visibilityOf(navHeader.getCart())).click();
		wait.until(ExpectedConditions.visibilityOf(navHeader.getProceedCart())).click();
	}
	
	@Test(dependsOnMethods = {"addSearch"})
	public void guestCheckout() throws IOException {
		CheckoutPage checkoutPage = new CheckoutPage();
		CheckoutReviewPage checkoutReviewPage = new CheckoutReviewPage();
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(30));
		String orderNumber;
		
		checkoutPage.getEmail().sendKeys("jbtest123@test.com", Keys.ENTER);
		checkoutPage.getFirstName().sendKeys("Justin");
		checkoutPage.getLastName().sendKeys("B");
		checkoutPage.getStreetAddress().sendKeys("123 Towns Street");
		checkoutPage.getCity().sendKeys("Townsville");
		Select selectCountry = new Select(checkoutPage.getCountry());
		selectCountry.selectByVisibleText("Canada");
		Select selectProvince = new Select(checkoutPage.getProvince());
		selectProvince.selectByVisibleText("Ontario");
		checkoutPage.getPostalCode().sendKeys("H8F 2L1");
		checkoutPage.getPhoneNumber().sendKeys("1231231234");
		checkoutPage.getShippingMethod1().click();
		wait.until(ExpectedConditions.visibilityOf(checkoutPage.getNextBtn())).click();
		//NOTE: Using Element clicks to click the button caused "Element is not clickable at point" errors due to overlapping elements. Resorted to using the JavaScriptExecutor to handle the click of the button in its place.
		JavascriptExecutor jsExecutor = (JavascriptExecutor)BasePage.getDriver();
		jsExecutor.executeScript("arguments[0].click();", checkoutReviewPage.getPlaceOrderBtn());
		wait.until(ExpectedConditions.visibilityOf(checkoutReviewPage.getOrderNumber()));
		orderNumber = checkoutReviewPage.getOrderNumber().getText();
		System.out.println(orderNumber);
	}
}
