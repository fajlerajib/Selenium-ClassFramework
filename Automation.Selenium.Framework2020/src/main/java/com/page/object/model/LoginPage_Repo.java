package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Repo {  // Concept of Encapsulation  // Page factory or Page object model
	 
	public LoginPage_Repo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//*[@title='Log in to your customer account']")
	private WebElement signin;
	@FindBy(xpath = "//*[@id='email']")
	private WebElement email;
	@FindBy(xpath ="//*[@id='passwd']")
	private WebElement pass;
	@FindBy(xpath = "//*[@id='SubmitLogin']")
	private WebElement login;
	
	
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	

}
