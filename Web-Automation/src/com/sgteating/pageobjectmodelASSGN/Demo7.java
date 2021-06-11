package com.sgteating.pageobjectmodelASSGN;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgteating.pageobjectmodel.ActiTimePages;

public class Demo7 {
	public static WebDriver oBrowser=null;

	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		logout();
		login1();
		login1();
		login1();
		login();
		deleteUser();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\LIBRARY\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login1()
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
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
				Thread.sleep(6000);
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createUser()
	{
		try
		{
			oPage.createU().click();
			Thread.sleep(2000);
			for(int i=1;i<=3;i++)
			{
				oPage.addU().click();
				Thread.sleep(4000);
				
				oPage.firstname().sendKeys("demo1"+i);
				oPage.lastname().sendKeys("User"+i);
				oPage.Email().sendKeys("demo"+i+"@gmail.com");
				oPage.userNa().sendKeys("user11"+i);
				oPage.password().sendKeys("Welcome1"+i);
				oPage.passwordC().sendKeys("Welcome1"+i);
				oPage.commit().click();
				Thread.sleep(5000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{
			String s[]= {"//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[4]/td[1]","//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[3]/td[1]","//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[2]/td[1]"};
			for(int i=0;i<=2;i++)
			{
				oBrowser.findElement(By.xpath(s[i])).click();
				Thread.sleep(5000);
				oPage.deletebtn().click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
