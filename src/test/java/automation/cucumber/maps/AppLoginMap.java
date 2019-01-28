package automation.cucumber.maps;

import automation.cucumber.steps.AppLoginSteps;
import automation.cucumber.steps.TemplateSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AppLoginMap {
	
	@Steps
	TemplateSteps steps;
	@Steps
	AppLoginSteps appLoginSteps;

	String baseUrl = "http://pac-bowser1-i-1314236450.us-east-2.elb.amazonaws.com/api/auth/login";

	@Given("^I am on the application$")
	public void i_am_on_the_application() throws Throwable {
	  steps.openWebPage(baseUrl);
	}

	@When("^([^\\\"]*) logs in with ([^\\\"]*)$")
	public void name_logs_in_with_password(String arg1, String arg2) throws Throwable {
	  appLoginSteps.login(arg1, arg2);
	}

	@Then("^the application shows the ([^\\\"]*) login status$")
	public void the_application_shows_the_success_login_status(String arg1) throws Throwable {
	  appLoginSteps.loginSuccess(arg1);
	}
	
	@Then("^the results will be shown$")
	public void the_results_will_be_shown() throws Throwable {
	    appLoginSteps.showResult();
	}
	
	@Then("^the user is able to click on the ([^\\\"]*) employee and view their profile$")
	public void the_user_is_able_to_click_on_the_last_employee_and_view_their_profile(String employee) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    appLoginSteps.getProfileResults();
	}
	
	@When("^the user chooses to edit their profile$")
	public void the_user_chooses_to_edit_their_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		appLoginSteps.editTheirProfile();
	}


	@Then("^the attribute will be updated$")
	public void the_attribute_will_be_updated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		appLoginSteps.willbeUpdated();
	}


	@When("^they change the ([^\\\"]*) attribute$")
	public void they_change_the_email_attribute(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    appLoginSteps.checkAttribute(arg1);
	}

	
	@When("^the user chooses to search$")
	public void the_user_chooses_to_search() throws Throwable {
	   
	}

	@When("^they chose to search for ([^\\\"]*) $")
	public void they_chose_to_search_for_attribute(String attribute) throws Throwable {
	    
	}



	@Then("^the attribute ([^\\\"]*) results will be shown$")
	public void the_attribute_no_results_will_be_shown(String attribute) throws Throwable {
	}






}
