package com.mulitipledropdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwaitconcept {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/shop/men-tshirts");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	List<WebElement> prices = driver.findElements
			(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
	List<Integer> listpar = new ArrayList<Integer>();
	for (WebElement allprices : prices) {
		//String text = allprices.getText();
		//System.out.println(text);
		String replace1 = allprices.getText().replace("Rs. ", "");
		System.out.println(replace1);
		int parseInt = Integer.parseInt(replace1);
		System.out.println(parseInt);
		//*[@id="desktopSearchResults"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]
		//span[@class='product-strike']//preceding-sibling::span
		
		listpar.add(parseInt);
	}
	System.out.println("***MAX***");
	System.out.println(Collections.max(listpar));
	System.out.println("***MIN***");
	System.out.println(Collections.min(listpar));
	}

}
