package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\FeatureFile\\Naukri.feature"},
		
		glue = {"Execution"},
		
		publish = true,
		
		plugin = {"pretty"}
		
		
		
)

public class Runner extends AbstractTestNGCucumberTests
{

}
