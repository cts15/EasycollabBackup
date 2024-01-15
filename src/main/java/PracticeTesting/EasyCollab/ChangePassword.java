package PracticeTesting.EasyCollab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class ChangePassword extends AbstractComponents {
	
	WebDriver driver;
	
	public ChangePassword(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		//this.driver refers to local driver
		PageFactory.initElements(driver, this); //to intialize elements using driver
	}
	
	@FindBy(xpath = "//header/div[1]/ul[2]/li/a[@class='dropdown-toggle']")
	WebElement profilemenudropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Change Password')]")
	WebElement changepassword;
	
	@FindBy(name = "data[User][old_password]")
	WebElement oldPassword;
	
	@FindBy(name = "data[User][password]")
	WebElement newPassword;
	
	@FindBy(name = "data[User][confirm_password]")
	WebElement confirmPassword;
	
	@FindBy(id = "btn_save")
	WebElement Submit;
	
	public void changepasswordmenu() throws InterruptedException
	{
		profilemenudropdown.click();
		changepassword.click();
	}

	public void submitclick() throws InterruptedException
	{
		Submit.click();
	}
	public void oldpasswordtext(String oldpasswordtext) throws InterruptedException
	{
		oldPassword.sendKeys(oldpasswordtext);
	}
	public void newpasswordtext(String newpasswordtext) throws InterruptedException
	{
		newPassword.sendKeys(newpasswordtext);
	}
	public void confirmpasswordtext(String confirmpasswordtext) throws InterruptedException
	{
		confirmPassword.sendKeys(confirmpasswordtext);
	}
}
