package SeleniumScripts;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {

	public static ExtentReports extent;
	
	public static void main(String[] args) 
	{
      
	    extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("AutomationTestReport.html");
		extent.attachReporter(spark);
		
		ExtentTest tc1 = extent.createTest("TC001-Verify Login");
		tc1.pass("Launch Application URL");
		tc1.pass("Enter UserName");
		tc1.pass("Enter Password");
		tc1.pass("Click on Login");
		tc1.pass("Login Success");
		
		ExtentTest tc2 = extent.createTest("TC001-Verify HomePage");
		tc2.pass("Navigate to HomePage");
		tc2.pass("Check all controls are enable");
		tc2.pass("Verify Data");
	
		
		ExtentTest tc3 = extent.createTest("TC001-Create Order");
		tc3.pass("Navigate to Order Page");
		tc3.pass("Click on Create Order");
		tc3.pass("Entr Manditory Data");
		tc3.pass("Click on Save");
		tc3.fail("Login Success");
		
		
		extent.flush();
		
		
	}

}
