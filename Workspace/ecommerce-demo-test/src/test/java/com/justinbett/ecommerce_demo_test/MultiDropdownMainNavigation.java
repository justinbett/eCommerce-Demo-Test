package com.justinbett.ecommerce_demo_test;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.Homepage;

@Listeners(resources.Listeners.class)
public class MultiDropdownMainNavigation extends Hooks {
	
	public MultiDropdownMainNavigation() throws IOException {
		super();
	}
	
	@Test
	public void multiDropDownMainNavigation () throws IOException, InterruptedException {
		Actions action = new Actions(BasePage.getDriver());
		Homepage homePage = new Homepage();
		action.moveToElement(homePage.getWomenNav()).perform();
		action.moveToElement(homePage.getWomenNavTops()).perform();
		action.moveToElement(homePage.getWomenNavBottoms()).perform();
		action.moveToElement(homePage.getMenNav()).perform();
		action.moveToElement(homePage.getMenNavTops()).perform();
		action.moveToElement(homePage.getMenNavBottoms()).perform();
		action.moveToElement(homePage.getGearNav()).perform();
		action.moveToElement(homePage.getTrainingNav()).perform();
	}
}
