package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
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
	@Then("^I should see an error message informing the User about invalid credentials$")
	public void i_should_see_an_error_message_informing_the_User_about_invalid_credentials()
	{
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainwarning, "Warning: No match for E-Mail Address and/or Password."));
	   
	}
	@When("^I reset the forgotten password for email \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for_email(String email) 
	{
		Elements.click(LoginPage.forgotPassword);
		Elements.TypeText(ForgotPasswordPage.emailfeild, email);
		Elements.click(ForgotPasswordPage.continueButton);
		
	   
	}
	
	@Then("^I should see a message informing the User that information related to resting password have been sent to email address$")
	public void i_should_see_a_message_informing_the_User_that_information_related_to_resting_password_have_been_sent_to_email_address() 
	{
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainwarning, "An email with a confirmation link has been sent your email address."));
	   
	}

	

}
