package com.mulitipledropdown;


import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiplewindowsdemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
	    WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	    Actions sel = new Actions(driver);
	    sel.contextClick(women).build().perform();
	    
	   
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    
	    WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	    sel.contextClick(dresses).build().perform();
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    
	    WebElement Tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
	   
	    sel.contextClick(Tshirt).build().perform();
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	   
	    
	   
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> li = new ArrayList<String>();
	    
	    li.addAll(windowHandles);
	    
		driver.switchTo().window(li.get(3));	

	}

}
