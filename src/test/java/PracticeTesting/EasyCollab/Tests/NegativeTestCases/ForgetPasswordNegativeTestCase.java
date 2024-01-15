package PracticeTesting.EasyCollab.Tests.NegativeTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.ForgetPassword;
import Resource.Base;

public class ForgetPasswordNegativeTestCase extends Base {
	
public ForgetPassword ForgetPasswordNegativeTest;
	
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		
		ForgetPasswordNegativeTest=new ForgetPassword(driver);
		//ForgetPasswordNegativeTest.ForgetPaswordClick();
	}
	
	@Test
	public void InvalidEmailAddressValidation() throws IOException, InterruptedException 
	{
		ForgetPasswordNegativeTest.GetEmailaddress("cos@narola");
		ForgetPasswordNegativeTest.GetEmailaddresstext("cos");
		ForgetPasswordNegativeTest.GetEmailaddresstext("cos@narola.email");
		ForgetPasswordNegativeTest.SecurityquestionClick("What is your Mother name ?","abcdef");
		ForgetPasswordNegativeTest.SecurityquestionClick("What is your first school name ?","123456");
	}
	
	/*
	 * @Test public void EmailAddressformatValidation() throws IOException,
	 * InterruptedException {
	 * 
	 * }
	 * 
	 * @Test public void InvalidSecurityQuestionValidation() throws IOException,
	 * InterruptedException {
	 * ForgetPasswordNegativeTest.GetEmailaddress("cos@narola.email");
	 * ForgetPasswordNegativeTest.SecurityquestionClick( 
	 * "cos@narola.email","What is your Mother name ?","abcdef"); }
	 * 
	 * @Test public void InvalidSecurityAnswerValidation() throws IOException,
	 * InterruptedException {
	 * ForgetPasswordNegativeTest.GetEmailaddress("cos@narola.email");
	 * ForgetPasswordNegativeTest.SecurityquestionClick(
	 * "cos@narola.email","What is your first school name ?","123456"); }
	 */

}
