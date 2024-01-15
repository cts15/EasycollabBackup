package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.Badge;
import Resource.Base;

public class BadgePositiveTest extends Base {
	public Badge Badge;
	
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
		    Badge=new Badge(driver);
		    //Badge.badgedropdownmenu();
	}

	@Test
	public void ContributionValidation() throws IOException, InterruptedException 
	{
		
		//Badge.Contributionbadge();
		//Badge.Badgesmenu();
		Badge.Endrosemenu();
		Badge.EmployeeNamedropdown();  
		Badge.ContributionSelf(); 
	    Badge.Categorydropdown(); 
	    Badge.EmployeewithCategory();
		Badge.SelectFromDate(); 
		Badge.SelectToDate(); 
		Badge.SearchToFromDate();
		Badge.Searchwithall();
		 
	}
	
	

}
