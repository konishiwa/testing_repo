package automation.cucumber.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class TemplatePage {
	
	@FindBy(css = "element[attribute='value']") WebElementFacade webElement;
	@FindBy(css = "element2[attribute2='value2']") List<WebElementFacade> webElements;

}
