package com.utility;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnector {
 public static String getparticularData() throws SQLException {
	
	 String url = "jdbc:mysql://localhost:3306/employees";
	 String username = "root";
	 String password = "Root@123";
	 String query = "select * from employees"; 
	
   //connection Estabilize
	 Connection connection=DriverManager.getConnection(url, username, password);
	 
	 //Create a statement
	 Statement statement=connection.createStatement();
	//Execut Query
	 ResultSet result=statement.executeQuery(query);
	 
	 
	 result.next();
	 
	 
	 int employeeNo=result.getInt(1);
	 System.out.println(employeeNo);
	 
	 Date date=result.getDate(2);
	 System.out.println(date);
	 
	 result.next();
	 result.next();
	 
	 
	 String firstname=  result.getString(3);
	 System.out.println(firstname);
	 return firstname;
 } 
	public static void main(String[] args) throws SQLException {
		getparticularData();
	}
 }	

