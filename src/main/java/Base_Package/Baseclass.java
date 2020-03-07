package Base_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public Baseclass()
	{
		prop = new Properties();
		FileInputStream io;
		try {
			io = new FileInputStream("C:\\Users\\Sushmitha\\eclipse-workspace\\POMPractise2\\src\\main\\java\\config_package\\config.properties");
			prop.load(io);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	public static void initialization()
	{
		
		String Url= prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sushmitha\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
