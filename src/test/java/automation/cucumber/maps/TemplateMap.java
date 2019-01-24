package automation.cucumber.maps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Then;

import automation.cucumber.steps.TemplateSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class TemplateMap {
	
	@Steps
	TemplateSteps steps;
	
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

    @Given("^i can use scenario outline and examples to pass in variables like this (.+) and (.+)$")
    public void iCanUseScenarioOutlineAndExamplesToPassInVariablesLikeThisAnd(String variable1, String variable2) throws Throwable {

    }

    @When("^i use the template$")
    public void iUseTheTemplate() throws Throwable {
      
    }

    @Then("^i have made life easier$")
    public void iHaveMadeLifeEasier() throws Throwable {
        
    }
}
