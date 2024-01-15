package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.ChangePassword;
import Resource.Base;

public class ChangePasswordPositiveTest extends Base {
	public ChangePassword ChangePassword;
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
		    ChangePassword=new ChangePassword(driver);
		    ChangePassword.changepasswordmenu();
	}

	@Test
	public void ValidChangePasswordValidation() throws IOException, InterruptedException 
	{
		ChangePassword.oldpasswordtext("chitr@154Sri");
		ChangePassword.newpasswordtext("Chitr@sri154");
		ChangePassword.confirmpasswordtext("Chitr@sri154");
	}
	
	

}
