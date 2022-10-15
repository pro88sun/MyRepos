package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	HomepageUI homeUI;
	PLPUI plpUI;
	PDPUI pdpUI;
	CartUI cartUI;
	ShippingUI shippingUI;
	BillingUI billingUI;
	OrderReviewUI reviewUI;
	
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
	public CartUI getCartUI() {
		cartUI=new CartUI(driver);
		return cartUI;
	}
	public ShippingUI  getShippingUI() {
		shippingUI=new ShippingUI(driver);
		return shippingUI;
	}
	public BillingUI getBillingUI() {
		billingUI=new BillingUI(driver);
		return billingUI;
	}
	public OrderReviewUI  getOrderReviewUI() {
		reviewUI=new OrderReviewUI(driver);
		return reviewUI;
	}
}
