package Execution;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Pages.DriverFactory;
import Pages.Utility;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks 
{
	static WebDriver driver;
	static DriverFactory DF;
	
	@BeforeAll
	public static  void OpenBrowser() throws IOException
	{
		 DF = new DriverFactory();
		driver = DF.InitializeBrowser(Utility.PropertyFile("Browser"));
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterAll
	public static void CloseBrowser()
	{
		//driver.close();
	}

}
