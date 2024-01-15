package PracticeTesting.EasyCollab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponents;

public class Badge extends AbstractComponents {
WebDriver driver;

	public Badge(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		//this.driver refers to local driver
		PageFactory.initElements(driver, this); //to intialize elements using driver
	}
	
	String Toeday="2";
	@FindBy(xpath = "//header/div/ul[1]/li[5]/a[contains(text(),'Badges')]")
	WebElement Badgesmenu;
	
	@FindBy(linkText = "Contribution")
	WebElement Contribution;
	
	@FindBy(linkText = "Badges")
	WebElement Badgesoption;
	
	@FindBy(linkText = "Endorse")
	WebElement Endorse;
	
	@FindBy(id="badgesEmployeeId")
	WebElement Employee;
	
	 @FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement Submit;
	 
	 @FindBy(xpath="//a[@class='btn btn-white']")
	 WebElement Cancelbtn;
	 
	 @FindBy(id="contri_of")
	WebElement ContributionselfCheckbox;
	 
	 @FindBy(id="badgesCategory")
	WebElement Category;
	 
	 @FindBy(id="from_assign_date")
	 WebElement FromAssigndate;
	 
	 @FindBy(id="to_assign_date")
	 WebElement ToAssigndate;
	 
	 @FindBy(xpath="//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/div/select[@class='ui-datepicker-month']")
	 WebElement frommonth;
	 
	 @FindBy(xpath="//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/div/select[@class='ui-datepicker-year']")
	 WebElement fromyear;
	 
	 @FindBy(xpath="//div[@id='ui-datepicker-div']/table/tbody/tr[1]/td[@data-handler='selectDay']/a[contains(text(), '2')]")
	 WebElement fromdate;
	 
	 @FindBy(xpath="//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/div/select[@class='ui-datepicker-month']")
	 WebElement tomonth;
	 
	 @FindBy(xpath="//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/div/select[@class='ui-datepicker-year']")
	 WebElement toyear;
	 
	 @FindBy(xpath="//div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[@data-handler='selectDay']/a[contains(text(), '30')]")
	 WebElement todate;
	
	public void badgedropdownmenu() throws InterruptedException
	{
		Badgesmenu.click();
	}
	
	public void Contributionbadge() throws InterruptedException
	{
		Contribution.click();
	}
	
	public void Badgesmenu() throws InterruptedException
	{
		Badgesoption.click();
	}
	public void Endrosemenu() throws InterruptedException
	{
		Badgesmenu.click();
		Endorse.click();
	}
	public void Submitbutton() throws InterruptedException
	{
		Submit.click();
	}
	public void Cancelbutton() throws InterruptedException
	{
		Cancelbtn.click();
	}
	public void EmployeeNamedropdown() throws InterruptedException
	{
		badgedropdownmenu();
		Contributionbadge();
        Select empdropdown = new Select(Employee);
        // Select an option by visible text
        empdropdown.selectByVisibleText("Chitra Omprakash Srivastava");
        Submitbutton();
        Thread.sleep(1000);
        driver.navigate().refresh();
	}
	
	public void ContributionSelf() throws InterruptedException
	{
		ContributionselfCheckbox.click();
		Submitbutton();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}
	public void Categorydropdown() throws InterruptedException
	{
        Select catedropdown = new Select(Category);
        // Select an option by visible text
        catedropdown.selectByVisibleText("Employee of the month");
        Submitbutton();
        Thread.sleep(1000);
        driver.navigate().refresh();
	}
	public void EmployeewithCategory() throws InterruptedException
	{
        Select empdropdown = new Select(Employee);
        // Select an option by visible text
        empdropdown.selectByVisibleText("Chitra Omprakash Srivastava");
        Select catedropdown = new Select(Category);
        // Select an option by visible text
        catedropdown.selectByVisibleText("Employee of the month");
        Submitbutton();
        Thread.sleep(1000);
        driver.navigate().refresh();
	}
	public void SelectFromDate() throws InterruptedException
	{
		FromAssigndate.click();
        Select monthdropdown = new Select(frommonth);
        // Select an option by visible text
        monthdropdown.selectByVisibleText("Jun");
        Select yeardropdown = new Select(fromyear);
        // Select an option by visible text
        yeardropdown.selectByVisibleText("2022");
        fromdate.click();
        Submitbutton();
        Thread.sleep(1000);
        driver.navigate().refresh();
       
	}
	public void SelectToDate() throws InterruptedException
	{
		Select empdropdown = new Select(Employee);
        // Select an option by visible text
        empdropdown.selectByVisibleText("Chitra Omprakash Srivastava");
        Select catedropdown = new Select(Category);
        // Select an option by visible text
        catedropdown.selectByVisibleText("Employee of the month");

		ToAssigndate.click();
        Select tomonthdropdown = new Select(tomonth);
        // Select an option by visible text
        tomonthdropdown.selectByVisibleText("Jun");
        Select toyeardropdown = new Select(toyear);
        // Select an option by visible text
        toyeardropdown.selectByVisibleText("2022");
        todate.click();
        Submitbutton();
        Thread.sleep(1000);
        driver.navigate().refresh();
	}
	public void SearchToFromDate() throws InterruptedException
	{
		FromAssigndate.click();
        Select monthdropdown = new Select(frommonth);
        // Select an option by visible text
        monthdropdown.selectByVisibleText("Jun");
        Select yeardropdown = new Select(fromyear);
        // Select an option by visible text
        yeardropdown.selectByVisibleText("2022");
        fromdate.click();
        
        ToAssigndate.click();
        Select tomonthdropdown = new Select(tomonth);
        // Select an option by visible text
        tomonthdropdown.selectByVisibleText("Jun");
        Select toyeardropdown = new Select(toyear);
        // Select an option by visible text
        toyeardropdown.selectByVisibleText("2022");
        todate.click();
        Submitbutton();
        Thread.sleep(1000);
        driver.navigate().refresh();
	}
	public void Searchwithall() throws InterruptedException
	{
		Select empdropdown = new Select(Employee);
        // Select an option by visible text
        empdropdown.selectByVisibleText("Chitra Omprakash Srivastava");
        Select catedropdown = new Select(Category);
        // Select an option by visible text
        catedropdown.selectByVisibleText("Employee of the month");
        
		FromAssigndate.click();
        Select monthdropdown = new Select(frommonth);
        // Select an option by visible text
        monthdropdown.selectByVisibleText("Jun");
        Select yeardropdown = new Select(fromyear);
        // Select an option by visible text
        yeardropdown.selectByVisibleText("2022");
        fromdate.click();
        
        ToAssigndate.click();
        Select tomonthdropdown = new Select(tomonth);
        // Select an option by visible text
        tomonthdropdown.selectByVisibleText("Jun");
        Select toyeardropdown = new Select(toyear);
        // Select an option by visible text
        toyeardropdown.selectByVisibleText("2022");
        todate.click();
        Submitbutton();
        Thread.sleep(1000);
        driver.navigate().refresh();
	}
}
