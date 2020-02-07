package stepdefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flight {
	
	@Given("^User should be Login page$")
	public void user_should_be_Login_page() throws Throwable {
	    System.out.println("User should be Login page");
	}

	@When("^User enter valid credentials and submit$")
	public void user_enter_valid_credentials_and_submit() throws Throwable {
		System.out.println("User enter valid credentials and submit");
	}

	@Then("^User should be in homepage$")
	public void user_should_be_in_homepage() throws Throwable {
		System.out.println("User should be in homepage"); 
		}
	@When("^User enter invalid credentials and submit$")
	public void user_enter_invalid_credentials_and_submit() throws Throwable {
		System.out.println("User enter invalid credentials and submit"); 
	}

	@Then("^system should throw error message$")
	public void system_should_throw_error_message() throws Throwable {
		System.out.println("system should throw an error message");
	}




}
