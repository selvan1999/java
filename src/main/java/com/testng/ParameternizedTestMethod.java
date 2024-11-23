package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class ParameternizedTestMethod extends Base_Class {
     
	@BeforeTest
	public void browserlaunch() {
		launchBrowser("chrome");
	}
	
	@Test
	@Parameters ({"userData", "passData}"})
	public void loginPage(String username, String password) {
		  
		launchUrl("https://www.facebook.com/");
		  
		  WebElement email = driver.findElement(By.id("email"));
			 email.sendKeys(username);
			 
	       WebElement pass = driver.findElement(By.id("pass"));
              pass.sendKeys(password);
              
             WebElement loginbtn = driver.findElement(By.name("login"));
     		 loginbtn.click();   
			 
	}
	
	@AfterTest
	private  void terminate() {
		
	}
	
	
	
	
}
