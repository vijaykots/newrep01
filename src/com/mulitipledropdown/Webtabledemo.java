package com.mulitipledropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledemo {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//List<WebElement> build = driver.findElements(By.xpath("//table/thead/tr/th"));
		//List<WebElement> build = driver.findElements(By.xpath("//table/tbody/tr/td"));
		//for (WebElement allbuild : build) {
			//String text = allbuild.getText();
			//System.out.println(text);
		//}
		System.out.println("***column***");
		
		
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement allcolumn : column) {
			String col = allcolumn.getText();
			System.out.println(col);
	
		}
	}
}
