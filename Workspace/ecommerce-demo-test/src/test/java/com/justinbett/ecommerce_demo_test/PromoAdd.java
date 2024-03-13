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
import pageObjects.CartPage;
import pageObjects.Homepage;
import pageObjects.ShirtsPromoPage;

public class PromoAdd extends Hooks {

	public PromoAdd() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void promoTest() throws IOException, InterruptedException {
		Homepage homepage = new Homepage();
		ShirtsPromoPage shirtsPromo = new ShirtsPromoPage();
		CartPage cartPage = new CartPage();
		Actions action = new Actions(BasePage.getDriver());
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(30));
		String getAddedMessageText;
		
		homepage.getPromoFree().click();
		
		action.moveToElement(shirtsPromo.getShirt1()).perform();
		shirtsPromo.getShirt1Size().click();
		shirtsPromo.getShirt1Color().click();
		shirtsPromo.getShirt1Add().click();
		getAddedMessageText = shirtsPromo.getAddedMessage().getText();
		wait.until(ExpectedConditions.textToBePresentInElement(shirtsPromo.getAddedMessage(), getAddedMessageText));
		System.out.println("promoTest(): " + getAddedMessageText);
		
		shirtsPromo.getCart().click();
		shirtsPromo.getViewEditCart().click();
		
		cartPage.getshirt1ItemQty().clear();
		cartPage.getshirt1ItemQty().sendKeys("4", Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOf(cartPage.getDiscountTotal()));
		
		Assert.assertEquals("-$24.00", cartPage.getDiscountTotal().getText());
		System.out.println("promoTest(): " + cartPage.getDiscountTotal().getText() + " discount applied.");
	}
}
