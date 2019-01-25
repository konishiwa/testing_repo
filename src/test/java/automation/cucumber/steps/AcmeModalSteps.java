package automation.cucumber.steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AcmeModalSteps {

	//Edit Modal
	@FindBy(css = "username") WebElementFacade editNameInput;
	@FindBy(css = "username") WebElementFacade editEmailInput;
	@FindBy(css = "username") WebElementFacade editPhoneInput;
	@FindBy(css = "username") WebElementFacade editAddressInput;
	@FindBy(css = "username") WebElementFacade editSubmitButton;
	@FindBy(css = "username") WebElementFacade editCancelButton;
	
}
