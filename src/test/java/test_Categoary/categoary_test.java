package test_Categoary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page_Junit.Categoary_Page;
import util.First_Test;

public class categoary_test {
	

	 WebDriver driver;
	First_Test first_test;
	Categoary_Page test;
	
	
	@Test
	public void browser() throws Exception {
		driver=First_Test.launch();
		test=PageFactory.initElements(driver, Categoary_Page.class);
		test.addCategory();
		test.submit();
		test.validatingAddCategory();
	} 
	

		
	}
	
	
	
	
	

