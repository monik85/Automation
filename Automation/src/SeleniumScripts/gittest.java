package SeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gittest {

	public static void main(String[] args) {

System.out.println("test");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
    // System.setProperty("webdriver.chorme.driver","C:\\Users\\Praveen\\OneDrive\\Desktop\\chorme driver\\chromedriver_win32\\chromedriver.exe");
		
          WebDriver driver = new ChromeDriver();
          driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
          

	}

}
