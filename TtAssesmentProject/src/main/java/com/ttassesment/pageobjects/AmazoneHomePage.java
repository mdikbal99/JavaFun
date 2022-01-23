package com.ttassesment.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ttassesment.actiondriver.Action;
import com.ttassesment.base.BaseClass;

public class AmazoneHomePage extends BaseClass{
	
	@FindBy(xpath = "//input[@type='text' and @id='twotabsearchtextbox']")
	WebElement amazoneSearchBox;
	@FindBy(xpath = "//input[@type='submit' and @id='nav-search-submit-button']")
	WebElement amazoneSearchBtn;
	public AmazoneHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void amazoneSearchProduct() throws InterruptedException {
		
		//driver.findElement(By.xpath("//input[@type='text' and @id='twotabsearchtextbox']")).sendKeys(productName1,Keys.TAB);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'vu tv')", amazoneSearchBox);
		Action.click(driver, amazoneSearchBtn);
		Thread.sleep(5000);
		
		
	}

}
