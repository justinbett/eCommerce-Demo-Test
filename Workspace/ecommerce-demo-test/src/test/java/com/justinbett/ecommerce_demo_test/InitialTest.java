package com.justinbett.ecommerce_demo_test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.Homepage;

@Listeners(resources.Listeners.class)
public class InitialTest extends Hooks {
	public InitialTest() throws IOException {
		super();
	}
	
	//Initial test to check setup functionality
	@Test
	public void initialTest() throws IOException {
		Homepage homePage = new Homepage();
		homePage.getShopNewYoga().click();
	}
}
