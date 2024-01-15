package PracticeTesting.EasyCollab.Tests.PositiveTestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resource.Base;
import PracticeTesting.EasyCollab.Library;

public class LibraryTestCases extends Base {

public Library Library;
	
	@BeforeMethod(alwaysRun = true)
	public void ProfileSetup() throws IOException, InterruptedException
	{
	//create object for page object & send driver as argument as it will give life to driver object
		
		Library=new Library(driver);
		
	}

	  @Test public void GetMostReadBooks() throws IOException, InterruptedException
	  { 
		  Library.MostreadbooksClick();
		  
		  Library.TopReadersQuaterClick(); 
		  
		  Library.TopReadersYearClick();
		  
		  Library.BookDonorsClick();
		  
		  Library.LibrarydownloadClick();
		  
		  Library.MyLibrarymenuClick();
		  
		  Library.CancelDonateBook();
		  
		  Library.SaveDonateBook();
	  }
	  	 
}
