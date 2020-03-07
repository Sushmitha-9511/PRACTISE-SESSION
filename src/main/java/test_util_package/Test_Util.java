package test_util_package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base_Package.Baseclass;

public class Test_Util extends Baseclass {
	
	public static void Screenshot(WebDriver driver,String testmethodname) throws IOException
	{
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\Sushmitha\\eclipse-workspace\\POMPractise2\\Screenshot"+testmethodname+".jpg"));
	
	}


}
