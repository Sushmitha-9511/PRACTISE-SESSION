package test_package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Package.Baseclass;
import Page_Package.Grocery;
import Page_Package.Home;
import Page_Package.Login;

public class test_class_Home extends Baseclass{
	public Login login;
	public Home home;
	public Grocery grocery;
	public test_class_Home() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login= new Login();
		login.login(prop.getProperty("username"),prop.getProperty("password"));
		home = new Home();
		
	}
	
	@Test
	public void clickTest() {
		
		grocery=home.clickOnGrocery();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
