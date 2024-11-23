package com.runner;

import java.io.IOException;

import com.baseclass.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class AdactinRunner extends Base_Class {
	
	public static void main(String[] args) throws IOException  {
		PageObjectManager pageobj = new PageObjectManager();
		launchBrowser(pageobj.getReader().getDataProperty("browser"));
		launchUrl(pageobj.getReader().getDataProperty("url"));
		pageobj.getLoginPage().validUserNameAndValidPassword();
		pageobj.getSearchPage().searchHotel();
		pageobj.getHotelBooking().hotelBook();
	}

}
