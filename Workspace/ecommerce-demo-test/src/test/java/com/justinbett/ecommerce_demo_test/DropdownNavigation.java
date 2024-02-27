package com.justinbett.ecommerce_demo_test;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.Homepage;

@Listeners(resources.Listeners.class)
public class DropdownNavigation extends Hooks {
	
	public DropdownNavigation() throws IOException {
		super();
	}
	
	@Test
	public void dropdownNavigation () throws IOException, InterruptedException {
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
