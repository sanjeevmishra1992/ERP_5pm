package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Test2 {
	
	int a,b,result;
	
	@Given("Assign A and B values")
	public void assign_a_and_b_values() {
	   a = 10;
	   b = 20;
	}
	
	@When("user calculates a+b")
	public void user_calculates_a_b() {
	   result = a+b;
	   Assert.assertEquals(result, 30);
	}
	
	@Then("Display the results")
	public void display_the_results() {
        System.out.println("The Result is: " + result);
	}
	
	@Then("user calculates a * b")
	public void MultiplicationOfA_B() {
        result = a*b;
        Assert.assertEquals(result, 200);
	}


}
