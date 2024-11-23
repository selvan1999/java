package com.runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;

public class TestRunner extends Base_Class{
     
	public static void main(String[] args) throws IOException {
		launchBrowser("chrome");
		launchUrl("https://www.google.com/");
	    WebElement el= driver.findElement(By.name("q"));
	    passInput(el, "fruits");
	    getScreen("After login");
	
	
	
	
	} 

	
		
	
	
	
	
	
	
	
	}
