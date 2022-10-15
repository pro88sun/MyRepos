package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.HomepageUI;
import pageObjects.PLPUI;
import utils.Log;
import utils.TestContext;

public class HomePageSteps {
	
	public TestContext testcontext;
	HomepageUI homeUI;
	PLPUI plpUI;
	public HomePageSteps(TestContext testcontext) throws IOException {
		this.testcontext=testcontext;
		
		homeUI=testcontext.pgObjManager.gethomeUI();
		plpUI=testcontext.pgObjManager.getPLPUI();
	}
	
	@Given("user is on Homepage")
	public void user_is_on_homepage() throws InterruptedException {
	  Log.info("------Home Page Launched Successfully--------");
	  homeUI.closePopUp();
	}
	@When("^user clicks on (.+) under (.+)$")
	public void user_clicks_on_men_under_boots(String category,String subCategory) throws InterruptedException {
		Log.info("User clicks on "+subCategory+" under "+category);
		homeUI.getPLP();
		
	}
	@Then("user should be navigated to PLP page")
	public void user_should_be_navigated_to_pdp_page() {
	   Assert.assertEquals(plpUI.getPLPHeaderText(), "Shirts");
	   Log.info("User is Navigated to Shirts Page");
	}
	@Then("check product details")
	public void check_product_details() {
	   
	}

}
