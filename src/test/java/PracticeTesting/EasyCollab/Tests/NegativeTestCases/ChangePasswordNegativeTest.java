package PracticeTesting.EasyCollab.Tests.NegativeTestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.ChangePassword;

import Resource.Base;

public class ChangePasswordNegativeTest extends Base {
	
	public ChangePassword ChangePassword;
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
		LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
		    ChangePassword=new ChangePassword(driver);
		    ChangePassword.changepasswordmenu();
	}
	@Test
	public void EmptyChangePasswordValidation() throws IOException, InterruptedException 
	{
		ChangePassword.submitclick();
	}
	
	@Test
	public void IncorrectOldPasswordValidation() throws IOException, InterruptedException 
	{
		ChangePassword.oldpasswordtext("chitr");
		ChangePassword.newpasswordtext("Chitr@sri154");
		ChangePassword.confirmpasswordtext("Chitr@sri154");
	}
	
	@Test
	public void MismatchedPasswordValidation() throws IOException, InterruptedException 
	{
		ChangePassword.oldpasswordtext("chitr@154Sri");
		ChangePassword.newpasswordtext("Chitr@sri154");
		ChangePassword.confirmpasswordtext("Chitr@sri");
	}
	@Test
	public void WeakPasswordValidation() throws IOException, InterruptedException 
	{
		ChangePassword.oldpasswordtext("chitr@154Sri");
		ChangePassword.newpasswordtext("123456");
	}
	@Test
	public void EmptyNewPasswordValidation() throws IOException, InterruptedException 
	{
		ChangePassword.oldpasswordtext("chitr@154Sri");
		ChangePassword.newpasswordtext("Chitr@sri154");
		ChangePassword.confirmpasswordtext(" ");
	}


}
