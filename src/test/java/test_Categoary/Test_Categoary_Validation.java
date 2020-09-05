package test_Categoary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page_Junit.Categoary_Validation;

import util.First_Test;



public class Test_Categoary_Validation {
	
	WebDriver driver;
	First_Test browser;
	Categoary_Validation data;
	
	@Test
	public void browser() throws Exception    {
	      driver=First_Test.launch();
		
		data= PageFactory.initElements(driver,Categoary_Validation.class);
		
		data.duplicate();
		data.validation();
		
		
	}
}

	
	
	
	
	
	
	

//Validate a user is not able to add a duplicated category. If it does then the
	// following message will display:
	// "The category you want to add already exists: <duplicated category name>."