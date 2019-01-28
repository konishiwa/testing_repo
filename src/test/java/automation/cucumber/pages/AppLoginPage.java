package automation.cucumber.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AppLoginPage extends BasePageObject {
	
	@FindBy(css = "input[name='email']") WebElementFacade userNameInput;
	@FindBy(css = "input[name='password']") WebElementFacade passwordInput;
	@FindBy(css = "button[name='submit']") WebElementFacade loginButton;
	@FindBy(css = "span[class='application-title'") WebElementFacade applicationTitle;
	//submit
	@FindBy(css = "div[class='r'] a") List<WebElementFacade> resultsLinks;
	@FindBy(css = "div[class='auth0-lock-name") WebElementFacade authTitle;
	@FindBy(xpath = "//*[@id=\"container\"]/main/div/div/div[3]/div/table/tbody/tr[1]/td[1]") WebElementFacade name;
	@FindBy(xpath = "//*[@id=\"container\"]/main/div/div/div[3]/div/table/tbody/tr[1]/td[2]") WebElementFacade dob;
	@FindBy(xpath = "//*[@id=\"container\"]/main/div/div/div[3]/div/table/tbody/tr[1]/td[3]") WebElementFacade aliennumber;
	@FindBy(xpath = "//*[@id=\"container\"]/main/div/div/div[3]/div/table/tbody/tr[1]/td[4]") WebElementFacade state;
	@FindBy(xpath = "//*[@id=\"container\"]/main/div/div/div[3]/div/table/tbody/tr[1]/td[5]") WebElementFacade address;
	@FindBy(xpath = "//*[@id=\"container\"]/main/div/div/div[3]/div/table/tbody/tr[1]/td[6]") WebElementFacade desc;
	
	public void typeIntoUserNameInput(String text) {
		userNameInput.type(text);
	}
	
	public String getNameElement() {
		return name.getText() + dob.getText() + aliennumber.getText() + state.getText() + address.getText() + desc.getText();
	}
	
	public void typeIntoPasswordInput(String text) {
		passwordInput.type(text);
	}
	
	public String getApplicationTitle() {
		return applicationTitle.getText();
	}
	
	public String getAuthTitle() {
		return authTitle.getText();
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public String getFirstResultsHref() {
		return resultsLinks.get(0).getAttribute("href");
	}

}
