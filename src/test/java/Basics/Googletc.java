package Basics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googletc 
{
    WebDriver driver;
    
	@BeforeTest
	public void Verify()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void Verifytitle()
	{
		String title=driver.getTitle();
		AssertJUnit.assertEquals(title, "Google");
	}
	
	@AfterTest
	public void Teardown()
	{
		driver.close();
	}
}
