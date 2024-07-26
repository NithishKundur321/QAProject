package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeadersSection 
{
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myaccountlink;
	@FindBy(linkText="Register")
	public static WebElement register;
	

}
