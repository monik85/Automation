package SeleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception 
	{

		System.out.println("test");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
    // System.setProperty("webdriver.chorme.driver","C:\\Users\\Praveen\\OneDrive\\Desktop\\chorme driver\\chromedriver_win32\\chromedriver.exe");
		
          WebDriver driver = new ChromeDriver();
          driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
          
          
          //Maximize the Browser
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         
         
        
         //JS Alert
         driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]")).click();
         String jsalert = driver.switchTo().alert().getText();
         
         System.out.println(jsalert);
         
         driver.switchTo().alert().accept();
         
        // JS Confirm
         driver.findElement(By.xpath("//*[contains(text(),'Click for JS Confirm')]")).click();
         
         String jsconfirm = driver.switchTo().alert().getText();
         
         System.out.println(jsconfirm);
         driver.switchTo().alert().dismiss();
         
         
         // JS Prompt
         driver.findElement(By.xpath("//*[contains(text(),'Click for JS Prompt')]")).click();
         
         String jsPrompt = driver.switchTo().alert().getText();
         System.out.println(jsPrompt);
          driver.switchTo().alert().sendKeys("Testing Alerts");
          driver.switchTo().alert().accept();
       
         
        // driver.switchTo().alert().sendKeys("Tedsting Alerts");
         
    
	}

}
