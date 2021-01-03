package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Autocomplete {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\Downloads\\chrome83\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void auto_Complete()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> auto=driver.findElements(By.tagName("li"));
		
		for(WebElement aa : auto)
		{
			if(aa.getText().equalsIgnoreCase("selenium testing"))
			{
				aa.click();
				break;
			}
		}
	}

}
