package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class BaseTest {

	public static WebDriver driver;

	@BeforeSuite
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/Downloads/chromedriver_win32 (1)/chromedriver.exe");  
		driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void afterMethod() {
		driver.quit();
	}

}
