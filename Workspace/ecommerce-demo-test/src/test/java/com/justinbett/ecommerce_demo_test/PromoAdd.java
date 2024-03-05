package com.justinbett.ecommerce_demo_test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.CartPage;
import pageObjects.Homepage;
import pageObjects.ShirtsPromoPage;

public class PromoAdd extends Hooks {

	public PromoAdd() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void PromoTest () throws IOException, InterruptedException {
		Homepage homepage = new Homepage();
		ShirtsPromoPage shirtsPromo = new ShirtsPromoPage();
		CartPage cartPage = new CartPage();
		Actions action = new Actions(BasePage.getDriver());
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(5));
				
		homepage.getPromoFree().click();
		
		action.moveToElement(shirtsPromo.getShirt1()).perform();
		shirtsPromo.getShirt1Size().click();
		shirtsPromo.getShirt1Color().click();
		shirtsPromo.getShirt1Add().click();
		System.out.println("Added Shirt 1 to cart");
		
		wait.until(ExpectedConditions.visibilityOf(shirtsPromo.getCartQty()));
		
		action.moveToElement(shirtsPromo.getShirt2()).perform();
		shirtsPromo.getShirt2Size().click();
		shirtsPromo.getShirt2Color().click();
		shirtsPromo.getShirt2Add().click();
		System.out.println("Added Shirt 2 to cart");
		
		wait.until(ExpectedConditions.visibilityOf(shirtsPromo.getCartQty()));
		
		action.moveToElement(shirtsPromo.getShirt3()).perform();
		shirtsPromo.getShirt3Size().click();
		shirtsPromo.getShirt3Color().click();
		shirtsPromo.getShirt3Add().click();
		System.out.println("Added Shirt 3 to cart");
		
		wait.until(ExpectedConditions.visibilityOf(shirtsPromo.getCartQty()));
		
		action.moveToElement(shirtsPromo.getShirt4()).perform();
		shirtsPromo.getShirt4Size().click();
		shirtsPromo.getShirt4Color().click();
		shirtsPromo.getShirt4Add().click();
		System.out.println("Added Shirt 4 to cart");
		
		wait.until(ExpectedConditions.visibilityOf(shirtsPromo.getCartQty()));
		
		shirtsPromo.getCart().click();
		shirtsPromo.getViewEditCart().click();
		
		//WIP
		cartPage.getshirt1ItemQty().clear();
		cartPage.getshirt1ItemQty().sendKeys("4", Keys.ENTER);
		
		Thread.sleep(5000);
	}
	

}
