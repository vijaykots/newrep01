package com.mulitipledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Scrolldemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement amazon = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", amazon);
	
	
	//WebElement ph1 = driver.findElement(By.cssSelector("#https://www.album.alexflueras.ro/uploads/images/galleries/6/center.jpg"));
    //JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].scrollIntoView();", "ph1");

	
}
}
