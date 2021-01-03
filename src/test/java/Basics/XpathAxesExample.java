package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesExample {
	
	WebDriver driver;
    
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\GOD\\\\Downloads\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void selfExample()
	{
		WebElement birla=driver.findElement(By.xpath("//a[contains(text(),'Aditya Birla Fashion')]/self::a"));
		
		System.out.println("Self Example :"+birla.getText());
	}
	
	@Test(priority=2)
	public void parentExample()
	{
		WebElement birla=driver.findElement(By.xpath("//a[contains(text(),'Aditya Birla Fashion')]/parent::td"));
		
		System.out.println("Parent Example :"+birla.getText());
	}
	
	@Test(priority=3)
	public void ancestorExample()
	{
		WebElement birla=driver.findElement(By.xpath("//a[contains(text(),'Aditya Birla Fashion')]/parent::td/ancestor::tr"));
		
		System.out.println("Ancestor Example :"+birla.getText());
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
