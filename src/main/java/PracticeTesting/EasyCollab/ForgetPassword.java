package PracticeTesting.EasyCollab;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AbstractComponents.AbstractComponents;

public class ForgetPassword extends AbstractComponents {

	WebDriver driver;
	public ForgetPassword(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(linkText="Forgot your password?")
	WebElement ForgetLink;
	
	@FindBy(id="username")
	WebElement Email;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Submit;
	
	@FindBy(xpath="//div[@class='form-group'][1]/select")
	WebElement Securityquestion;
	
	@FindBy(id="UserSecurityQuestionAnswer")
	WebElement Securityanswer;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div")
	WebElement divsection;
	
	public void ForgetPaswordClick() throws InterruptedException
	{
		ForgetLink.click();
		Thread.sleep(1000);
	}
	
	public void GetEmailaddress(String email) throws InterruptedException
	{
		ForgetLink.click();
		Email.sendKeys(email);
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(1000);
		driver.get(driver.getCurrentUrl());
		/*To clear textfield*/
		//Email.sendKeys(Keys.LEFT_CONTROL+"a"+Keys.BACK_SPACE);
	}
	
	public void GetEmailaddresstext(String email) throws InterruptedException
	{
		//ForgetLink.click();
		Email.sendKeys(email);
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(1000);
		driver.get(driver.getCurrentUrl());
		/*To clear textfield*/
		//Email.sendKeys(Keys.LEFT_CONTROL+"a"+Keys.BACK_SPACE);
	}
	
	public void SecurityquestionClick(String question, String answer) throws InterruptedException
	{
	
		Select securitydropdown = new Select(Securityquestion);
		securitydropdown.selectByVisibleText(question);
		Thread.sleep(1000);
		Securityanswer.sendKeys(answer);
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(1000);
		Securityanswer.sendKeys(Keys.LEFT_CONTROL+"a"+Keys.BACK_SPACE);
	}

}
