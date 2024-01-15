package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PracticeTesting.EasyCollab.Login;
import Resource.Base;

public class LoginPositiveTest extends Base {
	
	/*
	 * @Test(dataProvider="getData") public void
	 * UserPasswordValidation(HashMap<String, String> input) throws IOException,
	 * InterruptedException { LoginPage.loginapplication(input.get("email"),
	 * input.get("password"));
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData() throws IOException {
	 * List<HashMap<String,String>> data=
	 * getJsonDataToMap(System.getProperty("user.dir")+
	 * "//src//test//java//PracticeTesting//EasyCollab//data//LoginCredential.json")
	 * ; return new Object[][] { { data.get(0) } }; }
	 */
	
	@Test
	public void validLogin()
	{
		LoginPage.loginapplication("cos@narola.email","chitr@154Sri");
	}
}
