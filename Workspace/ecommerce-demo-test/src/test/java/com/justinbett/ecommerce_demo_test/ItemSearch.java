package com.justinbett.ecommerce_demo_test;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.SearchResults;

public class ItemSearch extends Hooks{

	public ItemSearch() throws IOException {
		super();
	}
	
	@Test()
	public void search() throws IOException {
		Homepage homepage = new Homepage();
		
		homepage.getSearchBar().sendKeys("yoga shorts", Keys.RETURN);
		Assert.assertEquals("Search results for: 'yoga shorts'", BasePage.getDriver().getTitle());
		System.out.println("search(): " + BasePage.getDriver().getTitle());
	}
	
	@Test(dependsOnMethods = {"search"})
	public void addSearch() throws IOException, InterruptedException {
		Actions action = new Actions(BasePage.getDriver());
		SearchResults searchResults = new SearchResults();
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(5));
		String getAddedMessageText;
		
		action.moveToElement(searchResults.getYogaShorts1()).perform();
		searchResults.getYogaShorts1Size29().click();
		searchResults.getYogaShorts1ColorBlue().click();
		searchResults.getYogaShorts1Add().click();		
		getAddedMessageText = searchResults.getAddedMessage().getText();
		wait.until(ExpectedConditions.textToBePresentInElement(searchResults.getAddedMessage(), getAddedMessageText));
		System.out.println("addSearch(): " + getAddedMessageText);
		
		action.moveToElement(searchResults.getYogaShorts2()).perform();
		searchResults.getYogaShorts2Size34().click();
		searchResults.getYogaShorts2ColorRed().click();
		searchResults.getYogaShorts2Add().click();
		getAddedMessageText = searchResults.getAddedMessage().getText();
		wait.until(ExpectedConditions.textToBePresentInElement(searchResults.getAddedMessage(), getAddedMessageText));
		System.out.println("addSearch(): " + getAddedMessageText);
		
		searchResults.getCart().click();
		searchResults.getProceedCart().click();
	}	
}
