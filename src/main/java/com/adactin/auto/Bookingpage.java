package com.adactin.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Bookingpage {
	public static WebDriver driver;
	
@FindBy(id="first_name")
	private WebElement firstname;
@FindBy(id="last_name")
    private WebElement lastname;
@FindBy(id="address")
    private WebElement address;
@FindBy(id="cc_num")
    private WebElement ccnum;
@FindBy(id="cc_type")
    private WebElement cctype;
@FindBy(id="cc_exp_month")
    private WebElement ccexpmonth;
@FindBy(id="cc_exp_year")
    private WebElement ccexpyear;
@FindBy(id="cc_cvv")
    private WebElement cccvv;
@FindBy(id="book_now")
private WebElement booknow;

public Bookingpage (WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
public  WebDriver getDriver() {
	return driver;
}
public WebElement getfirst_name() {
return firstname;
}
public WebElement getlast_name() {
return lastname;
}
public WebElement getaddress() {
return address;
}
public WebElement getcc_num() {
	return ccnum;
	}
public WebElement getcctype() {
	String ip ="VISA";
	Select sc = new Select(this.cctype);
	sc.selectByVisibleText(ip);
	return cctype;
}
public WebElement getccexpmonth() {
	String ip1 ="8";
	Select sc = new Select(this.ccexpmonth);
	sc.selectByVisibleText(ip1);
	return cctype;
}
public WebElement getccexpyear() {
	String ip2 ="2022";
	Select sc = new Select(this.ccexpyear);
	sc.selectByVisibleText(ip2);
	return cctype;
}
public WebElement getcccvv() {
	String ip3 ="999";
	Select sc = new Select(this.cccvv);
	sc.selectByVisibleText(ip3);
	return cctype;
}
public WebElement getbooknow() {
	return booknow;
	}

}