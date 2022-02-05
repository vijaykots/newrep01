package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
                WebDriver driver =  new ChromeDriver();
                
                driver.get("http://demo.automationtesting.in/Frames.html");
                driver.manage().window().maximize();
                
                WebElement singleframe1 = driver.findElement(By.id("singleframe"));
                driver.switchTo().frame(singleframe1);
                
                WebElement singleframe2 = driver.findElement(By.xpath("//input[@type='text'][1]"));
                singleframe2.sendKeys("selenium");
                
                Thread.sleep(3000);
                
                
                driver.switchTo().defaultContent();
                WebElement btn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
                btn.click();
                
                WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
               driver.switchTo().frame(outer);
                
                
                WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
                driver.switchTo().frame(inner);
             
                WebElement btn1= driver.findElement(By.xpath("//input[@type='text'][1]"));
                btn1.sendKeys("integer");
                
                
                //"(//input[@type='text'])[1]"
                //WebElement video = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][1]"));
                //video.click();
                
                //http://demo.automationtesting.in/Frames.html
                //System.getProperty("User.dir")+"\\Driver\\chromedriver.exe"
                
                
                
                
                
                
	}

}
