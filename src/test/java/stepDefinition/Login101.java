package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login101 {
	
	BaseMethods base;
	
	@Given("Launch the ERP Application")
	public void erp_application_is_launched() {
	  base = new BaseMethods();
	  base.openBrowser();
	  base.launchERP();
	}
	
	@When("Enter {string} and {string} click on Login")
	public void LoginAsValidUser(String username, String password) {
	   base.loginERP2(username, password);
	}
	@Then("Validate the {string}")
	public void ValidateTheResult(String result) {
	  System.out.println("Expected Result is - " + result);
	  base.driver.close();
	}
	
}
