package Execution;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.DriverFactory;
import Pages.Pom;
import Pages.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefiniton 
{
	WebDriver driver;
	Pom pom ;
	
	@Given("User should be at Login Page")
	public void UsershouldbeatLoginPage() throws InvalidFormatException, IOException
	{
		 pom = new Pom(DriverFactory.GetDriver());
		driver = DriverFactory.GetDriver();
		driver.get(Utility.ExcelSheet(0, 0));
	}
	@When("User click on Login button")
	public void UserclickonLoginbutton()
	{
		pom.ClickonLoginButton();
	}
	@And("User enters Username as {string}")
	public void UserentersUsernameas(String Username)
	{
		pom.EnterUsername(Username);
	}
	@And("User enters Password as {string}")
	public void UserentersPasswordas(String Password)
	{
		pom.EnterPassword(Password);
	}
	@And("User clicks on Login button")
	public void UserclicksonLoginbutton()
	{
		pom.ClickLoginButton2();
	}
	@Then("User sould redirects to Home page")
	public void UsersouldredirectstoHomepage() throws InterruptedException, InvalidFormatException, IOException
	{
		String Actual = pom.VerifyLogin();
		Assert.assertEquals(Actual, Utility.ExcelSheet(1, 0));
	}
	
		
	

}
