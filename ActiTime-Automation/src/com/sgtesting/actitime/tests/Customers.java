package com.sgtesting.actitime.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Customers extends Initialization {
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void createCustomer()
	{
		try
		{oBrowser.findElement(By.xpath( "//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath( "//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("customer1");
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
		Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void modifyCustomer()
	{
		try
		{oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath( "//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("new customer");
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[1]")).click();
		Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void deleteCustomer()
	{
		try
		{oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath( "//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
		Thread.sleep(3000);
		
		oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[5]/a")).click();
		Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
