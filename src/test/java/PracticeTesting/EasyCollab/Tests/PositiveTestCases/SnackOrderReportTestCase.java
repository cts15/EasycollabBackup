package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.SnackOrderReport;
import Resource.Base;

public class SnackOrderReportTestCase extends Base {
	
	public SnackOrderReport SnackOrder;
	
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
		SnackOrder=new SnackOrderReport(driver);
		SnackOrder.SnackMenu();
	}
	
	@Test
	public void GetAllwithDate() throws IOException, InterruptedException 
	{
	
		SnackOrder.Snackreport();
	}
}
