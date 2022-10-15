package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepageUI {
	public WebDriver driver;
	
	public HomepageUI(WebDriver driver) {
		this.driver=driver;
	}
	
	private By men=By.xpath("//a[@id='usmm-tl-cat1160005p']");
	
	private By men_Boots=By.linkText("Shirts");
	
	private By popUpWindow=By.className("bx-align");
	//private By popUpDecline=By.xpath("//button[contains(text(),'I don't want free shipping')]");
	private By popUpDecline=By.xpath("//button[@type='reset']");
	
	public void closePopUp() throws InterruptedException {
		WebDriverWait waitForPopUp=new WebDriverWait(driver, Duration.ofSeconds(5));
		waitForPopUp.until(ExpectedConditions.visibilityOf(driver.findElement(popUpWindow)));
		List<WebElement> popUp=driver.findElements(popUpWindow);
		if(popUp.size()>0) {
			driver.findElement(popUpDecline).click();
			Thread.sleep(2000);
		}
		
	}
	
	public void getPLP() throws InterruptedException {
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(men)).build().perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(men_Boots)).click().perform();
		Thread.sleep(2000);
		
		
	}
}
