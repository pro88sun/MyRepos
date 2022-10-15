package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PDPUI {
	
	public WebDriver driver;
	
	public PDPUI(WebDriver driver) {
		this.driver=driver;
		
	}

	
	private By pdpProductHeader=By.xpath("//header[@class='section-header']/h1");
	private By pdpProductColorSelect=By.xpath("//a[@data-productimagesource='1000713308_NS1003537']");
	private By pdpProductSizeSelect=By.xpath("//a[@aria-label='L']");
	private By pdpProductQtySelect=By.id("quantity-1000713308");
	
	public String getPDPHeaderText() {
		return driver.findElement(pdpProductHeader).getText().toString();
		
	}
	
	
	
}
