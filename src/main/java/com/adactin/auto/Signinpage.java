package com.adactin.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {

	
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private  WebElement name;
	
	@FindBy(id = "password")
	private WebElement passwd;
	
	@FindBy(id = "login")
	private WebElement submit;
	
	public Signinpage(WebDriver ldriver)
	{
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
}


	public WebElement getUsername() {
		return name;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	
	
	
	
}
