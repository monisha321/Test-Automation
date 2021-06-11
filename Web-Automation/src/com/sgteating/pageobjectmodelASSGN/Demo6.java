package com.sgteating.pageobjectmodelASSGN;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgteating.pageobjectmodel.ActiTimePages;
public class Demo6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePages oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		//createUser();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		//deleteProject();
		//deleteCustomer();
		//deleteUser();

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
			oPage=new ActiTimePages(oBrowser);
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
			oPage.addU().click();
			Thread.sleep(4000);
			oPage.firstname().sendKeys("demo1");
			oPage.lastname().sendKeys("User");
			oPage.Email().sendKeys("demo@gmail.com");
			oPage.userNa().sendKeys("user11");
			oPage.password().sendKeys("Welcome1");
			oPage.passwordC().sendKeys("Welcome1");
			oPage.commit().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{
			oPage.createU().click();
			Thread.sleep(5000);
			oPage.user1().click();
			Thread.sleep(5000);
			oPage.deletebtn().click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
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



	static void flyOutWindow()
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

	static void createCustomer()
	{
		try
		{

			oPage.newCustomer().click();
			Thread.sleep(3000);
			oPage.addCust().click();
			Thread.sleep(3000);
			oPage.Cust1().click();
			Thread.sleep(3000);
			oPage.custname().sendKeys("customer1");
			Thread.sleep(3000);
			oPage.commitcust().click();
			Thread.sleep(3000);



		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteCustomer()
	{
		try
		{

			oPage.Custaction().click();
			Thread.sleep(3000);
			oPage.action().click();
			Thread.sleep(3000);
			oPage.deletecust().click();
			Thread.sleep(3000);

			oPage.deletecustbtn().click();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyCustomer()
	{
		try
		{

			oPage.Custaction().click();
			Thread.sleep(3000);
			oPage.modifycust().sendKeys("new customer");
			Thread.sleep(3000);
			oPage.closecustaction().click();
			Thread.sleep(3000);
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{

			oPage.addCust().click();
			Thread.sleep(3000);
			oPage.projectadd().click();
			Thread.sleep(3000);
			oPage.projectname().sendKeys("project1");
			Thread.sleep(3000);
			
			oPage.projectcommit().click();
			Thread.sleep(3000);
			oPage.projectclick().click();
			Thread.sleep(3000);
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{

			oPage.projectsettings().click();
			Thread.sleep(3000);
			oPage.projectaction().click();
			Thread.sleep(3000);
			oPage.projectdelete().click();
			Thread.sleep(3000);
			oPage.projectdeletep().click();
			Thread.sleep(3000);
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyProject()
	{
		try
		{

			oPage.projectsettings().click();
			Thread.sleep(3000);
			oPage.pmodify().sendKeys("new project");
			Thread.sleep(3000);
			oPage.pclose().click();
			Thread.sleep(3000);
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createTask()
	{

		try
		{

			oPage.taskd().click();
			Thread.sleep(3000);
			oPage.taskadd().click();
			Thread.sleep(3000);
			oPage.taskname().sendKeys("task1");
			Thread.sleep(3000);
			oPage.taskcommit().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteTask()
	{
		try
		{
			oPage.tasktab().click();
			Thread.sleep(3000);
			oPage.taskaction().click();
			Thread.sleep(3000);
			oPage.taskdel().click();
			Thread.sleep(3000);
			oPage.taskdelp().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
