package com.sgteating.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();

	}
	
	static void launchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}