package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

public static void main(String[] args) throws InterruptedException{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.facebook.com");
		driver.manage().window().maximize();
		//WebElement email = driver.findElement(By.xpath("//input[@class='input text _55r1 _6luy']"));
		//email.sendKeys("gksvijay");
		
			Thread.sleep(2000);
		
		
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("vijay");
		
		WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pass.sendKeys("kaviya");
		
		WebElement login= driver.findElement(By.xpath("//button[@name='login'] "));
		login.click();
			
			
			
			
		
	}

}
