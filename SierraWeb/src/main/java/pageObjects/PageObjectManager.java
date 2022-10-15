package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	HomepageUI homeUI;
	PLPUI plpUI;
	PDPUI pdpUI;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public HomepageUI gethomeUI() {
		homeUI=new HomepageUI(driver);
		return homeUI;
	}
	
	public PLPUI getPLPUI() {
		plpUI=new PLPUI(driver);
		return plpUI;
	}
	
	public PDPUI getPDPUI() {
		pdpUI=new PDPUI(driver);
		return pdpUI;
	}
}
