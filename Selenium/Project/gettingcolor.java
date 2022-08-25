package CRM_Project;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class gettingcolor {

		    public static void main(String[] args) {

		        // Create a new instance of the Firefox driver
		        WebDriver driver = new FirefoxDriver();

		        //Open the browser
		        driver.get("http://alchemy.hguy.co/crm");

		        //Find the page title and print it
		        String pageTitle = driver.getTitle();
		        System.out.println(pageTitle);
	             
		       	String headercolor = driver.findElement(By.xpath("/html/body/div[1]/div[1]")).getCssValue("background-color");
		        System.out.println("The grey button's text is: " + headercolor);

		        //Find the input fields
		        driver.findElement(By.id("user_name")).sendKeys("admin");
		        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		        
		        //copy footer link
		     	String footer = driver.findElement(By.xpath(" //*[@id=\"admin_options\"]")).getText();
		        System.out.println(" footer text is: " + footer);
		        
		        //Click login
		        driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
		                
		        
		        //Find the first header and get it's colour
		        String Header = driver.findElement(By.xpath("//*[@id=\"toolbar\"]")).getText();
		        System.out.println(" navigation menu text is: " + Header);
		        
		        String color  = driver.findElement(By.xpath("//*[@id=\"toolbar\"]")).getCssValue("color");
    	        System.out.println("The header menu color is: " + color);
	      	        
		        
		        //Close the browser
		       
		        driver.close();
		        

		    }

		}


