package Page_Junit;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Categoary_Page {
	
//Test 1: Validate a user is able to add a category and once the category is added it should display.


	WebDriver driver;

	Random rnd = new Random();
	String input;

	public Categoary_Page(WebDriver driver) {
		this.driver = driver;

	}

	// Element Library
	@FindBy(how = How.CSS, using = "input[name='categorydata']")
	WebElement AddCategory;

	@FindBy(how = How.XPATH, using = "//span[@id='extra']/child::input[@name='submit']")
	WebElement Submit;

	@FindBy(how = How.XPATH, using = "//html/body/div[3]") // path for all inputdata
	WebElement Validating;
    //String path1 = driver.findElement(By.xpath("/html/body/div[3]")).getText();
	
	
	//created method for random num and input value to take
	public void addCategory() {
		input = "jyoti29" + rnd.nextInt(235);
		AddCategory.sendKeys(input);

	}

	public void submit() {
		Submit.click();

	}

	public void validatingAddCategory() {
		boolean validation = false; //declearation for boolean assert use//
		
		String path = Validating.getText();
		for (int i = 0; i < path.length(); i++) {

			if (path.contains(input)) {
				validation = true;
			}
		}
		System.out.println(input);
		
		Assert.assertTrue(validation, "Cannot verify the entered data!!!");
	
	}
		
		
}
		
        
	

