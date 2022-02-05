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

public class Miniprojectconvert extends Base_Class{
public static WebDriver driver = Base_Class.getbrowser("chrome");
	public static void main(String[] args) throws IOException, InterruptedException {
		
		signinpage sp = new signinpage(driver);
		loginpage lp = new loginpage(driver);
		Dresses drs = new Dresses(driver);
		checkouts chk = new checkouts(driver);
		Placeorder ord = new Placeorder(driver);
		
		geturl("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		click(sp.getSignin());
		sendkeysinput(lp.getEmail(), "gksvijay6@gmail.com");
		sendkeysinput(lp.getPassword(), "Vijay@1996");
		click(lp.getLogin());
		actions(drs.getWomen(), "move");
		actions(drs.getEvngdrs(), "click");
		actions(drs.getDresses(), "click");
		driver.switchTo().frame(0);
		click(drs.getCart());
		driver.switchTo().defaultContent();
		click(drs.getCheckout());
		click(chk.getProcced_to_checkout());
		click(chk.getProcced_to_checkout2());
		click(chk.getTerms());
		click(chk.getProcced_to_checkout3());
		click(chk.getProcced_to_checkout4());
		click(ord.getPlaceord());
		takescreenshot("C:\\Users\\Public\\selinium greens\\screenshot\\pic2.png");
		
	}
}
		
		
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("gksvijay6@gmail.com");
		
		//WebElement password = driver.findElement(By.id("passwd"));
		//password.sendKeys("Vijay@1996");
		
		//WebElement login = driver.findElement(By.id("SubmitLogin"));
		//login.click();	
		
		//WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		//Actions act = new Actions(driver);
		//act.moveToElement(women).build().perform();
		
		//WebElement evngdrs = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
		//act.click(evngdrs).build().perform();
		
		//WebElement drs = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		//act.click(drs).build().perform();
		//driver.switchTo().frame(0);
		
		//WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		//cart.click();
		
		
		//driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		//WebElement checkout = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		//checkout.click();
		
		//WebElement PTC1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		//PTC1.click();
		
		//WebElement PTC2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		//PTC2.click();
		//WebElement clickbox = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		//clickbox.click();
		//WebElement PTC3 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		//PTC3.click();
		//WebElement PTP = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
		//PTP.click();
		//WebElement placeorder = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		//placeorder.click();
        //TakesScreenshot ts = (TakesScreenshot)driver;
        //File src =ts.getScreenshotAs(OutputType.FILE);
        //File dest =new File("C:\\Users\\Public\\selinium greens\\screenshot\\pic2.png");
        //FileUtils.copyFile(src, dest);
		
		//*[@id="cgv"]
		
		
		
		
		
		
		
		
	



