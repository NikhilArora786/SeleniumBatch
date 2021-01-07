package testNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAllAnnotationExecutionSequence {
	
	
	@BeforeClass
	public void launchTheBrowser()
	{
		System.out.println("Launching browser");
	}
	
	@BeforeMethod
	public void loginIntoApplication()
	{
		System.out.println("Login into application");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case1 is executed");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case2 is executed");
	}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		System.out.println("Logout from application");
	}
	
	@AfterClass
	public void  closeTheBrowser()
	{
		System.out.println("Closing browser");
	}

}
