package com.interfaceElememnts;

public interface AdactinApplicationElements {
	//login elements
	
		String userrname_id = "username";
		String password_name = "password";
		String login_xpath = "//input[@type='Submit']";	
	

		//Search Hotel page elements

		String location_name = "location";
		String hotels_id = "hotels";
		String roomtype_name ="room_type";
		String numberofrooms_xpath = "(//select[@class='search_combobox'])[4]";
		String checkindate_name = "datepick_in";
		String checkoutdate_id = "datepick_out";
		String adultperroom_xpath = "(//select[@class='search_combobox'])[5]";
		String childperroom_name = "child_room";
		String submit_id = "Submit";
		String radiobtn_id = "radiobutton_0";
		String countinue_xpath = "(//input[@class='reg_button])[1]";
		
		
		
		
		//booking hotel page
		
		String firstname_name = "first_name";
		String lastname_id = "last_name";
		String billingaddress_name= "address";
		String creditcardnumber_id = "cc_num";
		String creditcardtype_id = "cc_type";
		String expirymonth_id = "cc_exp_month";
		String expiryyear_name = "cc_exp_year";
		String ccvnumber_xpath = "//input[@type='text']";
		String booknow_name = "book_now";
		String logoutbtn_name = "logout";


























}


