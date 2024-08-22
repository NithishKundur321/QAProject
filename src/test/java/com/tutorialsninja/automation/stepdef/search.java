package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;


import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class search 
{
	HeadersSection headerSection = new HeadersSection();
	SearchResultsPage searchresult = new SearchResultsPage();
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product)  
	{
	    Elements.TypeText(HeadersSection.searchboxfeild, product);
	    Elements.click(HeadersSection.searchbutton);
	}

	@Then("^I should see the product in search results$")
	public void i_should_see_the_product_in_search_results()  
	{
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.samsungsyncmaster));
	    
	}
	@Then("^I should see the message informing \"([^\"]*)\"$")
	public void i_should_see_the_message_informing(String message) 
	{
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultsPage.noresultMessage,message));
	   
	}

	
	
	

}
