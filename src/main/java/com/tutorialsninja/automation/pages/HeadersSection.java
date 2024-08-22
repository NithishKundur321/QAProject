package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection 
{
	public HeadersSection()
	{
		PageFactory.initElements(Base.driver,this);
		
	}
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myaccountlink;
	
	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	@FindBy(name="search")
	public static WebElement searchboxfeild;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement viewshoppingcart;
	
	
	public static void navigateToLoginPage()
	{
		Elements.click(HeadersSection.myaccountlink);
		Elements.click(HeadersSection.login);
	}
	
	public static void searchProduct()
	{
		Elements.TypeText(HeadersSection.searchboxfeild,Base.reader.getProduct());
		Elements.click(HeadersSection.searchbutton);
	}
	
	public static void navigatetoshoppingcartpage()
	{
		Elements.click(HeadersSection.viewshoppingcart);
	}
	
	
	
	
	
	

}
