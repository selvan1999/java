package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Base_Class;
import com.interfaceElememnts.AdactinApplicationElements;
import com.resources.FileReaderManager;

public class AdactinSearchPage extends Base_Class implements AdactinApplicationElements {
     
	@FindBy(name = location_name)
	private WebElement location;
	
	@FindBy(id = hotels_id )
	private WebElement hotels;
	
	@FindBy(name = roomtype_name)
	private WebElement roomtype;
	
	@FindBy(xpath = numberofrooms_xpath)
	private WebElement numberofrooms;
	
	@FindBy(name = checkindate_name)
	private WebElement checkindat;
	
	@FindBy(id = checkoutdate_id)
	private WebElement checkoutdate;
	
	@FindBy(xpath = adultperroom_xpath)
	private WebElement adultperroom;
	
	@FindBy(name = childperroom_name)
	private WebElement childperroom;
	
	@FindBy(id = submit_id)
	private WebElement submit;
	
	@FindBy(id = radiobtn_id)
	private WebElement radiobtn;
	
	@FindBy(xpath = countinue_xpath)
	private WebElement countinue;
	
	public void AdacatinSearchPage(WebDriver driver) {
		 PageFactory.initElements( driver, this);
	}


       public void searchHotel() throws IOException {
	        FileReaderManager search = new FileReaderManager();
	        selectViavalue(location,search.getDataProperty("location_name"));
	        selectViavalue(hotels,search.getDataProperty("hotels_id"));
	        selectViavalue(roomtype,search.getDataProperty("roomtype_name"));
	        selectViavalue(numberofrooms,search.getDataProperty("numberofrooms_xpath"));
	        passInput(checkindat,search.getDataProperty("checkindate_name"));
	        passInput(checkoutdate,search.getDataProperty("checkoutdate_id"));
	        selectViavalue(adultperroom,search.getDataProperty("adultperroom_xpath"));
	        selectViavalue(childperroom, search.getDataProperty("childperroom_name"));
	        click_the_element(submit);
	        click_the_element(radiobtn);
	        click_the_element(countinue);
	      
	        
       }





}
