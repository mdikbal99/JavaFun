package com.ttassesment.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ttassesment.base.BaseClass;
import com.ttassesment.pageobjects.AddToCartPage;
import com.ttassesment.pageobjects.CartPage;
import com.ttassesment.pageobjects.HomePage;
import com.ttassesment.pageobjects.SearchResultPage;

public class FlipCartGetPriceOfProductAfterAddition extends BaseClass{
	HomePage homepage;
	SearchResultPage searchResultPage;
	CartPage cartPage;
	AddToCartPage addToCartPage;
	
	@BeforeMethod
	public void setup() throws Exception {
		launchApp();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void getTotalAmount() throws Exception {
		 homepage=new HomePage();
		 searchResultPage=homepage.flipcartSearchProduct("ipad");
		 addToCartPage=searchResultPage.flipcartClickFirstproduct();
		Thread.sleep(2000);
		cartPage=addToCartPage.flipcartAddToCart();
		Thread.sleep(5000);
		cartPage.flipcartIncreaseQuantity();
		int a=cartPage.flipcartProductPrice();
		//System.out.println(a);
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}
	
	
	

}
