package com.adactin.stepdefnition;

import org.openqa.selenium.WebDriver;

import com.adactin.auto.Bookingpage;
import com.adactin.auto.Logoutpage;
import com.adactin.auto.Searchpage;
import com.adactin.auto.Selectpage;
import com.adactin.auto.Signinpage;
import com.adactin.baseclass.baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefnition extends baseclass {
	private static final String value = null;
	public static WebDriver driver;
	@Given("^user launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		driver=browserLaunch("chrome");
        getUrl("http://adactinhotelapp.com/");
	}
@When
	("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		Signinpage sp = new Signinpage(driver);
		inputValuestoWebelement(sp.getUsername(),"PavithraN");
}
@When("^User enter the valid Password$")
	public void user_enter_the_valid_Password() throws Throwable {
		Signinpage sp = new Signinpage(driver);
		inputValuestoWebelement(sp.getPasswd(),"Pavi@2426");
	}
@When("^User enter the login Button$")
	public void user_enter_the_login_Button() throws Throwable {
		Signinpage sp = new Signinpage(driver);
		clickonWebElement(sp.getSubmit());
	   	}
@Then("^It lands to the homepage sucessfully$")
	public void it_lands_to_the_homepage_successfully() throws Throwable {
	   System.out.println("Sucessfully logged in");
	}
@Given("^User selects the location$")
public void user_selects_the_location() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	selectDropDownOption(sc.getlocation(), value, "New York");
	}
@Given("^User selects the hotel$")
public void user_selects_the_hotel() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	selectDropDownOption(sc.gethotel(), value, "Hotel Sunshine");
	}
@Given("^User selects the roomtype$")
public void user_selects_the_roomtype() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	selectDropDownOption(sc.getroom(), value, "Standard");
	}
@Given("^User selects the no of rooms$")
public void user_selects_the_no_of_rooms() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	selectDropDownOption(sc.getroomnos(), value, "roomnos");
	}
@Given("^User selects the checkin date$")
public void user_selects_the_checkin_date() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	inputValuestoWebelement(sc.getcheckin(), "24/05/2020");	  
	}
@Given("^User selects the checkout date$")
public void user_selects_the_checkout_date() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	inputValuestoWebelement(sc.getcheckout(), "26/05/2020");
}
@Given("^User selects the adult room$")
public void user_selects_the_adult_room() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	selectDropDownOption(sc.getadultroom(), value, "2");
}
@Given("^User selects the child room$")
public void user_selects_the_child_room() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	selectDropDownOption(sc.getchildroom(), value, "0");
}
@Given("^User entre the submit button$")
public void user_entre_the_submit_button() throws Throwable {
	Searchpage sc = new Searchpage(driver);
	clickonWebElement(sc.getSubmit());
}
@Then("^It lands to the booking page$")
public void it_lands_to_the_booking_page() throws Throwable {
    System.out.println("Search sucessfull");
    }

@When("^User enter the first name$")
public void user_enter_the_first_name() throws Throwable {
Bookingpage bp=new Bookingpage(driver);
inputValuestoWebelement(bp.getfirst_name(), "Mathi");
}

@When("^User enter the last name$")
public void user_enter_the_last_name() throws Throwable {
	Bookingpage bp=new Bookingpage(driver);
	inputValuestoWebelement(bp.getlast_name(),"lalitha");
}

@When("^User enter the address$")
public void user_enter_the_address() throws Throwable {
	Bookingpage bp=new Bookingpage(driver);
	inputValuestoWebelement(bp.getaddress(),"New York,USA");
}

@When("^User enter the card no$")
public void user_enter_the_card_no() throws Throwable {
	Bookingpage bp=new Bookingpage(driver);
	inputValuestoWebelement(bp.getcc_num(),"9236598736559562");   
}

@When("^User enter the card type$")
public void user_enter_the_card_type() throws Throwable {
	Bookingpage bp=new Bookingpage(driver);
	inputValuestoWebelement(bp.getcctype(),"VISA");   
    }

@When("^User enter the card expiry month$")
public void user_enter_the_card_expiry_month() throws Throwable {
	Bookingpage bp=new Bookingpage(driver);
	inputValuestoWebelement(bp.getccexpmonth(),"8");   
}

@When("^User enter the card expiry year$")
public void user_enter_the_card_expiry_year() throws Throwable {
	Bookingpage bp=new Bookingpage(driver);
	inputValuestoWebelement(bp.getccexpyear(),"2022");   
}

@When("^User enter the CCV no$")
public void user_enter_the_CCV_no() throws Throwable {
	Bookingpage bp=new Bookingpage(driver);
	inputValuestoWebelement(bp.getcccvv(),"999");   
}

@When("^User enter the booknow button$")
public void user_enter_the_booknow_button() throws Throwable {
	Bookingpage bp=new Bookingpage(driver);
	clickonWebElement(bp.getbooknow());
	}

@Then("^It land to the conformation page$")
public void it_land_to_the_conformation_page() throws Throwable {
    System.out.println("Hotel booking is completed");
    }

@Given("^User selects the available hotel$")
public void user_selects_the_available_hotel() throws Throwable {
	Selectpage sl = new Selectpage(driver);
    clickonWebElement(sl.getradiobutton());
}

@Given("^User proceeds with the confromation$")
public void user_proceeds_with_the_confromation() throws Throwable {
	Selectpage sl = new Selectpage(driver);
	 clickonWebElement(sl.getcontinue());
	 }

@Then("^Confromation sucessfull$")
public void confromation_sucessfull() throws Throwable {
    System.out.println("Conformation Sucessfull");
}

@Given("^User selects the logout$")
public void user_selects_the_logout() throws Throwable {
	Logoutpage lg = new Logoutpage(driver);
	clickonWebElement(lg.getLogout());
}

@Then("^Logging out sucessfull$")
public void logging_out_sucessfull() throws Throwable {
	System.out.println("Logged out Sucessfully");
}}


