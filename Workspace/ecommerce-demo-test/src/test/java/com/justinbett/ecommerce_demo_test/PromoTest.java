package com.justinbett.ecommerce_demo_test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.CheckoutReviewPage;
import pageObjects.Homepage;
import pageObjects.ShirtsPromoPage;

@Listeners(resources.Listeners.class)
public class PromoTest extends Hooks {

	public PromoTest() throws IOException {
		super();
	}
	
	@Test
	public void promoAdd() throws IOException {
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
		System.out.println("promoAdd(): " + getAddedMessageText);
		shirtsPromo.getCart().click();
		shirtsPromo.getViewEditCart().click();
		cartPage.getItem1Qty().clear();
		cartPage.getItem1Qty().sendKeys("4", Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(cartPage.getDiscountTotal()));
		Assert.assertEquals("-$24.00", cartPage.getDiscountTotal().getText());
		System.out.println("promoAdd(): " + cartPage.getDiscountTotal().getText() + " discount applied.");
		cartPage.getCheckoutBtn().click();
	}
	
	@Test(dependsOnMethods = {"promoAdd"})
	public void promoCheckoutLogin() throws IOException {
		CheckoutPage checkoutPage = new CheckoutPage();
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(30));
		
		checkoutPage.getEmail().sendKeys("jbtest123@test.com", Keys.ENTER);
		checkoutPage.getPassword().sendKeys("AB#$12345");
		checkoutPage.getLoginBtn().click();
		wait.until(ExpectedConditions.invisibilityOf(checkoutPage.getLoginBtn()));
	}
	
	@Test(dependsOnMethods = {"promoCheckoutLogin"})
	public void promoCheckout() throws IOException {
		CheckoutPage checkoutPage = new CheckoutPage();
		WebDriverWait wait = new WebDriverWait(BasePage.getDriver(), Duration.ofSeconds(30));
		CheckoutReviewPage checkoutReviewPage = new CheckoutReviewPage();
		String orderNumber;
		
		wait.until(ExpectedConditions.visibilityOf(checkoutPage.getNextBtn())).click();
		//NOTE: Using Element clicks to click the button caused "Element is not clickable at point" errors due to overlapping elements. Resorted to using the JavaScriptExecutor to handle the click of the button in its place.
		JavascriptExecutor jsExecutor = (JavascriptExecutor)BasePage.getDriver();
		jsExecutor.executeScript("arguments[0].click();", checkoutReviewPage.getPlaceOrderBtn());
		wait.until(ExpectedConditions.visibilityOf(checkoutReviewPage.getOrderNumber()));
		orderNumber = checkoutReviewPage.getOrderNumber().getText();
		System.out.println(orderNumber);
	}
}
