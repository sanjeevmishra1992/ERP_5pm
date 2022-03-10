package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginModule {
	
	BaseMethods base;
	
	@Given("ERP Application is launched")
	public void erp_application_is_launched() {
	  base = new BaseMethods();
	  base.openBrowser();
	  base.launchERP();
	}
	
	@When("user enters valid user name and password and click on login")
	public void user_enters_valid_user_name_and_password_and_click_on_login() {
	   base.loginERP();
	}
	@Then("ERP Homepage should display")
	public void erp_homepage_should_display() {
	  System.out.println("Validation is taken care..");
	  base.driver.close();
	}
	@When("user clicks on logout option")
	public void user_clicks_on_logout_option() {
	    base.driver.findElement(By.id("mi_logout")).click();
	}
	@Then("validate logout")
	public void validate_logout() {
	   Assert.assertTrue(base.driver.findElement(By.id("btnsubmit")).isEnabled());
	   base.driver.close();
	}

}
