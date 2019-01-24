package automation.cucumber.steps;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TemplateSteps {
	
	@FindBy(css = "element[attribute='value']") WebElementFacade webElement;
	@FindBy(css = "element2[attribute2='value2']") List<WebElementFacade> webElements;

}
