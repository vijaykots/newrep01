package com.projectselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
public static WebDriver driver;
	//get browser
	public static WebDriver getbrowser(String browsername) {
		if(browsername.equalsIgnoreCase("Chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		 else if(browsername.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Public\\selinium greens\\Driver\\geckodriver.exe");
			 driver = new FirefoxDriver(); 
		 }
         driver.manage().window().maximize(); 
         return driver;
	}
	
    //get url
	public static void geturl(String url) {
		driver.get(url);
	}
	
	//Quit
	public static void quit() {
		driver.quit();
	}
	
	//Close
	public static void close() {
	driver.close();
	}
	//navigateto
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	//navigateback
	public static void navigateback() {
		driver.navigate().back();
	}
	//navigaterefresh
		public static void navigaterefresh() {
			driver.navigate().refresh();
		}
		//navigateforward
		public static void navigateforward() {
	     driver.navigate().forward();
		}
		//gettitle
		public static void gettitle() {
		String title = driver.getTitle();
	    System.out.println(title);
		}
	    //getcurrenturl
		public static void getcurrenturl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}
		//sendkeys
		public static void sendkeysinput(WebElement element, String input) {
			element.sendKeys(input);
		}
		//click
		public static void click(WebElement element) {
			element.click();
		}
	    //isenabled
		public static void isenabled(WebElement element) {
	    boolean enabled = element.isEnabled();
	    System.out.println(enabled);
		}
	    //isdisplayed
		public static void isdisplayed(WebElement element) {
	    boolean displayed = element.isDisplayed();
	    System.out.println(displayed);
		}
	    //isselected
		public static void isselected(WebElement element) {
	    boolean selected = element.isSelected();
	    System.out.println(selected);
		}
		//gettext
		public static void gettext(WebElement element) {
		String text = element.getText();
        System.out.println(text);
		}
		//takescreenshot
		public static void takescreenshot(String location ) throws IOException {
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File src =ts.getScreenshotAs(OutputType.FILE);
	        File dest =new File("location");
	        FileUtils.copyFile(src, dest);
		}
		//aatributename_attributevalue		
		public static void attributename(String name) {
		
		}
		
		
		//alert
		public static void alert(String options){
		if(options.equalsIgnoreCase("ok")) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}
		else if	(options.equalsIgnoreCase("cancel")) {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		}
		//scroll
		public static void scroll(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView();", element);
		
		}
		
		//Actions 
		public static void actions (WebElement element, String options) {
		Actions act = new Actions(driver);
		if(options.equalsIgnoreCase("move")) {
		act.moveToElement(element).build().perform();
		}
		else if(options.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		}
		else if(options.equalsIgnoreCase("contextclick")) {
			act.contextClick(element).build().perform();
		}
		}
		
		//singledropdown
		public static void singledropdown(WebElement element,String options, String value) {
			Select s = new Select(element);
			
			if(options.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}
			else if (options.equalsIgnoreCase("value")) {
				s.deselectByValue(value);
			}
			else if (options.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
