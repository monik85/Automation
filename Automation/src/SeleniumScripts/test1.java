package SeleniumScripts;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws Exception
	{
      System.out.println("Test");
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();
     // driver.get("https://www.testandquiz.com/selenium/testing.html");
    
      driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
     //  driver.navigate().to("http://ww12.demoaut.com/");
      System.out.println("Test");      
      
     // maximize the window
      driver.manage().window().maximize();
      Thread.sleep(5000);
     driver.findElement(By.xpath("/html/body/div/div[4]/div/p/a")).sendKeys("This is a link");
      driver.findElement(By.id("fname")).sendKeys("test");
      driver.findElement(By.id("idOfButton")).click();
      
      //Radio button
      driver.findElement(By.xpath("/html/body/div/div[7]/div/p[1]/b")).click();
       driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"female\"]")).click();
       
       //check box
       driver.findElement(By.xpath("/html/body/div/div[8]/div/p[1]/b")).click();
       driver.findElement(By.xpath("/html/body/div/div[8]/div/form/input[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("/html/body/div/div[8]/div/form/input[2]")).click();
      
      //dropdown
      driver.findElement(By.xpath("/html/body/div/div[9]/div/p/b")).click();
      driver.findElement(By.id("testingDropdown")).click();
      driver.findElement(By.id("performance")).click();
      Thread.sleep(3000);
      
   /*   //doubleclick
      driver.findElement(By.xpath("//*[@id=\"dblClkBtn\"]")).click();
      String  ondblclick = driver.switchTo().alert().getText();
      System.out.println("alert");
      driver.switchTo().alert().accept();*/
      
      //alert box
      driver.findElement(By.xpath("//*[contains(text(),'Generate Alert Box')]")).click();
      String generatealertbox = driver.switchTo().alert().getText();
      
      System.out.println("generatealertbox");
      
      driver.switchTo().alert().accept();
      Thread.sleep(3000);
      
      //confirm box
      driver.findElement(By.xpath("//*[contains(text(),'Generate Confirm Box')]")).click();
      String generateconfirmbox = driver.switchTo().alert().getText();
      
      System.out.println("generateconfirmbox");
      
      driver.switchTo().alert().accept();
      Thread.sleep(3000);
      
      //press ok
      driver.findElement(By.id("demo")).sendKeys("press ok");
	}
	

}
