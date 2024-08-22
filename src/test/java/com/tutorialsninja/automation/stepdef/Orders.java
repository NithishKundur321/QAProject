package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders 
{
	
	HeadersSection headersection = new HeadersSection();
	LoginPage loginpage = new LoginPage();
	SearchResultsPage searchresult = new SearchResultsPage();
	ShoppingCartPage shoppingcart = new ShoppingCartPage();
	
	
	@Given("^I Login to the Application$")
	public void i_Login_to_the_Application()
	{
		Browser.openApplicationURL();
		HeadersSection.navigateToLoginPage();
		LoginPage.dologin();
		
		
		
		
	   
	}

	@When("^I Add a product to check$")
	public void i_Add_a_product_to_check()
	{
		HeadersSection.searchProduct();
		SearchResultsPage.addFirstProductinthesearchresultToCart();
		HeadersSection.navigatetoshoppingcartpage();
		ShoppingCartPage.navigateToCheckoutPage();
	    
	}

	@And("^I place an order$")
	public void i_place_an_order() 
	{
	   
	}

	@Then("^I Should see the order is successfully placed$")
	public void i_Should_see_the_order_is_successfully_placed()  
	{
	   
	}

}
