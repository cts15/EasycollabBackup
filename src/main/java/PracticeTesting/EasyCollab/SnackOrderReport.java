package PracticeTesting.EasyCollab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class SnackOrderReport extends AbstractComponents {
	
	WebDriver driver;

	public SnackOrderReport(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//header/div/ul[1]/li[8]/a")
	WebElement LibrarySnackmenu;
	
	@FindBy(xpath = "//header/div/ul[1]/li[8]/ul/li[4]/a")
	WebElement Myorderoption;
	
	@FindBy(id="from_date")
	WebElement Fromdate;
	
	@FindBy(id="to_date")
	WebElement Todate;
	
	@FindBy(id="project-button")
	WebElement Submit;
	
	@FindBy(xpath="//span[@class='ui-datepicker-month']")
	WebElement MonthTitle;
	
	@FindBy(xpath="//span[@class='ui-datepicker-year']")
	WebElement YearTitle;
	
	@FindBy(xpath="//td[@data-handler='selectDay']/a[contains(text(),'10')]")
	WebElement fromdate;
	
	@FindBy(xpath="//td[@data-handler='selectDay']/a[contains(text(),'12')]")
	WebElement todate;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/a/span[contains(text(),'Prev')]")
	WebElement Previousbtn;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/a/span[contains(text(),'Next')")
	WebElement Nextbtn;
	
	
	public void SnackMenu() throws InterruptedException
	{
		LibrarySnackmenu.click();
		Myorderoption.click();
	}
	public void Snackreport() throws InterruptedException
	{
		Fromdate.click();
		String monthname = MonthTitle.getText();
		String yearname = YearTitle.getText();
		while(!(monthname.equalsIgnoreCase("January"))&&(yearname.equalsIgnoreCase("2023")))
		{
			Previousbtn.click();
			 monthname = MonthTitle.getText();
			 yearname = YearTitle.getText();
		}
		fromdate.click();
		
		Thread.sleep(1000);
		
		Todate.click();
		Thread.sleep(1000);
		String tomonthname = MonthTitle.getText();
		String toyearname = YearTitle.getText();
		while(!(tomonthname.equalsIgnoreCase("December"))&&(toyearname.equalsIgnoreCase("2023")))
		{
			Previousbtn.click();
			tomonthname =MonthTitle.getText();
			 toyearname = YearTitle.getText();
		}
		todate.click();	
		
		Thread.sleep(1000);
		
		Submit.click();
		Thread.sleep(1000);
	}
}
