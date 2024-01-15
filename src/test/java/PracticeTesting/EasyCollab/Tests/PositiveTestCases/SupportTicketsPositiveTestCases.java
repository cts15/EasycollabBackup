package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PracticeTesting.EasyCollab.Supporttickets;
import Resource.Base;

public class SupportTicketsPositiveTestCases extends Base {
	
public Supporttickets Supporttickets;
	
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
		
	//create object for page object & send driver as argument as it will give life to driver object
		    LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
		    Supporttickets=new Supporttickets(driver);
		    Supporttickets.SupportmenuClick();
	}

	@Test
	public void GetAllStatuslist() throws IOException, InterruptedException 
	{
		Supporttickets.AllStatusDropdown();
		Supporttickets.OpenStatusDropdown();
		Supporttickets.SolvedStatusDropdown();
		Supporttickets.SelectFromDate();
		Supporttickets.SelectToDate();
		Supporttickets.CancelGenerateTicketData("Change in project");
	}
	
	
	
	/*
	 * @Test public void GetCreatedDateTo() throws IOException, InterruptedException
	 * { Supporttickets.SelectToDate(); Supporttickets.Search(); }
	 * 
	 * @Test public void SearchwithDateAll() throws IOException,
	 * InterruptedException { Supporttickets.SelectDatewithAllStatus();
	 * Supporttickets.Search(); }
	 * 
	 * @Test public void SearchwithDateSolved() throws IOException,
	 * InterruptedException { Supporttickets.SelectDatewithSolvedStatus();
	 * Supporttickets.Search(); }
	 * 
	 * @Test public void SearchwithDateOpen() throws IOException,
	 * InterruptedException { Supporttickets.SelectDatewithOpenStatus();
	 * Supporttickets.Search(); }
	 * 
	 * @Test public void GetGenerateTicket() throws IOException,
	 * InterruptedException { Supporttickets.GenerateTicketClick(); }
	 * 
	 * @Test public void GetGenerateTicketdata() throws IOException,
	 * InterruptedException {
	 * Supporttickets.CancelGenerateTicketData("Change in project"); }
	 */
	
}
