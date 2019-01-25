package automation.cucumber.steps;

import automation.cucumber.pages.BasePageObject;
import automation.cucumber.pages.GooglePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class GoogleSteps {
	
	@Steps
	BasePageObject basePage;
	@Steps
	GooglePage googlePage;
	
	
	@Step()
	public void openWebPage(String baseUrl) {
		basePage.openAt(baseUrl);
	}

	@Step("type and enter {0} into google search")
	public void searchFor(String search) {
		googlePage.typeIntoSearch(search);
		googlePage.clickGoogleSearch();
	}

	@Step("verify first result's href is {0}")
	public void verifyFirstResultsWebsite(String website) {
		String href = googlePage.getFirstResultsHref();
		assertThat(href.contains(website)).isEqualTo(true);
	}

}
