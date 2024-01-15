package Resource;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PracticeTesting.EasyCollab.Login;

public class Base {
	public WebDriver driver;
	public Login LoginPage;
	public String email ;
	public String password;
	
	public WebDriver intializeDriver() throws IOException
	{
		 driver=new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 return driver;
	}
	
	
	  @BeforeMethod(alwaysRun=true) 
	  public Login loginApplication() throws
	  IOException { driver = intializeDriver(); 
	  LoginPage =new Login(driver);
	  LoginPage.goTo(); 
	  return LoginPage; }
	 

//screenshot method
	  public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	  {
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  File file = new File(System.getProperty("user.dir")+ "//reports//" + testCaseName + ".png");
		  FileUtils.copyFile(source, file);
		 return System.getProperty("user.dir")+ "//reports//" + testCaseName + ".png";
		  
	  }
	  
	 
	@AfterMethod(alwaysRun=true)
	public void teardown() throws InterruptedException
	{
		Thread.sleep(1000);
		//driver.close();
		try {
	        // Check if an alert is present
	        Alert alert = driver.switchTo().alert();
	        
	        // If an alert is present, accept it
	        alert.accept();
	    } catch (NoAlertPresentException e) {
	        // No alert is present, continue with closing the browser
	    } finally {
	        // Close the browser window
	        driver.quit();
	    }
	}

}
