package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.resources.ExcelUtility;

public class TimeOutMethods extends Base_Class {
      
	@Test
	public void LoginPage() {
		  launchBrowser("chrome");
		  
		  launchUrl("https://www.facebook.com/");
		  
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys(ExcelUtility.getCellValue("Tamil", "user1", "username"));
		 
		 WebElement password = driver.findElement(By.id("pass"));
		 
		 password.sendKeys(ExcelUtility.getCellValue("Tamil", "user2", "password"));
		 
		 WebElement loginbtn = driver.findElement(By.name("login"));
		 loginbtn.click();
	
	
}
}