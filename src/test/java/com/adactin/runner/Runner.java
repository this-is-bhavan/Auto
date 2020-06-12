package com.adactin.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.adactin.auto.Bookingpage;
import com.adactin.auto.Logoutpage;
import com.adactin.auto.Searchpage;
import com.adactin.auto.Selectpage;
import com.adactin.auto.Signinpage;
import com.adactin.baseclass.baseclass;

public class Runner extends baseclass{

	public static WebDriver driver;
	private String value;
@Test	
	public void sample() {
			driver=browserLaunch("chrome");
	        getUrl("http://adactinhotelapp.com");
	        
	        Signinpage sp = new Signinpage(driver);
	        inputValuestoWebelement(sp.getUsername(),"PavithraN");
	        inputValuestoWebelement(sp.getPasswd(),"Pavi@2426");
	        clickonWebElement(sp.getSubmit());
	        
	        Searchpage sc = new Searchpage(driver);
	        selectDropDownOption(sc.getlocation(), value, "New York");
	        selectDropDownOption(sc.gethotel(), value, "Hotel Sunshine");
	        selectDropDownOption(sc.getroom(), value, "Standard");
	        selectDropDownOption(sc.getroomnos(), value, "roomnos");
	        inputValuestoWebelement(sc.getcheckin(), "24/05/2020");
	        inputValuestoWebelement(sc.getcheckout(), "26/05/2020");
	        selectDropDownOption(sc.getadultroom(), value, "2");
	        selectDropDownOption(sc.getchildroom(), value, "0");
	        clickonWebElement(sc.getSubmit());
	        
	        Selectpage sl = new Selectpage(driver);
	        clickonWebElement(sl.getradiobutton());
	        clickonWebElement(sl.getcontinue());
	        
	        Bookingpage bp = new Bookingpage(driver);
	        inputValuestoWebelement(bp.getfirst_name(), "Mathi");
	        inputValuestoWebelement(bp.getlast_name(), "Lalitha");
	        inputValuestoWebelement(bp.getaddress(), "New York, USA");
	        inputValuestoWebelement(bp.getcc_num(), "9236598736559562");
	        selectDropDownOption(bp.getcctype(), value, "VISA");
	        selectDropDownOption(bp.getccexpmonth(), value, "8");
	        selectDropDownOption(bp.getccexpyear(), value, "2022");
	        inputValuestoWebelement(bp.getcccvv(), "999");
	        clickonWebElement(bp.getbooknow());
	        
	        Logoutpage lg = new Logoutpage(driver);
	        clickonWebElement(lg.getLogout());
	        
	        }}


