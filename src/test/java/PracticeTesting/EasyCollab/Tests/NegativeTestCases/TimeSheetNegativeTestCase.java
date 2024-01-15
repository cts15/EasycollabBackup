package PracticeTesting.EasyCollab.Tests.NegativeTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.TimeSheet;
import Resource.Base;

public class TimeSheetNegativeTestCase extends Base {
	
	public TimeSheet TimeSheetsMenu;
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
		TimeSheetsMenu=new TimeSheet(driver);
		TimeSheetsMenu.TimesheetmenuClick();
	}

	@Test
	public void ValiatingforEmptyFields() throws IOException, InterruptedException 
	{
		TimeSheetsMenu.AddDailyProjectwithoutDetails();
		TimeSheetsMenu.AddLeavewithoutDetails();
	}		
}
