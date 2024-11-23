package com.pageobjectmanager;

import com.baseclass.Base_Class;
import com.pageobjectmodel.OpenMrsloginPage;

import com.resources.OpenMrsFileReaderManager;

public class OpenMrsPageObjectManager extends Base_Class {
      private OpenMrsFileReaderManager fileReader;
      private OpenMrsloginPage loginPage;
      
      
      public OpenMrsFileReaderManager getFilereader() {
    	  if (fileReader == null) {
    		  fileReader = new OpenMrsFileReaderManager();
    	  }
		return fileReader;
    	                    
      }
      
      public OpenMrsloginPage getLoginPage() {
    	  if (loginPage == null) {
    		  loginPage = new OpenMrsloginPage(driver);
    	  }
		return loginPage;
      }
    
      
      
      
      
      
      
      
      
      
      
}
