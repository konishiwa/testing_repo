package automation.cucumber.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AcmePage extends BasePageObject {
	
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
	
	public void typeUsername(String username) {
		usernameInput.type(username);
	}
	public void typePassword(String password) {
		passwordInput.type(password);
	}
	public void clickLogin() {
		loginButton.click();
	}
	
	public void getUsername() {
		userNameLink.getTextValue();
	}
	public void clickUserNameLink() {
		userNameLink.click();
	}
}
