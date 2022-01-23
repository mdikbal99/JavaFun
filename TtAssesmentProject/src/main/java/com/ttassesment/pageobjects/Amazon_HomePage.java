package com.ttassesment.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ttassesment.actiondriver.Action;
import com.ttassesment.base.BaseClass;

public class Amazon_HomePage extends BaseClass{
	
	@FindBy(xpath = "//input[@type='text' and @id='twotabsearchtextbox']")
	WebElement amazoneSearchBox;
	@FindBy(xpath = "//input[@type='submit' and @id='nav-search-submit-button']")
	WebElement amazoneSearchBtn;
	public Amazon_HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public Amazon_SearchResultPage amazoneSearchProduct() throws InterruptedException {
		
		//driver.findElement(By.xpath("//input[@type='text' and @id='twotabsearchtextbox']")).sendKeys(productName1,Keys.TAB);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'macbook air')", amazoneSearchBox);
		Action.click(driver, amazoneSearchBtn);
		Thread.sleep(5000);
		return new Amazon_SearchResultPage();
		
	}


}
