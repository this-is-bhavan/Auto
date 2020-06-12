package com.adactin.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchpage {

public static WebDriver driver;
	
@FindBy(id = "location")
   private WebElement location;
@FindBy(id="hotels")
   private WebElement hotel;
@FindBy(id="room_type")
   private WebElement room;
@FindBy(id = "roomnos")
   private WebElement roomnos;
@FindBy(id="datepick_in")
private WebElement checkin;
@FindBy(id="datepick_out")
private WebElement checkout;
@FindBy(id="adult_room")
private WebElement adultroom;
@FindBy(id="|child_room")
private WebElement childroom;
@FindBy(id="Submit")
private WebElement Submit;

public Searchpage (WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
public static WebDriver getDriver()
{
return driver;
}

public WebElement getlocation() 
{
	String input="New York";
	Select sc = new Select(this.location);
	sc.selectByVisibleText(input);
	return location;
	}
public WebElement gethotel() {
	String input1="Hotel Sunshine";
	Select sc = new Select(this.hotel);
	sc.selectByVisibleText(input1);
	return hotel;
	}
public WebElement getroom() {
	String input2="Standard";
	Select sc = new Select(this.room);
	sc.selectByVisibleText(input2);
	return room;
	}
public WebElement getroomnos() {
	String input3="room_nos";
	Select sc = new Select(this.roomnos);
	sc.selectByVisibleText(input3);
	return roomnos;
	}
public WebElement getcheckin() {
	return checkin;
	}
public WebElement getcheckout() {
	return checkout;
	}
public WebElement getadultroom() {
String input4="2";
Select sc = new Select(this.adultroom);
sc.selectByVisibleText(input4);
return adultroom;
}
public WebElement getchildroom() {
	String input5="0";
	Select sc = new Select(this.childroom);
	sc.selectByVisibleText(input5);
	return childroom;
}
public WebElement getSubmit() {
	return Submit;
	}
}


