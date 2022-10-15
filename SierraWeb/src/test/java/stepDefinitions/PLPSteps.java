package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;

import pageObjects.PDPUI;
import pageObjects.PLPUI;
import utils.Log;
import utils.TestContext;

public class PLPSteps {

	public TestContext testContext;
	public PLPUI plpUI;
	public PDPUI pdpUI;
	public String plpProductName="";

	public PLPSteps(TestContext testContext) {
		
		this.testContext=testContext;
		plpUI=testContext.pgObjManager.getPLPUI();
		pdpUI=testContext.pgObjManager.getPDPUI();
		
	}
	
	@Then("user is navigated to PDP screen while clicking on product image from PDP")
	public void user_is_navigated_to_pdp_screen_while_clicking_on_product_image_from_pdp() throws InterruptedException {
	   
		plpProductName= plpUI.navigateToPDP();
		Log.info("user is navigated to PDP successfully..");
	    
	}
	@Then("user is able to view the product details")
	public void user_is_able_to_view_the_product_details() {
	    Assert.assertEquals(plpProductName, pdpUI.getPDPHeaderText());
	    Log.info("user clicked on product "+plpProductName);
	    
	}
}
