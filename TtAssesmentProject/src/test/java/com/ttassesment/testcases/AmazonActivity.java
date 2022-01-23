package com.ttassesment.testcases;

import com.ttassesment.actiondriver.Action;
import com.ttassesment.base.BaseClass;
import com.ttassesment.pageobjects.Amazon_HomePage;

public class AmazonActivity extends BaseClass {
	public static Amazon_HomePage launchAmazone() {
		Action.implicitWait(driver, 10);
		Action.pageLoadTimeOut(driver, 30);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url2"));
		Action.implicitWait(driver, 10);
		System.out.println(driver.getTitle());
		
		  String parent=driver.getWindowHandle(); 
		driver.switchTo().window(parent);
		  System.out.println(driver.getTitle());
		 
		
		return new Amazon_HomePage();
	}
}
