package PracticeTesting.EasyCollab;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AbstractComponents.AbstractComponents;

public class Library extends AbstractComponents {

	WebDriver driver;
	public Library(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath = "//header/div/ul[1]/li[8]/a[contains(text(),'Library & Snacks')]")
	WebElement Librarymenu;
	
	@FindBy(linkText = "Library")
	WebElement Librarylink;

	@FindBy(xpath="//section[@class='tab-pane active most-rated-book']/div/div/div/ul/li[1]/div/div/div/strong/a")
	WebElement Mostreadbook;
	
	@FindBy(xpath="//div[@id='comment-14']")
	WebElement CommentScroll;
	
	@FindBy(xpath="//section[@class='tab-pane active top-readers-quarter top-readers-quarter-data']/div/div/div/div/ul/li[1]/div/div/div/strong/a")
	WebElement TopReadersQuaters;
	
	@FindBy(xpath="//div[@class='quote set-50 alert alert-warning set-50']/span[contains(text(),'Top 5 Readers of the Quarter')]")
	WebElement TopreaderHeading;
	
	@FindBy(xpath="//div[@class='quote set-50 alert alert-warning set-50']/span[contains(text(),'Top 5 Readers of the Year')]")
	WebElement TopreaderYearTitle;
	
	@FindBy(xpath="//section[@class='tab-pane active top-readers-year top-readers-year-data']/div/div/div/div/ul/li[1]/div/div/div/strong/a")
	WebElement TopreaderYear;
	
	@FindBy(xpath="//span[contains(text(),'Book Donors (8)')]")
	WebElement BookDonorsTitle;
	
	@FindBy(xpath="//section[@class='tab-pane active top-readers-quarter']/div/div[1]/div/ul/li/div/div/div/strong/a")
	WebElement BookDonors;
	
	@FindBy(xpath="//span[contains(text(),'Library')]")
	WebElement LibraryTitle;
	
	@FindBy(xpath="//div[@class='width-carousel recommend-block border-0']/div/ul/li[6]/div/span/a")
	WebElement Download;
	
	@FindBy(xpath="//div[@class='width-carousel recommend-block border-0']/div/ul/li[1]/div/div[1]/div/strong/a")
	WebElement Openbook;
	
	@FindBy(linkText = "My Library")
	WebElement MyLibrarylink;
	
	@FindBy(xpath="//div[@class='row btn-green']/a")
	WebElement DonateBookBtn;
	
	@FindBy(id="ElibraryDonateBookName")
	WebElement Bookname;
	
	@FindBy(id="ElibraryDonateDescription")
	WebElement BookDescription;
	
	@FindBy(id="ElibraryDonateAuthorName")
	WebElement AuthorName;
	
	@FindBy(id="ElibraryDonateNoOfPages")
	WebElement PageNumber;
	
	@FindBy(id="ElibraryDonateCategoryId_chosen")
	WebElement Tags;
	
	@FindBy(id="book-photo")
	WebElement Bookimage;
	
	@FindBy(xpath="//button[@id='project-button']")
	WebElement Submit;
	
	@FindBy(xpath="//div[@class='col-sm-4 col-sm-offset-2']/a")
	WebElement Cancel;
	
	/*To open library menu */
	public void LibrarymenuClick() throws InterruptedException
	{
		Librarymenu.click();		
	} 
	
	/*To open 1st most read book from list */
	public void MostreadbooksClick() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		Librarylink.click();
		waitForWebElementToAppear(Mostreadbook);
		Mostreadbook.click();
		waitForElementToDisappear(Mostreadbook);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",CommentScroll );
		Thread.sleep(1000);
		driver.navigate().refresh();
		//logoutmenu();
	}
	
	/*To open 1st top reader of quarter from list */
	public void TopReadersQuaterClick() throws InterruptedException
	{
		//loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		Librarylink.click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",TopreaderHeading );
		Thread.sleep(1000);
		TopReadersQuaters.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
	/*To open 1st top reader of year from list */
	public void TopReadersYearClick() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		Librarylink.click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",TopreaderYearTitle );
		Thread.sleep(1000);
		TopreaderYear.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
	/*To open 1st book donor from list */
	public void BookDonorsClick() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		Librarylink.click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",BookDonorsTitle );
		Thread.sleep(1000);
		BookDonors.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
	/*To download book from list */
	public void LibrarydownloadClick() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		Librarylink.click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",LibraryTitle );
		Thread.sleep(1000);
		Download.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
	/*To open book from library */
	public void LibraryOpenbookClick() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		Librarylink.click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",LibraryTitle );
		Thread.sleep(1000);
		Openbook.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
	/*To open My library menu */
	public void MyLibrarymenuClick() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		MyLibrarylink.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",DonateBookBtn );
		Thread.sleep(1000);
		DonateBookBtn.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
	/*To Donate book & click on cancel */
	public void DonateBook() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		MyLibrarylink.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",DonateBookBtn );
		Thread.sleep(1000);
		DonateBookBtn.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
	/*To Donate book & click on cancel */
	public void CancelDonateBook() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		MyLibrarylink.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",DonateBookBtn );
		Thread.sleep(1000);
		DonateBookBtn.click();
		Bookname.sendKeys("Listen to Your Heart: The London Adventure");
		BookDescription.sendKeys("Shortly before his eighteenth birthday, Ruskin embarks on a literary journey and reaches England after charting unknown waters. Greeted by the uncertainties of a new city, he muses over his loneliness, switches jobs, falls in love, befriends the ocean and relentlessly chases a big dream!");
		AuthorName.sendKeys("Ruskin Bond");
		PageNumber.sendKeys("104");
		Tags.click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='chosen-results']/li"));

		for (WebElement element : elements) {
		    if(element.getText().equalsIgnoreCase("eBook"))
		    {
		    	element.click();
		    }
		}
		Bookimage.sendKeys("F:\\TypeWiseFile\\Jpg Files\\download (1).jpg");
		Thread.sleep(1000);
		
		Cancel.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
	/*To Donate book & click on Save */
	public void SaveDonateBook() throws InterruptedException
	{
		loginapplication("cos@narola.email","chitr@154Sri");
		Librarymenu.click();
		MyLibrarylink.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",DonateBookBtn );
		Thread.sleep(1000);
		DonateBookBtn.click();
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		logoutmenu();
	}
	
}
