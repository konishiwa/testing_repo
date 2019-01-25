package automation.cucumber.maps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import groovy.json.JsonBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.cucumber.steps.TemplateSteps;
import automation.model.TemplateModel;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import static org.assertj.core.api.Assertions.*;

public class TemplateMap {
	
	@Steps
	TemplateSteps steps;
	
	String baseUrl = "https://www.google.com";
	
    @Given("^i open the webpage$")
    public void iOpenTheWebpage() throws Throwable {
    	steps.openWebPage(baseUrl);
    }
	
	//Use TidyGherkin chrome app on the cucumber feature file to easily generate the step file (settings -> camelCase)
    @Given("^i perform a GET API call$")
    public void iPerformAGETAPICall() throws Throwable {
        SerenityRest.rest()
        .given()
        .when()
        .get("/list")
        .then()
        .statusCode(200);
    }
    
    @Given("^i perform a POST API call$")
    public void iPerformAPOSTAPICall() throws Throwable {
    	TemplateModel model = new TemplateModel(123,"test");
    	 RequestSpecification request = RestAssured.given();
    	 
    	 JsonBuilder params = new JsonBuilder();
    	 params.setProperty("id", model.getId());
    	 params.setProperty("name", model.getName());
    	 
    	 request.body(params.toPrettyString());
    	 Response response = request.post(baseUrl);
    	 
    	 System.out.println(response.body().asString());
    }

    @Given("^i perform an API call with parameters (.+) and (.+)$")
    public void iPerformAnAPICallWithParametersAnd(String variable1, String variable2) throws Throwable {
        Response response = SerenityRest.rest()
        .given()
        .when()
        .get("/"+variable1+"/"+variable2);
        System.out.println("***********");
        assertThat(response.getStatusCode())
        .overridingErrorMessage("You can give a custom error message in the report here")
        .isEqualTo(404);
    }

}
