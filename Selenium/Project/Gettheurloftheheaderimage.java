package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettheurloftheheaderimage {

	 public static void main(String[] args) {

	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	        //Open the browser
	        driver.get("http://alchemy.hguy.co/crm");
	
	        String link = driver.findElement(By.tagName("img")).getAttribute("src");
	        System.out.println(link);

	        
	        //Close the browser
	        driver.close();
	    	
	       
	}
}
