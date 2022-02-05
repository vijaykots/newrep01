package com.projectselenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Pomanagerdemo extends Base_Class{
public static WebDriver driver = Base_Class.getbrowser("chrome");
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Pageobjectmanager pom = new Pageobjectmanager(driver);
		
		geturl("http://automationpractice.com/index.php?id_category=3&controller=category");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		click(pom.getsigninpage().getSignin());
		sendkeysinput(pom.getloginpage().getEmail(), "gksvijay6@gmail.com");
		sendkeysinput(pom.getloginpage().getPassword(), "Vijay@1996");
		click(pom.getloginpage().getLogin());
		actions(pom.getDresses().getWomen(), "move");
		actions(pom.getDresses().getEvngdrs(), "click");
		actions(pom.getDresses().getDresses(), "click");
		driver.switchTo().frame(0);
		click(pom.getDresses().getCart());
		driver.switchTo().defaultContent();
		click(pom.getDresses().getCheckout());
		click(pom.getcheckouts().getProcced_to_checkout());
		click(pom.getcheckouts().getProcced_to_checkout2());
		click(pom.getcheckouts().getTerms());
		click(pom.getcheckouts().getProcced_to_checkout3());
		click(pom.getcheckouts().getProcced_to_checkout4());
		click(pom.getPlaceorder().getPlaceord());
		takescreenshot("C:\\Users\\Public\\selinium greens\\Screenshot1\\pic2.png");
		
	}


	
}
