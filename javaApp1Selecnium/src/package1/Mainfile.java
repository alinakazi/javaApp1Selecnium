package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
public class Mainfile {   


    @SuppressWarnings("deprecation")
	@Test
    public void CreateAccount() throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver","E:\\driverchrome\\chromedriver_win32\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    			options.addArguments("start-maximized");
    			WebDriver driver = new ChromeDriver(options);
          driver.get("https://www.facebook.com");
      	Thread.sleep(3000);
      	
      	driver.findElement(By.id("u_0_2_7j")).click();
      	Thread.sleep(2000);
      	driver.findElement(By.name("firstName")).sendKeys("Test");
      	driver.findElement(By.name("lastName")).sendKeys("User");
      	driver.findElement(By.name("reg_email__")).sendKeys("test1234555676@gmail.com");
      	driver.findElement(By.name("reg_passwd__")).sendKeys("psuerbdbfbjjkk_m");
      	
    }

	    @SuppressWarnings("deprecation")
		@Test
	    public void loginAccount() throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","E:\\driverchrome\\chromedriver_win32\\chromedriver.exe");
	    	ChromeOptions options = new ChromeOptions();
	    			options.addArguments("start-maximized");
	    			WebDriver driver = new ChromeDriver(options);
	          driver.get("https://www.facebook.com");
	      	Thread.sleep(2000);

	          //finding email element by "id" locator and entering email
	          driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
	          
	          //finding pass element by "id" locator and entering password
	          driver.findElement(By.id("pass")).sendKeys("testPassword");
	          
	          //finding "Login" element by "id" locator and performing click action
	          driver.findElement(By.name("login")).submit();
	          
	      
	          
	          //Delete all cookies
	          driver.manage().deleteAllCookies(); //delete all cookies
		      	Thread.sleep(7000); //wait 7 seconds to clear cookies.
		           
	      
	    // driver.quit();
	    }
	    
	    

};