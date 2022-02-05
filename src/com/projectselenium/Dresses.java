package com.projectselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
public static WebDriver driver;
	
     @FindBy(xpath = "//a[@title='Women']")
     private WebElement women;
     
     @FindBy(xpath = "(//a[@title='Evening Dresses'])[1]")
     private WebElement evngdrs;
     
     @FindBy(xpath = "//img[@title='Printed Dress']")
     private WebElement dresses;
     
     @FindBy(xpath = "//span[text()='Add to cart']")
     private WebElement cart;
   
     @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
     private WebElement checkout;
     
	public Dresses(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
			
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getEvngdrs() {
		return evngdrs;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCart() {
		return cart;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
     
}
