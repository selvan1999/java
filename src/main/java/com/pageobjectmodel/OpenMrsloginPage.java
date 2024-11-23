package com.pageobjectmodel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceElememnts.OpenmrsApplictionElements;

import com.resources.OpenMrsFileReaderManager;

public class OpenMrsloginPage extends Base_Class implements OpenmrsApplictionElements {
      
	@FindBy(id = username_id)
	private WebElement username;
	
	@FindBy(id = password_id)
	private WebElement password;
	
	@FindBy(xpath = location_xpath)
	private WebElement location;
	
	@FindBy(id = login_id)
	private WebElement loginButton;
	
	
	
	public OpenMrsloginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public boolean valiUserNameAndPassword() {
		try {
			OpenMrsFileReaderManager data =new OpenMrsFileReaderManager();
			launchUrl(data.getDataProperty("url"));
			passInput(username, data.getDataProperty("username"));
			passInput(password, data.getDataProperty("password"));
			click_the_element(location);
			validation(driver.getTitle(),data.getDataProperty("titel"));
		}catch (Exception e) {
			
			Assert.fail("ERROR : occur during validation");
		}
		return true;
		
	}

      public boolean ValidUserNameAndInValidPassword() {
    	  try {
  			OpenMrsFileReaderManager data =new OpenMrsFileReaderManager();
  			launchUrl(data.getDataProperty("url"));
  			passInput(username, data.getDataProperty("username"));
  			passInput(password, data.getDataProperty("empty"));
  			click_the_element(location);
  			validation(driver.getTitle(),data.getDataProperty("invaliderror"));
  		}catch (Exception e) {
  			
  			Assert.fail("ERROR : occur during validation");
  		}
		return true;
      }
	
	 public boolean InvaliUserNameAndValidPassword() {
		  try {
	  			OpenMrsFileReaderManager data =new OpenMrsFileReaderManager();
	  			launchUrl(data.getDataProperty("url"));
	  			passInput(password, data.getDataProperty("password"));
	  			click_the_element(location);
	  			click_the_element(loginButton);
	  			validation(driver.getTitle(),data.getDataProperty("invaliderror"));
	  		}catch (Exception e) {
	  			
	  			Assert.fail("ERROR : occur during validation");
	  		
	  		}
		 return true;
		 
	 }
	
	public boolean WithoutClickingLocation () {
		try {
  			OpenMrsFileReaderManager data =new OpenMrsFileReaderManager();
  			launchUrl(data.getDataProperty("url"));
  			passInput(username, data.getDataProperty("username_id"));
  			passInput(password, data.getDataProperty("password_id"));
  		//	click_the_element(location);
  			click_the_element(loginButton);
  			validation(driver.getTitle(),data.getDataProperty("locationerror"));
  		}catch (Exception e) {
  			
  			Assert.fail("ERROR : occur during validation");
  		
  		}
		return true;
		
	}


	

		
	}
	
	
	
	 	
	

