package SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mocktest1 {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Test");
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      
	      WebDriver driver = new ChromeDriver();
	      driver.navigate().to("http://automationpractice.com/index.php?id_category=5&controller=category");
	      
	      // maximize the window
	       driver.manage().window().maximize();
	       Thread.sleep(5000);

	}

}
