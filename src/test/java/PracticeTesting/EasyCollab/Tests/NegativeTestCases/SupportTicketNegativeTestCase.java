package PracticeTesting.EasyCollab.Tests.NegativeTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.Supporttickets;
import Resource.Base;

public class SupportTicketNegativeTestCase extends Base {
	
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
	public void GetGenerateTicketdata() throws IOException, InterruptedException 
	{
		Supporttickets.SaveGenerateTicketData(" ");
		Thread.sleep(2000);
	}

}
