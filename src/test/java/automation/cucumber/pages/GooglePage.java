package automation.cucumber.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GooglePage extends BasePageObject {
	
	@FindBy(css = "input[title='Search']") WebElementFacade searchInput;
	@FindBy(css = "input[type='submit']") WebElementFacade searchButton;
	
	@FindBy(css = "div[class='r'] a") List<WebElementFacade> resultsLinks;
	
	public void typeIntoSearch(String text) {
		searchInput.type(text);
	}
	
	public void clickGoogleSearch() {
		searchButton.click();
	}
	
	public String getFirstResultsHref() {
		return resultsLinks.get(0).getAttribute("href");
	}
}
