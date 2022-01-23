package com.ttassesment.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ttassesment.actiondriver.Action;
import com.ttassesment.base.BaseClass;

public class AddToCartPage extends BaseClass{
	@FindBy(className = "_2KpZ6l _2U9uOA _3v1-ww")
	WebElement flipcartAddToCartBtn;
	
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	public CartPage flipcartAddToCart() throws Exception {
		//Action.switchWindowByTitle(driver, "Shopping Cart | Flipkart.com", 1);
		System.out.println(driver.getTitle());
		Action.click(driver, flipcartAddToCartBtn);
		
		
		return new CartPage();
		//Action.click(driver, increaseBtn);
		
	}

}
