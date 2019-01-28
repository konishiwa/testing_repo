package automation.cucumber.steps;

import automation.cucumber.pages.AppLoginPage;
import automation.cucumber.pages.BasePageObject;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class AppLoginSteps {
	
	@Steps
	BasePageObject basePage;
	@Steps
	AppLoginPage page;

	@Step
	public void login(String arg1, String arg2) {
		System.out.println("The username is: " + arg1);
		System.out.println("The password is: " + arg2);
		
		//@pyramidsystems.com
		arg1 = arg1+ "@pyramidsystems.com";
	    page.typeIntoUserNameInput(arg1);
	    page.typeIntoPasswordInput(arg2);
	    page.clickLogin();
	}
	
	@Step
	public void loginSuccess(String arg1) {
		System.out.println("The status is: " + arg1);
	    if (arg1.equalsIgnoreCase("success")) {
	    	Assert.assertTrue(page.getApplicationTitle().equals("Employee Register"));
	    }
	    else {
	    	Assert.assertTrue(page.getAuthTitle().equals("Employee Register"));
	    }
	}
	

	@Step
	public void showResult() {
		page.getNameElement();
	}

	@Step
	public void getProfileResults() {
		System.out.println("This will show the profiles result");
		
	}

	public void editTheirProfile() {
		// TODO Auto-generated method stub
		
	}

	public void willbeUpdated() {
		// TODO Auto-generated method stub
		
	}

	public void checkAttribute(String arg1) {
		// TODO Auto-generated method stub
		
	}


}
