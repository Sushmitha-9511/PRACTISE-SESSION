package Base_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sushmitha\\Downloads\\chromedriver.exe");
		//log.info("Openning Chrome");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement element=driver.findElement(By.className("gLFyf gsfi"));
		element.sendKeys("Sushmitha");
		element.sendKeys(Keys.chord(Keys.CONTROL + "a"));
		element.sendKeys(Keys.chord(Keys.CONTROL+"x"));
	}

}
