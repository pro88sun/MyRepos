package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

public class GenericUtils {
public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void getScreenshot(Scenario scenario)
	{
	if(scenario.isFailed()){
		TakesScreenshot ts=(TakesScreenshot)driver;
	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot,"image/png",scenario.getName().toString());
	}
	}

}
