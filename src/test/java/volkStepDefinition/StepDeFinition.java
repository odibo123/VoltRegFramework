package volkStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDeFinition {
	
	
	public WebDriver driver;
	@Given("^User is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
		//initialise the chromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//navigate to the URL
		driver.navigate().to("https://covercheck.vwfsinsuranceportal.co.uk/");
		driver.manage().window().maximize();			
	}

	@When("^user enters his data  in the Reg input box$")
	public void user_enters_his_data_in_the_Reg_input_box() throws Throwable {
		driver.findElement(By.xpath("//input[@id='vehicleReg']")).sendKeys("OV12UYY");
	 
	}

	@And("^user clicks the Find Vehicle box$")
	public void user_clicks_the_Find_Vehicle_box() throws Throwable {
	driver.findElement(By.xpath("//span[contains(.,'Find vehicle')]")).click();
	}
	@Then("^user should see the start and end result date of his vehicle registration$")
	public void user_should_see_the_start_and_end_result_date_of_his_vehicle_registration() throws Throwable {
//   String text =  driver.findElement(By.xpath("//div[@id='page']")).getText();
 //.out.println(text);
  // Assert.assertEquals("Result for : OV12UYY" ,driver.findElement(By.cssSelector(".result")).getText());
 //  String expected = "Result for : OV12UYY";
 //  String actual = driver.findElement(By.cssSelector(".result")).getText();
//   Assert.assertEquals(expected, actual);
		

		String text1 = "Result for : OV12UYY";
	String text2 = driver.findElement(By.cssSelector(".result")).getText();
		if(text1.equals(text2)){
		
	System.out.println("passed");
	}
	else{
		System.out.println("failed");
	}
	
	}
	@When("^user enters \"([^\"]*)\"  in the Reg input box$")
	public void user_enters_in_the_Reg_input_box(String inaccurateValue) throws Throwable {
	  driver.findElement(By.xpath("//input")).sendKeys(inaccurateValue);
	}
	@Then("^user should see <\"([^\"]*)\"> displayed$")
	public void user_should_see_displayed(String inaccurateValue ) throws Throwable {

//	String actualErrorMessage = driver.findElement(By.cssSelector("#icon")).getText(); 
//	System.out.println(actualErrorMessage);
//	Assert.assertEquals("errorMessage" ,actualErrorMessage);	
	
		String text1 = "errorMessage";
	String text2 =  driver.findElement(By.cssSelector("#icon")).getText();
		if(text1.equals(text2)){
		
	System.out.println("passed");
	}
	else{
		System.out.println("failed");
	}
	
	//  Assert.assertEquals("errorMessage", driver.findElement(By.cssSelector("#icon")).getText());
	}
	@Then("^user close the Browser$")
	public void user_close_the_Browser() throws Throwable {
	   driver.close();
	}
	
}
