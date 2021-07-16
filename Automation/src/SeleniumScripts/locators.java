package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class locators {
	
	public void Testmethod()
	{
		System.out.println("This is Locators method");
		
	}

	public static void main(String[] args) throws Exception {
		
		
		
		
	System.out.println("test");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
  WebDriver driver = new ChromeDriver();
  
  
  
  
  driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");
  
	      
          //Maximize the Browser
        driver.manage().window().maximize();

  
  
          
         // driver.findElement(By.linkText("sign in")).click();
          
         // driver.findElement(By.partialLinkText("create an")).click();
          
         // driver.findElement(By.partialLinkText("previous amendment")).click();
          
         // driver.findElement(By.xpath("/html/body/form/div[3]/input[1]")).sendKeys("Tester");
          driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_username\']")).sendKeys("Tester");
        

          driver.findElement(By.xpath("//input[@name = 'ctl00$MainContent$password']")).sendKeys("test");
      
	   
          driver.findElement(By.name("ctl00$MainContent$login_button")).click();
         
          
          String Title = driver.getTitle();
          if(Title.equalsIgnoreCase("web orders"))
	    {
	    	driver.findElement(By.linkText("Order")).click();
	    	Select se =new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
	    	//se.selectByValue("ScreenSaver");
	    	se.selectByIndex(2);
	    	Thread.sleep(5000);
	    WebElement QuantityTxt=	driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
	    QuantityTxt.clear();
	    
	    QuantityTxt.sendKeys("20");
	    	Thread.sleep(5000);
	   //   driver.findElement(By.xpath("//*[contains(text(),'calculate')]")).click();
	      
	    driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder\']/tbody/tr/td/ol[1]/li[5]/input[2]")).click();	

	  //  driver.findElement(By.xpath("//*[@value=\'Reset\')]")).click();
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();
	    
	   // driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).getText();
	    
	   // driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal")).getAttribute("type");
	    
	    
	    List<WebElement> list =  driver.findElements(By.className("btn_dark"));
	    int count = list.size();	    
	   System.out.println(count);
	 
	    for (WebElement ele : list)
	    {
	    	String btnvalue =ele.getAttribute("value");
	    	System.out.println(btnvalue);
	    	
	    	if(btnvalue.equals("Reset"))
	    	{
	    		ele.click();
	    		
	    	}
	    }
	    
	    }
	    
          else
          {
        	  System.out.println("Login is not Sucess");
        	  
          }
	}
	
	
	  
	
	
}
