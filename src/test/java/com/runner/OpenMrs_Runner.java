package com.runner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.pageobjectmanager.OpenMrsPageObjectManager;

public class OpenMrs_Runner extends Base_Class {
	OpenMrsPageObjectManager pageobjectmanager = new OpenMrsPageObjectManager();
	
	
	@BeforeTest
	public void setup() throws IOException {
		launchBrowser(pageobjectmanager.getFilereader().getDataProperty("browser"));
	}
	@Test()
	public void invaliCredentials() {
		Assert.assertTrue(pageobjectmanager.getLoginPage().ValidUserNameAndInValidPassword());
		
	}
	@Test
	public void withoutLocation() {
		Assert.assertTrue(pageobjectmanager.getLoginPage().InvaliUserNameAndValidPassword());
	}
	
	@Test
	public void withoutAnydate() {
		Assert.assertTrue(pageobjectmanager.getLoginPage().WithoutClickingLocation());
	}
	@Test
	public void validcredntials() {
		Assert.assertTrue(pageobjectmanager.getLoginPage().ValidUserNameAndInValidPassword());
	}
	@AfterTest
    private void termine() {
    	terminateBrowser();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
