package PracticeTesting.EasyCollab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class Login extends AbstractComponents {
	
	WebDriver driver;
	//constructor
	public Login(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		//this.driver refers to local driver
		PageFactory.initElements(driver, this); //to intialize elements using driver
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="inputPassword")
	WebElement passwordinput;
	
	@FindBy(className="btn-info")
	WebElement submit;
	
	public void goTo()
	{
		driver.get("https://eros.narola.online:444/EasyCollab/");
	}
	
	public void loginapplication(String email,String password)
	{
		username.sendKeys(email);
		passwordinput.sendKeys(password);
		submit.click();
	}
}
