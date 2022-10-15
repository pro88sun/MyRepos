package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/java/feature",
		glue = "stepDefinitions",
		dryRun = false,
		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		monochrome = true
			
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	/*@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	} */

}
