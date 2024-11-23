package com.testng;

import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class CrossBrowserTesting extends Base_Class {
  
	@Test(priority = 7)
	private void edgeBrowser() {
		launchBrowser("edge");
		launchUrl("http://www.google.com");
		System.out.println("Browser ID: " + Thread.currentThread().getId());
		terminateBrowser();
	
	}

   @Test(priority = 1)
	private void chromeBrowser() {   
	   launchBrowser("chrome");
		launchUrl("http://www.google.com");
		System.out.println("Browser ID: " + Thread.currentThread().getId());
		terminateBrowser();
	
   }
  
  @Test(priority = 0)
  private void firefoxBrowser() {
	  launchBrowser("firefox");
		launchUrl("http://www.google.com");
		System.out.println("Browser ID: " + Thread.currentThread().getId());
		terminateBrowser();
	
  }




}
