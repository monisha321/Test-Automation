package com.sgtesting.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
	//@Parameters(value="UserName")
	@Test
	//public void createUser(String UserName)
	public void createUser()
	{
		System.out.println("The User  has created Successfully...");
	}
	
	@Test
	public void modifyUser()
	{
		System.out.println("The User demoUser1 has modified Successfully...");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("The User demoUser1 has deleted Successfully...");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser and Navigate the Application URL and Login into the Application Succesfully");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Perform Logout operation and Close The Application!!!!!");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}

}
