package com.mulitipledropdown;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miniproject  {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login'] "));
		signin.click();
		
		
		WebElement emailaddress = driver.findElement(By.xpath("(//input[@type='text'])[2] "));
		emailaddress.sendKeys("gksvijay6@gmail.com");
		
		
		WebElement createaccount = driver.findElement(By.id("SubmitCreate"));
		createaccount.click();
		
		WebElement mr = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		mr.click();
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("vijay");
		
		
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("k");
		
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Vijay@1996");
		
		
		WebElement day = driver.findElement(By.xpath("//select[@name='days']"));
		day.click();
		WebElement day1 = driver.findElement(By.xpath("//option[@value='6']"));
		day1.click();
		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		month.click();
		WebElement month1 = driver.findElement(By.xpath("(//option[@value='2'])[2]"));
		month1.click();
		WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
		year.click();
		WebElement year1 = driver.findElement(By.xpath("//option[@value='1996']"));
		year1.click();
		
		
		WebElement fn1 = driver.findElement(By.id("firstname"));
		fn1.sendKeys("vijay");
		
		WebElement l1 = driver.findElement(By.id("lastname"));
		l1.sendKeys("k");
		
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("enterprise");
		
		WebElement  address = driver.findElement(By.id("address1"));
		address.sendKeys("4 street SWISS TOWN");
		
		
		WebElement  city = driver.findElement(By.id("city"));
		city.sendKeys("USA");
		
		
		WebElement  state = driver.findElement(By.id("id_state"));
		state.click();
		WebElement sel = driver.findElement(By.xpath("(//option[@value='10'])[3]"));
		sel.click();
		
		WebElement  postalcode = driver.findElement(By.id("postcode"));
		postalcode.sendKeys("30004");
		
		
		WebElement  country = driver.findElement(By.id("id_country"));
		country.click();
		WebElement sel1 = driver.findElement(By.xpath("(//option[@value='21'])[3]"));
		sel1.click();
		
		WebElement  phonenum = driver.findElement(By.id("phone_mobile"));
		phonenum.sendKeys("0679765754");
		
		
		WebElement  alias = driver.findElement(By.id("alias"));
		alias.sendKeys("  welcome to page");
		
		WebElement  register = driver.findElement(By.id("submitAccount"));
		register.click();
	}

}
