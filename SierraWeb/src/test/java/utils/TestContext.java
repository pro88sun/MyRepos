package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.HomepageUI;
import pageObjects.PageObjectManager;

public class TestContext {
	
	public WebDriver driver;
	public TestBase testbase;
	public PageObjectManager pgObjManager;
	public GenericUtils genericUtils;
	
	public TestContext() throws IOException {
		testbase=new TestBase();
		pgObjManager=new PageObjectManager(testbase.driverManager());
		genericUtils=new GenericUtils(testbase.driverManager());
	}

}
