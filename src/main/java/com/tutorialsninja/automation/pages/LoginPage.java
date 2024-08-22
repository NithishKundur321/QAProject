package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage 
{
	public LoginPage()
	{
		PageFactory.initElements(Base.driver,this);
	}
	@FindBy(id="input-email")
	public static WebElement emailfeild;
	
	@FindBy(id="input-password")
	public static WebElement passwordfeild;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement LoginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainwarning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotPassword;
	
	
	public static void dologin(String email,String password)
	{
		Elements.TypeText(LoginPage.emailfeild, email);
		Elements.TypeText(LoginPage.passwordfeild, password);
		Elements.click(LoginPage.LoginButton);
		
	}
	
	public static void dologin()
	{
		Elements.TypeText(LoginPage.emailfeild, Base.reader.getUsername());
		Elements.TypeText(LoginPage.emailfeild, Base.reader.getPassword());
		Elements.click(LoginPage.LoginButton);
	}
	
	
	

}
