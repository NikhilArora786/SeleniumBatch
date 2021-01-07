package testNgDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementationClass implements ITestListener

/*
 * ITestListener
 * ITestResult
 * onTestFailure method
 */
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus())
		{
			TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
			File srcFile=ts.getScreenshotAs(OutputType.FILE);
			File destFile=new File("C:\\Users\\NIKHIL ARORA\\Desktop\\Screenshot\\"+result.getName()+".png");
			try
			{
				FileUtils.copyFile(srcFile, destFile);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
