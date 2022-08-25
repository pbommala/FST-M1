package CRM_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity6 {
	 public static void main(String[] args) throws InterruptedException {

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

	        //Click login
	        driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
	        
    //Printing the phone number from message box
    WebElement menu = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
    menu.click();
    WebElement menu1 = driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']"));
    menu1.click();
    try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    WebElement icon = driver.findElement(By.xpath("//span[@title='Additional Details']"));
    icon.click();
    Thread.sleep(10000);
    String message = driver.findElement(By.xpath("//span[@class='phone']")).getText();
    System.out.println("Phone number is :" + message);

	 }
}
