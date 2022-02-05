package com.mulitipledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
        driver.manage().window().maximize();
        
        
        WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(women).build().perform();
        
        WebElement dresses = driver.findElement(By.xpath("//a[@title='Dresses'][2]"));
        Thread.sleep(2000);
        Actions act2 = new Actions(driver);
        act2.moveToElement(dresses).build().perform();
        
        
        
        
        
        
	}

}
