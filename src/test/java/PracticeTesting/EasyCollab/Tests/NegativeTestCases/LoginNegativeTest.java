package PracticeTesting.EasyCollab.Tests.NegativeTestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resource.Base;

public class LoginNegativeTest extends Base {
	
	@Test
	public void PasswordValidation() throws IOException, InterruptedException 
	{
		LoginPage.loginapplication("cos.narola@email", "testing");	
	}
	@Test
	public void UsernameValidation() throws IOException, InterruptedException 
	{
		LoginPage.loginapplication("cos.narola", "chitr@154Sri");
	}
	@Test
	public void UsernamePasswordBlankValidation() throws IOException, InterruptedException 
	{
		LoginPage.loginapplication("", "");
	
	}
}
