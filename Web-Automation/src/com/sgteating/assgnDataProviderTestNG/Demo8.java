package com.sgteating.assgnDataProviderTestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo8 {
	public static Logger log=Logger.getLogger("actitime testing");


	public static WebDriver oBrowser=null;
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\LIBRARY\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			log.info("chrome browser has been successfully launched");
			
			oBrowser.manage().window().maximize();
			log.info("browser has been maximsed");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			log.info("navigated to actitime application successfully");
			
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=3)
	public void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(7000);
			log.info("logged into the application successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void loginn()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(7000);
			log.info("logged into the application successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=6)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			log.info("logged out of the application successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=10)
	public void logoutt()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(8000);
			log.info("logged out of the application successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
			log.info("flyout window has been minimised successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void login1()
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				String s3="user11"+i;
				String s4="Welcome1"+i;
				oBrowser.findElement(By.id("username")).sendKeys(s3);
				oBrowser.findElement(By.name("pwd")).sendKeys(s4);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(15000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
				Thread.sleep(15000);

				log.info("user "+i+"has been logged in successfully");
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(6000);

				log.info("user"+i+" has been logged out successfully");
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	public void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			for(int i=1;i<=3;i++)
			{
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(7000);
				String s="user"+i;
				String s1="demo"+i;
				String s2="demo@gmail"+i+".com";
				String s3="user11"+i;
				String s4="Welcome1"+i;
				String s5="Welcome1"+i;
				oBrowser.findElement(By.name("firstName")).sendKeys(s1);
				oBrowser.findElement(By.name("lastName")).sendKeys(s);
				oBrowser.findElement(By.name("email")).sendKeys(s2);
				oBrowser.findElement(By.name("username")).sendKeys(s3);
				oBrowser.findElement(By.name("password")).sendKeys(s4);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys(s5);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(7000);

				log.info("user"+i+" has been created successfully");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=9)
	public void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(10000);
			String s[]= {"//*[@id='userListTableContainer']/table/tbody/tr[4]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]"};
			for(int i=0;i<=2;i++)
			{
				oBrowser.findElement(By.xpath(s[i])).click();
				Thread.sleep(12000);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
				Thread.sleep(12000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();

				log.info("user"+i+" has been deleted successfully");
				Thread.sleep(10000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=11)
	public void closeApplication()
	{
		try
		{
			oBrowser.close();
			log.info("chrome browser has been closed");
			log.info("-------------------------------------------");
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
