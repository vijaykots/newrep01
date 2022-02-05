package com.projectselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Placeorder {
public static WebDriver driver;
    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    private WebElement placeord;

	public Placeorder(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getPlaceord() {
		return placeord;
	}
}
