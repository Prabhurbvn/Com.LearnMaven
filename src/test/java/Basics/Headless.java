package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {
	
	WebDriver driver;
	
	@Test
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\Downloads\\chrome83\\chromedriver.exe");
		
		driver=new ChromeDriver(options);
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//notifications
		
		/*ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\Downloads\\chrome83\\chromedriver.exe");
		
		driver=new ChromeDriver(opt);
		
		driver.get("http://www.redbus.in");*/
		
		
		
		
		
	}

}
