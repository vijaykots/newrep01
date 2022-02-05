package com.mulitipledropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://fengyuanchen.github.io/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement clc = driver.findElement(By.xpath("(//input[@type='text'])[1] "));
		clc.click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[2]"));
		String text = date.getText();
		System.out.println(text);
        String[] array = text.split(" ");
		String YEAR = array[1];
		String MONTH = array[0];
		System.out.println(YEAR);
		System.out.println(MONTH);
		
		
		while (!(MONTH.equals("febrauary")&&(YEAR.equals("2024")))) {
			WebElement next = driver.findElement(By.xpath("//li[@data-view='month next']"));
			next.click();
			 text = date.getText();
			System.out.println(text);
	         array = text.split(" ");
			 YEAR = array[1];
			 MONTH = array[0];
		}
		
		
		WebElement feb = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[3]"));
		feb.click();
		
		
		
		
		
	}

}
