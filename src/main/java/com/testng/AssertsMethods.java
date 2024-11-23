package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class AssertsMethods extends Base_Class {
      
	
	
	
	@Test
	public void LoginPage() {
		  launchBrowser("chrome");
		  
		  launchUrl("https://www.facebook.com/");
		  
		  String actual = driver.findElement(By.name("login")).getText();
		  
		  System.out.println(actual);
		  
		  Assert.assertEquals(actual, "Log in");
		  
		  driver.findElement(By.id("email")).sendKeys("Tamil");
		  
	}
     @AfterMethod
    private void terminate() {
    	terminateBrowser();
    }

}
