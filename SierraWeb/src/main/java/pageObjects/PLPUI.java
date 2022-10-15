package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PLPUI {

	public WebDriver driver;
	private String plpProductName="";
	
	public PLPUI(WebDriver driver) {
		this.driver=driver;
		
	}
	
	private By plpHeaderText=By.xpath("//div[@class='category-header']/h1");
	private By plpProductImage=By.id("style-1000713308");
	private By plpProductImageName=By.xpath("//span[@id='product-brand-1000713308']");
	
	
	public String getPLPHeaderText() {
		return driver.findElement(plpHeaderText).getText().toString();
		
	}
	
	public String navigateToPDP() throws InterruptedException {
		
		plpProductName=driver.findElement(plpProductImageName).getText().toString();
		driver.findElement(plpProductImage).click();
		Thread.sleep(5000);
		return plpProductName;
		
	}
	
}
