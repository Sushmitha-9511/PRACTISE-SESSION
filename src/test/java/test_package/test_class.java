package test_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Package.Baseclass;
import Page_Package.Home;
import Page_Package.Login;

public class test_class extends Baseclass {
	
	public Baseclass base;
	public Login login1;
	public Home home;
	
	public test_class()
	{
		super();
	}
	@BeforeMethod
	public void setup() {
	initialization();
		login1 = new Login();
	}
	
	@Test
	public void loginTest() {
		home=login1.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
