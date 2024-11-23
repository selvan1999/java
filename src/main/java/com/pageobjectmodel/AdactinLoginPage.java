package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceElememnts.AdactinApplicationElements;
import com.resources.FileReaderManager;

public class AdactinLoginPage extends Base_Class implements AdactinApplicationElements {

	@FindBy(id = userrname_id)
	private WebElement username;
	
	@FindBy(name = password_name)
	private WebElement password;
	
	@FindBy(xpath =login_xpath)
	private WebElement login;
	
	public  AdactinLoginPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
	}
	public void validUserNameAndValidPassword() throws IOException {
		FileReaderManager data = new FileReaderManager();
		passInput(username,data.getDataProperty("username"));
		passInput(password,data.getDataProperty("password"));
		click_the_element(login);
	}
	
	}
	
	

