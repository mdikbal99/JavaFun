package com.ttassesment.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ttassesment.base.BaseClass;

public class Amazon_SearchResultPage extends BaseClass{
	
	
	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]")
	WebElement flipcartFirstProduct;
	
	public Amazon_SearchResultPage() {
		//PageFactory.initElements(driver, this);
	}
	
	public AddToCartPage amazonClickFirstproduct() throws Exception {

		// Action.click(driver, firstProduct);

		String firstproductUrl = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]")).getAttribute("href");
		System.out.println(firstproductUrl);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform(); // opening the URL saved.
		driver.get(firstproductUrl);

		System.out.println(driver.getTitle());
		return new AddToCartPage();

	}
	
	
	
}
