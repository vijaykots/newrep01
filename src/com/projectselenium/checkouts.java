package com.projectselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkouts {
public static WebDriver driver;
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
		private WebElement procced_to_checkout;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement procced_to_checkout2;
	
	@FindBy(xpath = "//*[@id=\"cgv\"]")
	private WebElement terms;
	
	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
	private WebElement procced_to_checkout3;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	private WebElement procced_to_checkout4;

	public checkouts(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getProcced_to_checkout() {
		return procced_to_checkout;
	}

	public WebElement getProcced_to_checkout2() {
		return procced_to_checkout2;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getProcced_to_checkout3() {
		return procced_to_checkout3;
	}

	public WebElement getProcced_to_checkout4() {
		return procced_to_checkout4;
	}


	

	
	
}
