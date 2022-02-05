package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selday1 {

	public static void main(String[] args)throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Email = driver.findElement(By.id("email"));
		Email .sendKeys("gksvijay6@gmail.co");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("vijay123");
		WebElement login = driver.findElement(By.id("u_0_d_Qt"));
		login.click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs (OutputType.FILE);
				 File dest =new File("C:\\Users\\Public\\selinium greens\\screenshot\\pic2.png");
				FileUtils.copyDirectory(src1, dest);
				
				
				
				//File src =ts.getScreenshotAs(OutputType.FILE);
        //File dest =new File("C:\\Users\\Public\\selinium greens\\screenshot\\pic1.png");
        //FileUtils.copyFile(src, dest);
        
		
	}

}

	
	


