package com.runner;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class DataDriverTestClass {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    String username = ReadExcelData.readParticularCellData("sheet1", 1, 0);
	    String password = ReadExcelData.readParticularCellData("sheet1", 1, 1);
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.name("pass")).sendKeys(password);
	}
	
	
}
