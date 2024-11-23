package com.testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class DataProviderMaethods extends Base_Class {
      
	
	@BeforeTest
	public void browserlaunch() {
		launchBrowser("chrome");
	}
	
	@Test(dataProvider ="login")
	public void login(String username, String password) {
		  launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.xpath("//button[text() ='Login']")).click();
			 
	      
			 
	}

    @DataProvider(name = "login")
    public Object[][] datavalues(){
		return new Object[][] 
				{  {"A", "526" }, {"B", "1568455"  } , {"Admin", "admin123"}  };
    }	 
    
    
     }




