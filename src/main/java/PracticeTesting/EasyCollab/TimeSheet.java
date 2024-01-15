package PracticeTesting.EasyCollab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AbstractComponents.AbstractComponents;

public class TimeSheet extends AbstractComponents{
	WebDriver driver;
	public TimeSheet(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		//this.driver refers to local driver
		PageFactory.initElements(driver, this); //to intialize elements using driver
	}
	
	@FindBy(xpath = "//header/div/ul[1]/li[7]/a")
	WebElement Timesheetmenu;
	
	@FindBy(xpath = "//header/div/ul[1]/li[7]/ul/li/a")
	WebElement Timesheetoption;
	
   @FindBy(id="fromDate")
   WebElement ReportFromDate;
   
   @FindBy(id="toDate")
   WebElement ReportToDate;
   
   @FindBy(xpath="(//a[@class='chosen-single'])[5]")
   WebElement ProjectName;
   
   @FindBy(xpath="(//a[@class='chosen-single'])[1]")
   WebElement SelectProjectName;
   
   @FindBy(xpath="(//a[@class='chosen-single'])[2]")
   WebElement SelectTask;
   
   @FindBy(xpath="(//a[@class='chosen-single'])[3]")
   WebElement WorkType;
   
   @FindBy(id="tshours")
   WebElement Hours;
   
   @FindBy(id="notes")
   WebElement Notes;
   
   @FindBy(xpath="//ul[@class='chosen-results']/li")
   WebElement ProjectOptions;
   
   @FindBy(id="SearchButton")
   WebElement Search;
   
   @FindBy(id="ui-datepicker-div")
	WebElement CreatedToCalendar;
   
   @FindBy(id="ui-datepicker-div")
   WebElement ToDateCalendar;
	
	@FindBy(xpath="//span[@class='ui-datepicker-month']")
	WebElement FromMonthTitle;
	
	@FindBy(xpath="//span[@class='ui-datepicker-year']")
	WebElement FromYearTitle;
	
	@FindBy(xpath="//span[@class='ui-datepicker-month']")
	WebElement ToMonthTitle;
	
	@FindBy(xpath="//span[@class='ui-datepicker-year']")
	WebElement ToYearTitle;
	
	@FindBy(xpath="//td[@data-handler='selectDay']/a[contains(text(),'1')]")
	WebElement fromdate;
	
	@FindBy(xpath="//td[@data-handler='selectDay']/a[contains(text(),'31')]")
	WebElement todate;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/a/span[contains(text(),'Prev')]")
	WebElement Previousbtn;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/a/span[contains(text(),'Next')")
	WebElement Nextbtn;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")
	WebElement Month;
	
	@FindBy(id="to_date")
	WebElement CreatedTodate;
	
	@FindBy(xpath="//tfoot[@id='footRow']")
	WebElement Tablefoot;
	
	@FindBy(xpath="(//button[contains(text(),'ADD')])[1]")
	WebElement AddTimesheet;
	
	@FindBy(xpath="(//button[contains(text(),'ADD')])[2]")
	WebElement AddLeave;
	
	public void TimesheetmenuClick() throws InterruptedException
	{
		Timesheetmenu.click();
		Thread.sleep(1000);
		Timesheetoption.click();
	}
	public void Searchwithdate() throws InterruptedException
	{
		ReportFromDate.click();
		String monthname = FromMonthTitle.getText();
		String yearname = FromYearTitle.getText();
		while(!(monthname.equalsIgnoreCase("January"))&&(yearname.equalsIgnoreCase("2023")))
		{
			Previousbtn.click();
			 monthname = FromMonthTitle.getText();
			 yearname = FromYearTitle.getText();
		}
		fromdate.click();
		
		Thread.sleep(1000);
		
		ReportToDate.click();
		Thread.sleep(1000);
		String tomonthname = ToMonthTitle.getText();
		String toyearname = ToYearTitle.getText();
		while(!(tomonthname.equalsIgnoreCase("January"))&&(toyearname.equalsIgnoreCase("2023")))
		{
			Previousbtn.click();
			tomonthname = ToMonthTitle.getText();
			 toyearname = ToYearTitle.getText();
		}
		todate.click();	
		
		Search.click();
		Thread.sleep(2000);
		//scroll down page using element
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Tablefoot);
		
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	
	public void SearchwithdateProject() throws InterruptedException
	{
		ReportFromDate.click();
		String monthname = FromMonthTitle.getText();
		String yearname = FromYearTitle.getText();
		while(!(monthname.equalsIgnoreCase("January"))&&(yearname.equalsIgnoreCase("2023")))
		{
			Previousbtn.click();
			 monthname = FromMonthTitle.getText();
			 yearname = FromYearTitle.getText();
		}
		fromdate.click();
		
		Thread.sleep(1000);
		
		ReportToDate.click();
		Thread.sleep(1000);
		String tomonthname = ToMonthTitle.getText();
		String toyearname = ToYearTitle.getText();
		while(!(tomonthname.equalsIgnoreCase("January"))&&(toyearname.equalsIgnoreCase("2023")))
		{
			Previousbtn.click();
			tomonthname = ToMonthTitle.getText();
			 toyearname = ToYearTitle.getText();
		}
		todate.click();	
		
		Thread.sleep(1000);
		
		ProjectName.click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='chosen-results']/li"));

		for (WebElement element : elements) {
		    System.out.println("Project text:" + element.getText());
		    if(element.getText().equalsIgnoreCase("721029 - Manual QA"))
		    {
		    	element.click();
		    }
		}
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Tablefoot);
		Thread.sleep(1000);
	}
	
	public void AddDailyProject() throws InterruptedException
	{
		SelectProjectName.click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='chosen-results']/li"));

		for (WebElement element : elements) {
		   // System.out.println("Project text:" + element.getText());
		    if(element.getText().equalsIgnoreCase("721029 - Manual QA"))
		    {
		    	element.click();
		    }
		}
		Thread.sleep(1000);
		
		SelectTask.click();
		List<WebElement> Taskelements = driver.findElements(By.xpath("//ul[@class='chosen-results']/li"));

		for (WebElement element : Taskelements) {
		    //System.out.println("Project text:" + element.getText());
		    if(element.getText().equalsIgnoreCase("Testing"))
		    {
		    	element.click();
		    }
		}
		Thread.sleep(1000);
		
		WorkType.click();
		List<WebElement> WorkTypeelements = driver.findElements(By.xpath("//ul[@class='chosen-results']/li"));

		for (WebElement element : WorkTypeelements) {
		    //System.out.println("Project text:" + element.getText());
		    if(element.getText().equalsIgnoreCase("Free"))
		    {
		    	element.click();
		    }
		}
		Thread.sleep(1000);
		
		Hours.sendKeys("8.5");
		Notes.sendKeys("Testing Easycollab");
		
	}
	
	public void AddDailyProjectwithoutDetails() throws InterruptedException
	{
		AddTimesheet.click();	
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	public void AddLeavewithoutDetails() throws InterruptedException
	{
		AddLeave.click();
		Thread.sleep(1000);
	}
}
