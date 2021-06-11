package com.sgteating.assgnDataProviderTestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo9 {

	public static Logger log=Logger.getLogger("actitime testing");

	public static ChromeDriver oBrowser=null;
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=3)
	public void loginCreate()
	{
		try
		{
			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};
			for(int i=0;i<3;i++)
			{
				oBrowser.findElement(By.id("username")).sendKeys(s[i]);
				oBrowser.findElement(By.name("pwd")).sendKeys(a[i]);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(10000);

				log.info("logged into the application successfully");
				
				if (i==0)
				{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				}
				if(i>0)
				{

					oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
					Thread.sleep(10000);
				}
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.name("firstName")).sendKeys("user"+i);
				oBrowser.findElement(By.name("lastName")).sendKeys("demo"+i);
				oBrowser.findElement(By.name("email")).sendKeys("demo"+i+"@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys(s[i+1]);
				oBrowser.findElement(By.name("password")).sendKeys(a[i+1]);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys(a[i+1]);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(5000);

				log.info("user"+i+"created successfully");
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				log.info("logged out of the application successfully");

			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=4)
	public void loginModify()
	{
		try
		{

			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};

			String b[]= {"//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]"};
			
			for(int i=0;i<3;i++)
			{
				oBrowser.findElement(By.id("username")).sendKeys(s[i]);
				oBrowser.findElement(By.name("pwd")).sendKeys(a[i]);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(10000);

				log.info(s[i]+" logged into the application successfully");
				
				if (i==0)
				{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(10000);
				}
				if(i>0)
				{

					oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
					Thread.sleep(10000);
				}

				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath(b[i])).click();
				Thread.sleep(7000);
				oBrowser.findElement(By.name("lastName")).sendKeys("new"+i);
				Thread.sleep(7000);
				oBrowser.findElement(By.xpath( "//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(3000);

				log.info("modified the user"+i+" successfully");
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(10000);
				log.info("logged out of the application successfully");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	

	

	@Test(priority=5)
	public void deleteUser()
	{
		try
		{

			String s[]= {"admin","user1","user2","user3"};
			String a[]= {"manager","manager1","manager2","manager3"};
			String b[]= {"//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]","//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]"};
			for(int i=2;i>=0;i--)
			{
				oBrowser.findElement(By.id("username")).sendKeys(s[i]);
				oBrowser.findElement(By.name("pwd")).sendKeys(a[i]);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(6000);

				log.info(s[i]+" logged into the application successfully");
				
				if (i==0)
				{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				}
				
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath(b[i])).click();
				Thread.sleep(5000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(5000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);

				log.info(" modified the user successfully");
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				log.info("logged out of the application successfully");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=6)
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
