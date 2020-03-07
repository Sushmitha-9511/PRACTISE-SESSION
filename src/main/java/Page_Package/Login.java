package Page_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Baseclass;

public class Login extends Baseclass {

	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement Password;
	@FindBy(xpath="//button[@class=\"login-login-button\"]")
	WebElement loginButton;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	public Home login(String uid,String pass) {
		//Username.clear();
		email.sendKeys(uid);
		//Password.clear();
		Password.sendKeys(pass);
		loginButton.click();
		return new Home();
	}
	
}
