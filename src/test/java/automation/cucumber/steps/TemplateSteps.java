package automation.cucumber.steps;

import java.util.List;

import automation.cucumber.pages.BasePageObject;
import automation.cucumber.pages.TemplatePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class TemplateSteps {
	
	@Steps
	BasePageObject page;
	
	@Step
	public void openWebPage(String baseUrl) {
		page.openAt(baseUrl);
	}

}
