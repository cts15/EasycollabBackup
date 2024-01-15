package PracticeTesting.EasyCollab.Tests.PositiveTestCases;


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.ForgetPassword;
import Resource.Base;

public class ForgetPasswordTestCases extends Base {
	
	public ForgetPassword ForgetPasswordTest;
	
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		
		ForgetPasswordTest=new ForgetPassword(driver);
		//ForgetPasswordTest.ForgetPaswordClick();
	}
	
	@Test
	public void EmailAddressValidation() throws IOException, InterruptedException 
	{
		ForgetPasswordTest.GetEmailaddress("cos@narola.email");
		ForgetPasswordTest.SecurityquestionClick("What is your first school name ?","abcdef");
	}
	
	/*
	 * @Test public void SecurityQuestionValidation() throws IOException,
	 * InterruptedException {
	 * ForgetPasswordTest.GetEmailaddress("cos@narola.email");
	 * 
	 * }
	 */
}
