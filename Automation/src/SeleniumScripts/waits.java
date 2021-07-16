package SeleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.jfr.Timespan;

public class waits {

	public static void main(String[] args) 
	{
	System.out.println("test");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
    // System.setProperty("webdriver.chorme.driver","C:\\Users\\Praveen\\OneDrive\\Desktop\\chorme driver\\chromedriver_win32\\chromedriver.exe");
		
          WebDriver driver = new ChromeDriver();
          driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
          
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
          
          //Maximize the Browser
         driver.manage().window().maximize();
         
         WebElement btn = driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]"));
        
         
         WebDriverWait waitobj = new WebDriverWait(driver,20);
         waitobj.until((ExpectedConditions.elementToBeClickable(btn)));
         btn.click();
         
         
        
	}

}
