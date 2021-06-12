package com.sgtesting.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.Customers1;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.HomePage1;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.Initialization1;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.LoginLogout1;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Projects1;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Tasks1;
import com.sgtesting.actitime.tests.Users;
import com.sgtesting.actitime.tests.Users1;

public class DriverScripts1 {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		
		//Create User Scenario
		oBrowser=Initialization1.launchBrowser();
		Initialization1.navigate(oBrowser);
		LoginLogout1.login(oBrowser);
		HomePage1.minimizeFlyOutWindow(oBrowser);
		Users1.createUser(oBrowser);
		Users1.deleteUser(oBrowser);
		LoginLogout1.logout(oBrowser);
		Initialization1.closeApplication(oBrowser);
		
		//Modify User Scenario
		oBrowser=Initialization1.launchBrowser();
		Initialization1.navigate(oBrowser);
		LoginLogout1.login(oBrowser);
		HomePage1.minimizeFlyOutWindow(oBrowser);
		Users1.createUser(oBrowser);
		Users1.modifyUser(oBrowser);
		Users1.deleteUser(oBrowser);
		LoginLogout1.logout(oBrowser);
		Initialization1.closeApplication(oBrowser);
		
		//Create Customer Scenario
		oBrowser=Initialization1.launchBrowser();
		Initialization1.navigate(oBrowser);
		LoginLogout1.login(oBrowser);
		HomePage1.minimizeFlyOutWindow(oBrowser);
		Customers1.createCustomer(oBrowser);
		Customers1.deleteCustomer(oBrowser);
		LoginLogout1.logout(oBrowser);
		Initialization1.closeApplication(oBrowser);
		
		//Modify Customer Scenario
		oBrowser=Initialization1.launchBrowser();
		
		Initialization1.navigate(oBrowser);
		LoginLogout1.login(oBrowser);
		HomePage1.minimizeFlyOutWindow(oBrowser);
		Customers1.createCustomer(oBrowser);
		Customers1.modifyCustomer(oBrowser);
		Customers1.deleteCustomer(oBrowser);
		LoginLogout1.logout(oBrowser);
		Initialization1.closeApplication(oBrowser);	
		
		//Create Project Scenario
		oBrowser=Initialization1.launchBrowser();
		
		Initialization1.navigate(oBrowser);
		LoginLogout1.login(oBrowser);
		HomePage1.minimizeFlyOutWindow(oBrowser);
		Customers1.createCustomer(oBrowser);
		Projects1.createProject(oBrowser);
		Projects1.deleteProject(oBrowser);
		Customers1.deleteCustomer(oBrowser);
		LoginLogout1.logout(oBrowser);
		Initialization1.closeApplication(oBrowser);	
		
		//Modify Project Scenario
		oBrowser=Initialization1.launchBrowser();
		
		Initialization1.navigate(oBrowser);
		LoginLogout1.login(oBrowser);
		HomePage1.minimizeFlyOutWindow(oBrowser);
		Customers1.createCustomer(oBrowser);
		Projects1.createProject(oBrowser);
		Projects1.modifyProject(oBrowser);
		Projects1.deleteProject(oBrowser);
		Customers1.deleteCustomer(oBrowser);
		LoginLogout1.logout(oBrowser);
		Initialization1.closeApplication(oBrowser);	
		
		//Create Tasks Scenario
		oBrowser=Initialization1.launchBrowser();
		Initialization1.navigate(oBrowser);
		LoginLogout1.login(oBrowser);
		HomePage1.minimizeFlyOutWindow(oBrowser);
		Customers1.createCustomer(oBrowser);
		Projects1.createProject(oBrowser);
		Tasks1.createTasks(oBrowser);
		Tasks1.deleteTasks(oBrowser);
		LoginLogout1.logout(oBrowser);
		Initialization1.closeApplication(oBrowser);


	}

}
