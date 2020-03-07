package Analyzer_package;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer {
int count=0;
int retry_limit=3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<retry_limit)
		{
			count++;
			return true;
		}
		return false;
	}

}
