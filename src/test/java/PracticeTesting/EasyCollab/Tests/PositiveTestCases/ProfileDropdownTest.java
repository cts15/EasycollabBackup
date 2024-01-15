package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.ProfileDropdown;
import Resource.Base;

public class ProfileDropdownTest extends Base
{
	public ProfileDropdown ProfileDropdown;
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
		    ProfileDropdown=new ProfileDropdown(driver);		    
	}
	
	@Test  
	public void ProfileClickValidation() throws IOException, InterruptedException
	{
		ProfileDropdown.profilemenu();
		ProfileDropdown.logoutmenu();
		ProfileDropdown.myprofilemenu();
		ProfileDropdown.changepasswordmenu();
	}
	
	
	
}
