package PracticeTesting.EasyCollab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class ProfileDropdown extends AbstractComponents {
	WebDriver driver;
	//constructor
	public ProfileDropdown(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		//this.driver refers to local driver
		PageFactory.initElements(driver, this); //to intialize elements using driver
	}
	
	@FindBy(xpath = "//header/div[1]/ul[2]/li/a[@class='dropdown-toggle']")
	WebElement profilemenudropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logout;
	
	@FindBy(xpath = "//a[contains(text(),'My Profile')]")
	WebElement myprofile;
	
	@FindBy(xpath = "//a[contains(text(),'Change Password')]")
	WebElement changepassword;
	
	public void profilemenu() throws InterruptedException
	{
		profilemenudropdown.click();	
	}
	
	public void logoutmenu() throws InterruptedException
	{
		//profilemenudropdown.click();
		Thread.sleep(1000);
		logout.click();	
	}
	public void myprofilemenu() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		profilemenudropdown.click();
		myprofile.click();	
		Thread.sleep(1000);
	}
	
	public void changepasswordmenu() throws InterruptedException
	{
		profilemenudropdown.click();
		changepassword.click();
	}
	
}
