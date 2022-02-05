package com.projectselenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Miniproject1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login'] "));
		signin.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("gksvijay6@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Vijay@1996");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();	
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		
		WebElement evngdrs = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
		act.click(evngdrs).build().perform();
		
		WebElement drs = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		act.click(drs).build().perform();
		driver.switchTo().frame(0);
		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		cart.click();
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		checkout.click();
		
		WebElement PTC1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		PTC1.click();
		
		WebElement PTC2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		PTC2.click();
		WebElement clickbox = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		clickbox.click();
		WebElement PTC3 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		PTC3.click();
		WebElement PTP = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
		PTP.click();
		WebElement placeorder = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		placeorder.click();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        File dest =new File("C:\\Users\\Public\\selinium greens\\screenshot\\pic2.png");
        FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
		
		
	}

}
