package com.interfaceElememnts;

public interface OpenmrsApplictionElements {
     
	//login elements
	
			String username_id = "username";
			String password_id = "password";
			String location_xpath ="//li[@id='Inpatient Ward']";
			String login_id = "loginButton";
		    String errorMassage_xpath = "//div[text() ='Invalid username/password. please try again.']";
		    String locationerror_xpath ="//*[text() ='you must choose a location!']";
}