package com.projectselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage {
	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	
	
	public signinpage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}
	

}
