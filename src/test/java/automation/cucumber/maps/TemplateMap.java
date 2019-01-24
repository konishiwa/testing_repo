package automation.cucumber.maps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.cucumber.steps.TemplateSteps;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

public class TemplateMap {
	
	@Steps
	TemplateSteps steps;
	
	String baseUrl = "http://thucydides.info/docs/serenity-staging/";
	
    @Given("^i open the webpage$")
    public void iOpenTheWebpage() throws Throwable {
    	steps.openWebPage(baseUrl);
    }
	
	//Use TidyGherkin chrome app on the cucumber feature file to easily generate the step file (settings -> camelCase)
    @Given("^i perform an API call$")
    public void iHaveAnAutomationTemplate() throws Throwable {
        SerenityRest.rest()
        .given()
        .when()
        .get("/list")
        .then()
        .statusCode(200);
    }

    @Given("^i perform an API call with parameters (.*) and (.*)$")
    public void iCanUseScenarioOutlineAndExamplesToPassInVariablesLikeThisAnd(String variable1, String variable2) throws Throwable {
        SerenityRest.rest()
        .given()
        .when()
        .get("/"+variable1+"/"+variable2)
        .then()
        .statusCode(200);
    }
}
