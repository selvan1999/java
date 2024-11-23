package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class OpenMrsFileReaderManager {
	private static Properties property;
	private static FileInputStream FileInputStream;
	
	private static void setupProperty() throws IOException {
		if (property == null ) {
			File file = new File("C:\\Users\\stami\\eclipse-workspace\\Greens\\src\\main\\java\\com\\resources\\Openmrsloginpage.properties");
			try {
				FileInputStream  = new FileInputStream(file);
				property = new Properties();
				property.load(FileInputStream);
			}catch (FileNotFoundException e) {
				Assert.fail("ERROR IN LOADING FILE");
			}catch (Exception e) {
				Assert.fail("error in loading file");
			}
		}
	}
	

    
      public String getDataProperty(String dataValue) throws IOException {
		setupProperty();
		String inputdata = property.getProperty(dataValue);
    	  
    	  return inputdata;  
    	  
      }}



