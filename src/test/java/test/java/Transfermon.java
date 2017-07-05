package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// shortcut cntrl+shift+O

//create a Maven project
// add the feature file in resources. add the runner file into test.java
// Edit the pom.xml by adding the necessary libraries.
//the maven dependcies folder created will add automatically all the libraries. 
//no need to configure build path.
public class Transfermon {
	
	@Given("^I have an account of type \"([^\"]*)\" with a balance (\\d+)$")
	public void i_have_an_account_of_type_with_a_balance(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the monthly interest is calculated$")
	public void the_monthly_interest_is_calculated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should have earned at an annual interest rate (\\d+)$")
	public void i_should_have_earned_at_an_annual_interest_rate(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should have a new balance of \"([^\"]*)\"$")
	public void i_should_have_a_new_balance_of(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
