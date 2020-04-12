package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbLogin {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void verifyTitleofPage()
	{
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
