package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyboardEvents {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\Downloads\\chrome83\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void key_board()
	{
		WebElement ele=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(ele).build().perform();
		
		/*act.sendKeys(Keys.ARROW_LEFT).build().perform();
		
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		act.sendKeys(Keys.ENTER).build().perform();*/
		
		act.contextClick(ele).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN.ENTER).perform();
		
		
	}

}
