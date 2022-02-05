package com.projectselenium;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {
	public static WebDriver driver;

	public Pageobjectmanager(WebDriver driver2) {
		this.driver= driver2;
	}

	public signinpage getsigninpage() {
	signinpage sp = new signinpage(driver);
	return sp;
	}
	
	public loginpage getloginpage() {
	loginpage lp = new loginpage(driver);
	return lp;
	}
	
	public Dresses getDresses() {
	Dresses drs = new Dresses(driver);
	return drs;
	}
	
	public checkouts getcheckouts() {
	checkouts chk = new checkouts(driver);
	return chk;
	}
	
	public Placeorder getPlaceorder() {
	Placeorder ord = new Placeorder(driver);
	return ord;
	}
}

