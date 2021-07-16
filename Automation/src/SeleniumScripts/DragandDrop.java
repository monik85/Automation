package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
  WebDriver driver = new ChromeDriver();
          
          driver.navigate().to("https://www.w3schools.com/html/html5_draganddrop.asp");
          
          //Maximize the Browser
        driver.manage().window().maximize();
        
        WebElement Source = driver.findElement(By.id("drag1"));
        
        WebElement Destination = driver.findElement(By.id("div2"));		
        
        Actions act = new Actions(driver);
        
         act.clickAndHold(Source).moveToElement(Destination).release(Destination).build().perform();
      //  dragndrop.perform(); 
        
        
       // act.dragAndDrop(Source, Destination).build().perform();
        
      

	}

}
