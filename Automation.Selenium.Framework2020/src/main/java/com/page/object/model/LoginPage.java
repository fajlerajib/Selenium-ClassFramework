package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {  // Concept : Encapsulation
	
	public LoginPage(WebDriver driver){  // Constractor for Remove null
	
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//*[@class='login']")
	private WebElement SignInBtn;  //  private access modifire and datatype is webelement in selenium (string is java)
	
	public WebElement getSignInBtn(){  // public access modifire and getter method with return type 
		
		return SignInBtn;
	}
	
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement emailinputbox;
	
	public WebElement getemailbox(){
		
		return emailinputbox;
	}
	
	
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement passwordinputbox;
	public WebElement getpasswordinputbox(){
		return passwordinputbox;
		
	}
	
		
	}
	


