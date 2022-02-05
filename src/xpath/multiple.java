package xpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class multiple {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\selinium greens\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		 WebElement multipledropdown = driver.findElement(By.xpath("(//select[@class='spTextField'])[1]"));
	       Select multi = new Select(multipledropdown);
	       boolean multiple = multi.isMultiple();
	       System.out.println("multiple");
	       
 List<WebElement> options = multi.getOptions();
 for (WebElement alloptions : options) {
	 String text = alloptions.getText();
	 System.out.println(text);
 }
	

	       
	       multi.selectByIndex(0);
	       multi.deselectByValue("msmanual");
	       multi.deselectByVisibleText("Agile Methodology");
	       multi.deselectByVisibleText("Selenium");
	       
	       System.out.println("*selected*");
	       List<WebElement> allselectedoptions = multi.getAllSelectedOptions();
	       for (WebElement allselected : allselectedoptions) {
	    	   String text = allselected.getText();
	    	   System.out.println(text);
	       List<WebElement> options2 = multi.getOptions();
	       for (WebElement webElement : allselectedoptions) {
			
		}
	      
	}
	       
	       
	} 

	

}
