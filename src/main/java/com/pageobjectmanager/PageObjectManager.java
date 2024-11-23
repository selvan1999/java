package com.pageobjectmanager;

import com.baseclass.Base_Class;
import com.pageobjectmodel.AdactinHotelBooking;
import com.pageobjectmodel.AdactinLoginPage;
import com.pageobjectmodel.AdactinSearchPage;
import com.resources.FileReaderManager;

public class PageObjectManager extends Base_Class {
     FileReaderManager reader;
     AdactinLoginPage loginPage;
     AdactinSearchPage search;
     AdactinHotelBooking hotelBooking;
     
     public FileReaderManager getReader() {
		if (reader == null) {
			reader = new FileReaderManager();
		}
    	  return reader;
    	 }
	public AdactinLoginPage getLoginPage() {
		if(loginPage == null) {
			loginPage = new AdactinLoginPage(driver);
		}
	return loginPage;
		}
	 public  AdactinSearchPage getSearchPage() {
		if (search == null) {
			search = new AdactinSearchPage();
		}
		 return search;
		}
	 public AdactinHotelBooking getHotelBooking(){
		if(hotelBooking == null) {
			
		
			hotelBooking = new AdactinHotelBooking(driver);
		}
		 return hotelBooking;
		
		
	 }
	 
}
