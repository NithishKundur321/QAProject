package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;

import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.*;


public class Login 
{
	HeadersSection headersection = new HeadersSection();
	LoginPage loginpage = new LoginPage();
	@And("^I navigate to account Login Page$")
	public void i_navigate_to_account_Login_Page()
	{
		Elements.click(HeadersSection.myaccountlink);
		Elements.click(HeadersSection.login);
	    
	}

	@When("^I login to the application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_Username_and_Password(String email, String password)  
	{
		LoginPage.dologin(email, password);
	    
	}

	@Then("^I should see that the user is able to login successfully$")
	public void i_should_see_that_the_user_is_able_to_login_successfully()  
	{
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registeraffliateaccount));
	   
	}
	

}
