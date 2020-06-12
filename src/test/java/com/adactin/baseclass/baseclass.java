package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass {

	 public static WebDriver driver;
		
		public static WebDriver browserLaunch(String browsername)
		{
			if(browsername.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ss\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver1.exe");
				driver = new ChromeDriver();
			}else if (browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\ss\\eclipse-workspace\\Selenium_Concepts\\Driver\\IEDriverServer.exe");
				}
			{
				System.out.println("invalid browsername");
			}
			return driver;
		}
public static WebDriver closebrowser(String geturl)
		{
			driver.close();
			return driver;
		}
 public static void driver() 
	 {
		driver.manage().window().maximize();
	 }
public static void getUrl(String Url) 
{
	driver.get(Url);
}
public WebElement getText(By selector) {
	try {
		return driver.findElement(selector);
	} catch (Exception e) {
	System.out.println(String.format("selector does not exists", selector));
	}
	return null;
}
public static String GetTitle() throws Exception
{
	try {
		System.out.println(String.format("The title of the page is", driver.getTitle()));
		return driver.getTitle();
}
	 catch (Exception e) {
	throw new Exception(String.format("The current page title", driver.getTitle()));
}}
public static void getAttribute(String Attribute)
{
	driver.get(Attribute);
}
public static void implicitwait() {
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
public static void explicitwait() {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='save'")));
}
public static void Closeapplication()
{
	driver.close();
}
public static void Quiteapplicatio()
{
	driver.quit();
}
public static void WindowsHandle()
{
	driver.getWindowHandle();
	driver.getWindowHandles();
}
public static void inputValuestoWebelement(WebElement element, String value) {
	try {
		waitforElementVisiblity(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element))
		{
			element.sendKeys(value);
		}
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}
	}
public static void capturescreenshot(WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	File desfile = new File("C:\\Users\\ss\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\test.png");
	FileUtils.copyFile(srcfile, desfile);
	}
public static void clickonWebElement(WebElement element) {
	try {
		waitforElementVisiblity(element);
		if(elementIsDisplayed(element)){
			element.click();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}} 
public static boolean elementIsEnabled(WebElement element) {
	try {
		boolean enabled = element.isEnabled();
		return enabled;
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}
}
public static void waitforElementVisiblity(WebElement element) {
	try {
		WebDriverWait wb = new WebDriverWait(driver, 60);
		wb.until(ExpectedConditions.visibilityOf(element));
		
	} catch (Exception e) {
		e.printStackTrace();
	}}
public static void sendkeys (WebElement element, String value) {
	try {
		waitforElementVisiblity(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element))
		
		{
			element.sendKeys(value);
		}
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}}
public static boolean elementIsDisplayed(WebElement element) {
	try {
		boolean displayed = element.isDisplayed();
		return displayed;
	} catch ( Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}}
public static void selectDropDownOption(WebElement element , String option , String value) {
	try {
		waitforElementVisiblity(element);
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
			
		}else if (option.equalsIgnoreCase("visibletext")) {
			s.deselectByVisibleText(value);
			
		} else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}}
	catch (NumberFormatException e) {
		e.printStackTrace();
	}}
public static void SimpleAlert(WebElement element) {
	try {
		waitforElementVisiblity(element);
		Alert SimpleAlert = driver.switchTo().alert();
		SimpleAlert.accept();
	    driver.switchTo().defaultContent();
			} 
	catch ( Exception e) {
		e.printStackTrace();
	}}
public static void ConfirmAlert(WebElement element,String condition) {
	try {
		waitforElementVisiblity(element);
		Alert ConfirmAlert = driver.switchTo().alert();
		 if (condition.equalsIgnoreCase("accept")) {
			 ConfirmAlert.accept();
			 driver.switchTo().defaultContent();
			
		}else if (condition.equalsIgnoreCase("dismiss")) {
			ConfirmAlert.dismiss();
			driver.switchTo().defaultContent();
		}
	} catch ( Exception e) {
		e.printStackTrace();
	}}
public static void PromptAlert(WebElement element,String condition, String keysToSend) {
	try {
		waitforElementVisiblity(element);
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.sendKeys(keysToSend);
		 if (condition.equalsIgnoreCase("accept")) {
			 PromptAlert.accept();
			 driver.switchTo().defaultContent();
			
		}else if (condition.equalsIgnoreCase("dismiss")) {
			PromptAlert.dismiss();
			driver.switchTo().defaultContent();
		}
	} catch ( Exception e) {
		e.printStackTrace();
	}}
public static void switchToFrameUsingId(String option, WebElement element) {
	try {
		if(option.equals("element")){
			driver.switchTo().frame(element);
		}}
		catch ( Exception e) {
		e.printStackTrace();
	}}
public static void switchToFrameUsingName(String option, String framename) {
try {
	if (option.equals("name")) {
		driver.switchTo().frame(framename);
	}
} catch ( Exception e) {
	e.printStackTrace();
}}
public static void switchToFrameUsingElement(String option, WebElement element) {
try {
	if (option.equals("element")) {
		driver.switchTo().frame(element);
	}
} catch ( Exception e) {
	e.printStackTrace();
}}
public static void mouseHoverToElement(WebElement element)
{
	try {
	waitforElementVisiblity(element);
	Actions ac = new Actions(driver);
	ac.moveToElement(element).build().perform();
} catch (Exception e) {
	e.printStackTrace();
}}
public static void SearchFunctionality(WebElement element) {
	try {
		waitforElementVisiblity(element);
		Actions ac = new Actions(driver);
		ac.perform();
	} catch (Exception e) {
		e.printStackTrace();
	}}
public static void ScrollDown(WebDriver driver) {
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("window.scrollby(0,2000)", "");
	}
public static void Navigate(String url) {
	 driver.navigate().to(url);
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
} 
public static boolean isMultiple() {
	try {
		return true;
	} catch (Exception e) {
		return false;
	}}
}



