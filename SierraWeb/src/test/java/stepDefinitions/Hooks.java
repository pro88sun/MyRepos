package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import utils.TestContext;

public class Hooks {
	
	public WebDriver driver;
	public TestContext testcontext;
	public Hooks(TestContext testcontext) throws IOException {
		this.testcontext=testcontext;
		this.driver=testcontext.testbase.driverManager();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		//Thread.sleep(5000);
		driver.quit();
	}

}
