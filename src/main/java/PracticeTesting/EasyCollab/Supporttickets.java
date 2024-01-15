package PracticeTesting.EasyCollab;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponents;

public class Supporttickets extends AbstractComponents {
	WebDriver driver;
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	public Supporttickets(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		//this.driver refers to local driver
		PageFactory.initElements(driver, this); //to initialize elements using driver
	}
	
	@FindBy(xpath = "//header/div/ul[1]/li[6]/a[contains(text(),'Support')]")
	WebElement Supportmenu;
	
	@FindBy(linkText = "Support Tickets")
	WebElement SupportTickets;
	
	@FindBy(id= "from_date")
	WebElement CreatedFromdate;
	
	@FindBy(id="status_id")
	WebElement Status;
	
	@FindBy(id="to_date")
	WebElement CreatedTodate;
	
	@FindBy(id="ui-datepicker-div")
	WebElement CreatedToCalendar;
	
	@FindBy(xpath="//span[@class='ui-datepicker-month']")
	WebElement MonthTitle;
	
	@FindBy(xpath="//span[@class='ui-datepicker-year']")
	WebElement YearTitle;
	
	@FindBy(xpath="//td[@data-handler='selectDay']/a[contains(text(),'10')]")
	WebElement fromdate;
	
	@FindBy(xpath="//td[@data-handler='selectDay']/a[contains(text(),'31')]")
	WebElement todate;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/a/span[contains(text(),'Prev')]")
	WebElement Previousbtn;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/a/span[contains(text(),'Next')")
	WebElement Nextbtn;
	
	@FindBy(xpath="//button[contains(text(),'Search')]")
	WebElement Submit;
	
	@FindBy(xpath="//div[@id='ui-datepicker-div']/div/div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")
	WebElement Month;
	
	@FindBy(xpath="//div[@class='col-lg-2']/div/a[contains(text(),'Generate New Support Ticket')]")
	WebElement GenerateTicket;
	
	@FindBy(id="SupportSupportTypeId")
	WebElement SupportType;
	
	@FindBy(xpath="//div/select[@id='SupportSupportTypeId']")
	WebElement SupportImmediate;
	
	@FindBy(xpath="//div/textarea[@id='SupportNote']")
	WebElement Notes;
	
	@FindBy(id="support-button")
	WebElement Save;
	
	@FindBy(xpath="//a[contains(text(),'Cancel')]")
	WebElement Cancel;
	
	
	public void SupportmenuClick() throws InterruptedException
	{
		Supportmenu.click();
		SupportTickets.click();
	}
	
	public void Fromdate() throws InterruptedException
	{
		CreatedFromdate.click();
	}
	public void Search() throws InterruptedException
	{
		Submit.click();
	}
	public void AllStatusDropdown() throws InterruptedException
	{
		Select statusdropdownmenu = new Select(Status);
        // Select an option by visible text
		statusdropdownmenu.selectByVisibleText("All");
		Search();
		Thread.sleep(1000);
		driver.navigate().refresh();       
	}
	public void OpenStatusDropdown() throws InterruptedException
	{
		Select statusdropdownmenu = new Select(Status);
        // Select an option by visible text
		statusdropdownmenu.selectByVisibleText("Open");
		Search();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	public void SolvedStatusDropdown() throws InterruptedException
	{
		Select statusdropdownmenu = new Select(Status);
        // Select an option by visible text
		statusdropdownmenu.selectByVisibleText("Solved");
		Search();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	public void SelectFromDate() throws InterruptedException
	{
		//SupportmenuClick();
		CreatedFromdate.click();
		//wait.until(ExpectedConditions.visibilityOf(CreatedToCalendar));
		String monthname = MonthTitle.getText();
		String yearname = YearTitle.getText();
		while(!(monthname.equalsIgnoreCase("January"))&&(yearname.equalsIgnoreCase("2023")))
		{
			Previousbtn.click();
			 monthname = MonthTitle.getText();
			 yearname = YearTitle.getText();
		}
		fromdate.click();	
		Search();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	public void SelectToDate() throws InterruptedException
	{
		//SupportmenuClick();
		CreatedTodate.click();
		//wait.until(ExpectedConditions.visibilityOf(CreatedToCalendar));
		String monthname = MonthTitle.getText();
		String yearname = YearTitle.getText();
		while(!(monthname.equalsIgnoreCase("December"))&&(yearname.equalsIgnoreCase("2023")))
		{
			//Previousbtn.click();
			 monthname = MonthTitle.getText();
			 yearname = YearTitle.getText();
		}
		todate.click();	
		Search();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	/*
	 * public void SelectDatewithAllStatus() throws InterruptedException {
	 * AllStatusDropdown(); SelectFromDate(); SelectToDate(); } public void
	 * SelectDatewithOpenStatus() throws InterruptedException {
	 * OpenStatusDropdown(); SelectFromDate(); SelectToDate(); } public void
	 * SelectDatewithSolvedStatus() throws InterruptedException {
	 * SolvedStatusDropdown(); SelectFromDate(); SelectToDate(); }
	 */
	
	public void GenerateTicketClick() throws InterruptedException
	{
		GenerateTicket.click();
	}
	
	public void CancelGenerateTicketData(String notes) throws InterruptedException
	{
		GenerateTicket.click();
		Select supportdropdownmenu = new Select(SupportType);
        // Select an option by visible text
		supportdropdownmenu.selectByVisibleText("HR");   
		SupportImmediate.click();
		Notes.sendKeys(notes);
		Thread.sleep(1000);
		Cancel.click();	
	}
	public void SaveGenerateTicketData(String notes) throws InterruptedException
	{
		GenerateTicket.click();
		Select supportdropdownmenu = new Select(SupportType);
        // Select an option by visible text
		supportdropdownmenu.selectByVisibleText("HR");   
		SupportImmediate.click();
		Notes.sendKeys(notes);
		//Save.click();
	}
}
