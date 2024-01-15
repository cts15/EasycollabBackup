package PracticeTesting.EasyCollab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class ProjectModule extends AbstractComponents {
	WebDriver driver;

	public ProjectModule(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//header/div/ul[1]/li[3]/a[contains(text(),'Project')]")
	WebElement ProjectMenu;
	
	@FindBy(linkText = "Projects")
	WebElement Projects;
	
	@FindBy(xpath="//div[@id='tsDiv-7930']/i")
	WebElement ProjectDetails;
	
	@FindBy(xpath="//div[@id='trackerDetails_7930']")
	WebElement TrackerStatus;
	
	public void ProjectClick() throws InterruptedException
	{
		ProjectMenu.click();
		Thread.sleep(1000);
		Projects.click();
	}
	
	public void ProjectDetailsViewClick() throws InterruptedException
	{
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ProjectDetails).perform();
	}
	
	public void TrackerStatusViewClick() throws InterruptedException
	{
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(TrackerStatus).perform();
	}

}
