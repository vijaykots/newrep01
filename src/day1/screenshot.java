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

public class screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys("gksvijay");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("pass");
        
      
        
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        File dest =new File("C:\\Users\\Public\\selinium greens\\screenshot\\pic2.png");
        FileUtils.copyFile(src, dest);
        
        
        //driver.navigate().to("https://www.twitter.com");        
        //driver.navigate().back();
        //driver.navigate().forward();
        //String title = driver.getTitle();
        //System.out.println("gettitle");
        //String currenturl = driver.getCurrentUrl();
        //System.out.println("currenturl");
        
        
        
        
		}

	private static int required(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	}


