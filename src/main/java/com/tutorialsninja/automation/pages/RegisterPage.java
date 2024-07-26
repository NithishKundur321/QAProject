package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage 
{
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastname;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	

}
