package com.adactin.runner;

import java.io.IOException;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.adactin.baseclass.baseclass;
import com.adactin.utility.ConfigurationReader;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature",
                 glue="com\\adactin\\stepdefinition",
                 
                 plugin= {"html:Report\\CucumberReport",
                		 "com.cucumber.listener.ExtentCucumberFormatter:Report\\extendReport.html"})

public class Runner1 extends baseclass{
	public static WebDriver driver;
	
@BeforeClass
public static void browseropen() throws IOException {
	ConfigurationReader cr = new ConfigurationReader();
	String getbrowser=cr.getbrowsername();
	driver=browserLaunch(getbrowser);
}
@AfterClass
public static void url() throws IOException {
	ConfigurationReader cr = new ConfigurationReader();
	String geturl=cr.getUrl();
	driver=closebrowser(geturl);
}
}
