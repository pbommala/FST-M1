package CRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class websitetitle {
	 public static void main(String[] args) {

	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	        //Open the browser
	        driver.get("http://alchemy.hguy.co/crm");

	        //Find the page title and print it
	        String pageTitle = driver.getTitle();
	        System.out.println(pageTitle);
	        //Close the browser
	        driver.quit();

}
}
