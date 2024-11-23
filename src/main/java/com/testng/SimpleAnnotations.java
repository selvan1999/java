package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	@BeforeSuite
  private void propertySetting() {
	 System.out.println("propertySetting"); 
	  }
 @BeforeTest
 private void browserLaunch() {
	 System.out.println("Browser Launch");
	}
 @BeforeClass
  private void urlLaunch() {
	  System.out.println("Url Launch");
  }
   @BeforeMethod
 private void login() {
	 System.out.println("Login");
 }
  @Test
  
 private void women() {
	   System.out.println("women");
	 
 }
 @Test
 private void Men() {
	System.out.println("men");
}
 @Test
 private void Kids() {
	 System.out.println("Kids");
 }
 @AfterMethod
 private void Logout() {
	 System.out.println("Logout");
 }
 @AfterClass
 private void ScreenShot() {
	 System.out.println("ScreenShot");
 }
 @AfterTest
 private void CloseBrowser() {
	 System.out.println("CloseBrowser");
 }











}
