package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsersnavigations {

	public static void main(String[] args) throws Exception
	{
			System.out.println("test");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
	    // System.setProperty("webdriver.chorme.driver","C:\\Users\\Praveen\\OneDrive\\Desktop\\chorme driver\\chromedriver_win32\\chromedriver.exe");
			
	          WebDriver driver = new ChromeDriver();
	          driver.navigate().to("https://www.softwaretestingmaterial.com/software-testing/");
	          
	          //Maximize the Browser
	         driver.manage().window().maximize();
	          Thread.sleep(5000);
	          
	          driver.findElement(By.id("menu-item-6227")).click();
	          
	          
	         // driver.navigate().refresh();
	          
	         driver.navigate().back();
	          
	         driver.navigate().forward();
	          
	         driver.close();
	          
	          
	          
	          

	}

}
