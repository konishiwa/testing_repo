package automation.cucumber.maps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.cucumber.steps.GoogleSteps;
import automation.cucumber.steps.TemplateSteps;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

public class GoogleMap {
	
	@Steps
	TemplateSteps steps;
	@Steps
	GoogleSteps googleSteps;
	
	String baseUrl = "https://www.google.com";
	
    @Given("^i open the google homepage$")
    public void iOpenTheGoogleHomepage() throws Throwable {
    	steps.openWebPage(baseUrl);
    }

    @When("^i search for (.+)$")
    public void iSearchFor(String search) throws Throwable {
    	googleSteps.searchFor(search);
    }

    @Then("^the first result should link to (.+)$")
    public void theFirstResultShouldLinkTo(String website) throws Throwable {
    	googleSteps.verifyFirstResultsWebsite(website);
    }
	

}
