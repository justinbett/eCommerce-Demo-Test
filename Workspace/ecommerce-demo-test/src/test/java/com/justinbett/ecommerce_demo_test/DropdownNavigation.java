package com.justinbett.ecommerce_demo_test;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.NavigationHeader;

@Listeners(resources.Listeners.class)
public class DropdownNavigation extends Hooks {
	
	public DropdownNavigation() throws IOException {
		super();
	}
	
	@Test
	public void dropdownNavigation () throws IOException {
		Actions action = new Actions(BasePage.getDriver());
		NavigationHeader navHeader = new NavigationHeader();
		action.moveToElement(navHeader.getWomenNav()).perform();
		action.moveToElement(navHeader.getWomenNavTops()).perform();
		action.moveToElement(navHeader.getWomenNavBottoms()).perform();
		action.moveToElement(navHeader.getMenNav()).perform();
		action.moveToElement(navHeader.getMenNavTops()).perform();
		action.moveToElement(navHeader.getMenNavBottoms()).perform();
		action.moveToElement(navHeader.getGearNav()).perform();
		action.moveToElement(navHeader.getTrainingNav()).perform();
		action.moveToElement(navHeader.getMenNav()).perform();
		action.moveToElement(navHeader.getMenNavTops()).perform();
		action.moveToElement(navHeader.getMenNavJackets()).perform();
		navHeader.getMenNavJackets().click();
	}
}
