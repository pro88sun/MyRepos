package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	
	public WebDriver driver;
	Properties prop;
	
			
	public WebDriver driverManager() throws IOException {

	prop=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//prop.properties");
	prop.load(fis);
	String browser=prop.getProperty("browser");
	String url=prop.getProperty("url");
	if(driver==null) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--allow-running-insecure-content");
			options.addArguments("--incognito");
			driver=new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
	}
	
	
	return driver;
	}
	
}
