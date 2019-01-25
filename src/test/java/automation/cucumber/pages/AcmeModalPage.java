package automation.cucumber.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AcmeModalPage extends BasePageObject {
	
	//Edit Modal
	@FindBy(css = "username") WebElementFacade editNameInput;
	@FindBy(css = "username") WebElementFacade editEmailInput;
	@FindBy(css = "username") WebElementFacade editPhoneInput;
	@FindBy(css = "username") WebElementFacade editAddressInput;
	@FindBy(css = "username") WebElementFacade editSubmitButton;
	@FindBy(css = "username") WebElementFacade editCancelButton;

	public void typeName(String name) {
		editNameInput.type(name);
	}
	
	public void typeEmail(String email) {
		editEmailInput.type(email);
	}
	
	public void editPhone(String pnumber) {
		editPhoneInput.type(pnumber);
	}
	
	public void typeAddress(String address) {
		editAddressInput.type(address);
	}
	
	public void clickSubmit() {
		editSubmitButton.click();
	}
	
	public void clickCancel() {
		editCancelButton.click();
	}
}
