package com.ttassesment.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ttassesment.base.BaseClass;

public class SearchResultPage extends BaseClass{
	
	
	
	@FindBy(xpath = "(//a[@class='_1fQZEK'])[1]")
	WebElement flipcartFirstProduct;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AddToCartPage flipcartClickFirstproduct() throws Exception {

		// Action.click(driver, firstProduct);

		String firstproductUrl = driver.findElement(By.xpath("(//a[@class='_1fQZEK'])[1]")).getAttribute("href");
		System.out.println(firstproductUrl);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform(); // opening the URL saved.
		driver.get(firstproductUrl);

		System.out.println(driver.getTitle());
		return new AddToCartPage();

	}
	
	
	
}
