package com.ttassesment.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ttassesment.actiondriver.Action;
import com.ttassesment.base.BaseClass;

public class Amazon_CartPage extends BaseClass{
	
	@FindBy(xpath = "(//button[@class='_23FHuj'])[2]")
	WebElement amazonIncreaseBtn;
	
	@FindBy(xpath = "(//span[contains(@text(),'')])[13]")
	WebElement amazonPriceEle;
	
	public Amazon_CartPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void flipcartIncreaseQuantity()throws InterruptedException {
		System.out.println(driver.getTitle());

		Action.click(driver, amazonIncreaseBtn);
		Thread.sleep(3000);
		
		
		
	}
	
	public int amazonProductPrice() {
		String price= amazonPriceEle.getText();
		price=price.replaceAll("[^a-zA-Z0-9]", "");
		int product_price = Integer.parseInt(price);
		System.out.println("Total Amount:-"+ product_price);
		return product_price;
	
	}
	public Amazon_HomePage launchAmazone() {
		Actions action =
				  new Actions(driver);
				  action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform(); //opening the URL saved. 
				  driver.get("https://www.amazon.in/");
		Action.implicitWait(driver, 10);
		System.out.println(driver.getTitle());
		
		  String parent=driver.getWindowHandle(); 
		driver.switchTo().window(parent);
		  System.out.println(driver.getTitle());
		 
		
		return new Amazon_HomePage();
	}
	

	

}
