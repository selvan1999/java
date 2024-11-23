package com.pageobjectmodel;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceElememnts.AdactinApplicationElements;
import com.resources.FileReaderManager;

public class AdactinHotelBooking extends Base_Class implements AdactinApplicationElements  {
        
	@FindBy(name = firstname_name)
	private WebElement firstname;
	
	@FindBy(id = lastname_id )
	private WebElement lastname;
	
	@FindBy(name = billingaddress_name)
	 private WebElement address;
	
	@FindBy(id = creditcardnumber_id)
	private WebElement creditcardnumber;
	
	@FindBy(id = creditcardtype_id)
	private WebElement creditcardtype;
	
	@FindBy(id = expirymonth_id)
	private WebElement expirymonth;
	
	@FindBy(name = expiryyear_name)
	private WebElement expiryyear;
	
	@FindBy(xpath = ccvnumber_xpath)
	private WebElement ccvnumber;
	
	@FindBy(name = booknow_name)
	private WebElement booknow;
	
	@FindBy(name = logoutbtn_name)
	private WebElement logoutbtn;
	
	
	public AdactinHotelBooking(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}

   public void hotelBook() throws IOException { 
	  FileReaderManager bookHotel = new FileReaderManager();
	  
	  
	  passInput(firstname,bookHotel.getDataProperty("firstname_name"));
	  passInput(lastname,bookHotel.getDataProperty("lastname_id"));
	  passInput(address,bookHotel.getDataProperty("billingaddress_name"));
	  passInput(creditcardnumber,bookHotel.getDataProperty(" passValues"));
	  selectViavisble_text(creditcardtype,bookHotel.getDataProperty("creditcardtype_id"));
	  selectViavisble_text(expirymonth,bookHotel.getDataProperty("expirymonth_id"));
	  selectViavisble_text(expiryyear,bookHotel.getDataProperty("expiryyear_name"));
	  passInput(ccvnumber,bookHotel.getDataProperty("expiryyear_name"));
	  click_the_element(booknow);
	  implicitWait(10);
	 
	
}



	
}







	
	
	
	
	
	
	
	
	
	
	

