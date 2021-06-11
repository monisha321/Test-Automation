package com.sgteating.tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowserdemo {
	//public  WebDriver oBrowser=null;
	public static  WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//closeapp();
	}
	static void launchBrowser()
	{
		String path=null;
		try
		{
			//Chromebrowserdemo obj=new Chromebrowserdemo();//object creation is not necessary when static is used as shown--> "public static  WebDriver oBrowser=null;"
			
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\LIBRARY\\Drivers\\chromedriver.exe");//sets path in environment variable only during run time --to access the chromedriver thru its path--->this path can also be provided "E:\DemoWorkspace\Web-Automation\LIBRARY\Drivers\chromedriver.exe"
			System.out.println(path);
			oBrowser =new ChromeDriver();
			//obj.oBrowser =new ChromeDriver();//object created based on webdriver interface reference i.e., oBrowser--->instaead of obj.oBrowser just oBrowser is enough if we have static as shown-->"public static  WebDriver oBrowser=null;"
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
