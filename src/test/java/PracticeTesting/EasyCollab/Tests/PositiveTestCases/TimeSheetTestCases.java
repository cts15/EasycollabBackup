package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.Supporttickets;
import PracticeTesting.EasyCollab.TimeSheet;
import Resource.Base;

public class TimeSheetTestCases extends Base {
	
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
	public void GetAllTests() throws IOException, InterruptedException 
	{
		TimeSheetsMenu.Searchwithdate();
		TimeSheetsMenu.SearchwithdateProject();
		TimeSheetsMenu.AddDailyProject();
	}
	
}
