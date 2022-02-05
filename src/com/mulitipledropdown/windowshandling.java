package com.mulitipledropdown;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowshandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 WebDriver driver =  new ChromeDriver();
         
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         WebElement bestsellers = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
     	
     	Actions act = new Actions(driver);
     	
     	act.contextClick(bestsellers).build().perform();
     	
     	Robot r = new Robot();
     	
     	
     	
     	r.keyPress(KeyEvent.VK_DOWN);
     	r.keyRelease(KeyEvent.VK_DOWN);
     	
     	r.keyPress(KeyEvent.VK_ENTER);
		
		

	}

}
