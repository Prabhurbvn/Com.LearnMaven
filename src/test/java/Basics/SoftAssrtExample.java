package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SoftAssrtExample {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver81\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void samp()
	{
		WebElement female=driver.findElement(By.id("u_0_6"));
		
		SoftAssert as=new SoftAssert();
		
		System.out.println("display test case start");
		as.assertEquals(true, female.isDisplayed()); //true
		System.out.println("display test case end");
		
		System.out.println("Enable test case start");
		as.assertEquals(true, female.isEnabled());  //false
		System.out.println("Enable test case end");
		
		System.out.println("select test case start");
		as.assertEquals(false, female.isSelected()); //true
		System.out.println("select test case end");
		
		as.assertAll();
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
	 driver.close();
	}
	
	

}
