package AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents 
{
	WebDriver driver;
	public AbstractComponents(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElementToAppear(By findBy) 
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	public void waitForWebElementToAppear(WebElement findBy) 
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfAllElements(findBy));
	}
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException 
	{
		Thread.sleep(1000);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="inputPassword")
	WebElement passwordinput;
	
	@FindBy(className="btn-info")
	WebElement submit;
	
	@FindBy(xpath = "//header/div[1]/ul[2]/li/a[@class='dropdown-toggle']")
	WebElement profilemenudropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logout;
	
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
	
	public void logoutmenu() throws InterruptedException
	{
		profilemenudropdown.click();
		logout.click();	
	}
}
