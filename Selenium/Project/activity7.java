package CRM_Project;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity7 {
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
        
	
        Thread.sleep(5000);
        WebElement menu = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
        menu.click();
        WebElement menu1 = driver.findElement(By.xpath("//*[@id=\'moduleTab_9_Accounts\']"));
        menu1.click();
        Thread.sleep(5000);
        int i = 1;
            List<WebElement> columnList = driver.findElements(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody//td[3]"));
            for (WebElement column : columnList) {
                System.out.println("The names are:" + column.getText());
                i+=2;
                if (i == 9)
                    break;

            }
        }

}
