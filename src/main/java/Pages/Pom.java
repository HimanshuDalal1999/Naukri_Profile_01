package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom 
{
	WebDriver driver;
	
	
	@FindBy ( id = "login_Layer") private WebElement clickingLoginButton;
	@FindBy (xpath = "//input[@placeholder='Enter your active Email ID / Username']") private WebElement enteringUsername;
	@FindBy (xpath = "//input[@placeholder='Enter your password']") private WebElement enteringPassword;
	@FindBy (xpath = "//button[@class='btn-primary loginButton']") private WebElement clickingLoginButton2;
	@FindBy (xpath = "//div[text()='Himanshu J. Dalal']") private WebElement verifyingLogin;
	
	//	@FindBy (xpath = "") private WebElement LoginButton;
	

	public Pom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickonLoginButton()
	{
		clickingLoginButton.click();
	}
	public void EnterUsername(String Username)
	{
		enteringUsername.sendKeys(Username);
	}
	public void EnterPassword(String Password)
	{
		enteringPassword.sendKeys(Password);
	}
	public void ClickLoginButton2()
	{
		clickingLoginButton2.click();
	}
	public String VerifyLogin()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(verifyingLogin));
		String Profile = verifyingLogin.getText();
		return Profile;
	}
	
}
