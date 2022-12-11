package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class launchchrome {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdou\\eclipse-workspace\\Selenium\\Selenium_project\\Webdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		
	   driver.findElement(By.name("q")).sendKeys("selenium "+"i am amazing");
	   driver.findElement(By.name("btnK")).click();	
	   //  driver.close();
	    
	}

}
