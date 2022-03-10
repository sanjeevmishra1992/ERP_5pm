package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDataExample {
	
	@Given("Display the Student {string}")
	public void display_the_student(String studentName) {
		System.out.print("Student - " + studentName + " has got ");
	}
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(int studentMarks) {
	    System.out.print(studentMarks + " marks in exams..");
	}
	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String studentResult) {
	   System.out.println(" And the result is " + studentResult);
	}

}
