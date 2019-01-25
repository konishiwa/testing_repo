package automation.cucumber.steps;

import automation.cucumber.pages.AcmePage;
import automation.cucumber.pages.BasePageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class AcmeSteps {
	
	BasePageObject basePage;
//	AcmePage acmePage;
	
	//Login Page
	@FindBy(id = "username") WebElementFacade usernameInput;
	@FindBy(id = "password") WebElementFacade passwordInput;
	@FindBy(id = "login") WebElementFacade loginButton;
	
	/* Main Page */
	//User Row
	@FindBy(css = "login") WebElementFacade userNameLink;
	@FindBy(css = "login") WebElementFacade userEmailField;
	@FindBy(css = "login") WebElementFacade userPhoneField;
	@FindBy(css = "login") WebElementFacade userAddressField;
	@FindBy(css = "login") WebElementFacade userEditButton;
	@FindBy(css = "login") List<WebElementFacade> userSkillsChips;
	
	//Table Rows
	@FindBy(css = "login") List<WebElementFacade> nameLinks;
	@FindBy(css = "login") List<WebElementFacade> emailFields;
	@FindBy(css = "login") List<WebElementFacade> phoneFields;
	@FindBy(css = "login") List<WebElementFacade> addressFields;
	@FindBy(css = "login") List<WebElementFacade> skillsInputs;
	
	@Step
	public void openWebPage(String baseUrl) {
		basePage.openAt(baseUrl);
	}

	@Step
	public void iLoginWithUsernameAndPassword(String username, String password) {
		usernameInput.type(username);
		passwordInput.type(password);
		loginButton.click();
	}

	@Step
	public void iShouldBeOnTheHomepage() {
		assertThat(userNameLink.isPresent()).isEqualTo(true);
	}

}
