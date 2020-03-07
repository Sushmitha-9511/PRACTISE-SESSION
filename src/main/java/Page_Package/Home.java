package Page_Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.Baseclass;

public class Home extends Baseclass {
	
	@FindBy(xpath="//span[text()=\"Grocery\"]")
	WebElement Grocery;
	
	public Home() {
		PageFactory.initElements(driver,this);
	}
	
	public Grocery clickOnGrocery() {
		Grocery.click();
		return new Grocery();
	}

}
