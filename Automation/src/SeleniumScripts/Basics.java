package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) throws Exception {
		
		System.out.println("test");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
 
          WebDriver driver = new ChromeDriver();
          driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
          
          //Launch App URL
          ExcelHandling obj = new ExcelHandling();
        //  obj.excelWrite();
          obj.excelReader();
          
          //driver.navigate().to(obj.url);
     
          
          
          
          
        
          
          //Maximize the Browser
         driver.manage().window().maximize();
          Thread.sleep(5000);
          String LoginTitle = driver.getTitle();
          System.out.println("Login Page :"+LoginTitle);
          
          
          driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(obj.username);
          driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(obj.password);
          String HomePageTitle = driver.getTitle();
          System.out.println("Home Page :"+HomePageTitle);
          if(HomePageTitle.equals("Web Orders"))
          {
        	  System.out.println("Login is success");
        	  
          }
          else
          {
        	  System.out.println("Login is unsuccess");
        	  
          }
          
        //  driver.findElement(By.name("ctl00$MainContent$login_button")).click();
          
          // close the Browser
          driver.quit();
          
         // locators obj = new locators();
        //  obj.Testmethod();
          
          
                
          

        
	}
}
