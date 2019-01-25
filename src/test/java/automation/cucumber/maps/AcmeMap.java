package automation.cucumber.maps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.cucumber.steps.AcmeSteps;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

public class AcmeMap {
	
	@Steps
	AcmeSteps acmeSteps;
	
	String baseUrl = "http://peach-two.pyramidchallenges.com.s3-website.us-east-2.amazonaws.com/";
	String baseUri = "http://pac-peach-two-i-951702275.us-east-2.elb.amazonaws.com/api";
	
    @Given("^I get a 200 status from /emps endpoint$")
    public void iGetA200StatusFromEmpsEndpoint() throws Throwable {
    	RestAssured.baseURI = baseUri;
    	Response response = SerenityRest.rest()
      .given()
      .when()
      .get("/emps");
      assertThat(response.getStatusCode())
      .overridingErrorMessage("You can give a custom error message in the report here")
      .isEqualTo(200);
    }
	
    @Given("^i open the ACME login page$")
    public void iOpenTheACMELoginPage() throws Throwable {
    	acmeSteps.openWebPage(baseUrl);
    }

    @When("^i login with username (.+) and password (.+)$")
    public void iLoginWithUsernameAndPassword(String username, String password) throws Throwable {
    	acmeSteps.iLoginWithUsernameAndPassword(username,password);
    }

    @Then("^i should be on the homepage$")
    public void iShouldBeOnTheHomepage() throws Throwable {
    	acmeSteps.iShouldBeOnTheHomepage();
    }
    
//    Response response = SerenityRest.rest()
//    .given()
//    .when()
//    .get("/"+variable1+"/"+variable2);
//    System.out.println("***********");
//    assertThat(response.getStatusCode())
//    .overridingErrorMessage("You can give a custom error message in the report here")
//    .isEqualTo(200);
	

}
