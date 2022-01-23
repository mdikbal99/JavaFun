package com.ttassesment.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ttassesment.actiondriver.Action;
import com.ttassesment.base.BaseClass;

public class Amazon_AddToCartPage extends BaseClass{
	@FindBy(className = "_23FHuj")
	WebElement amazonAddToCartBtn;
	
	
	public Amazon_AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	public Amazon_CartPage amazonAddToCart() throws Exception {
		//Action.switchWindowByTitle(driver, "Shopping Cart | Flipkart.com", 1);
		System.out.println(driver.getTitle());
		Action.click(driver, amazonAddToCartBtn);
		
		
		return new Amazon_CartPage();
		//Action.click(driver, increaseBtn);
		
	}

}
