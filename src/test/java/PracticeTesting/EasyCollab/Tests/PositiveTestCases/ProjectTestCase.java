package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.ProjectModule;
import Resource.Base;

public class ProjectTestCase extends Base {
	
public ProjectModule ProjectModule;
	
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
		ProjectModule = new ProjectModule(driver);
		ProjectModule.ProjectClick();
	}

	 @Test public void GetProjectDetails() throws IOException, InterruptedException
	  { 
		 ProjectModule.ProjectDetailsViewClick();
		 Thread.sleep(2000);
		 ProjectModule.TrackerStatusViewClick();
	  }
	 
	 
}
