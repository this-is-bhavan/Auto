package com.adactin.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectpage {
	
	public static WebDriver driver;
	
@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
@FindBy(id="continue")
private WebElement proceed;

public Selectpage (WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
public  WebDriver getDriver() {
	return driver;
}
public WebElement getradiobutton() {
	return radiobutton_0;
}
public WebElement getcontinue() {
	return proceed;
	
}
}
