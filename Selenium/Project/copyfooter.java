package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class copyfooter {
	 public static void main(String[] args) {

	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	        //Open the browser
	        driver.get("http://alchemy.hguy.co/crm");
	        //copy footer link
	     	String footer = driver.findElement(By.xpath(" //*[@id=\"admin_options\"]")).getText();
	        System.out.println(" footer text is: " + footer);
}
}