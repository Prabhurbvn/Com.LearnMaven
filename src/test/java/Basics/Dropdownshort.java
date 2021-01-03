package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownshort {
	
	WebDriver driver;
	
	@Test
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\Downloads\\chrome83\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.id("month"));
		
		Select sel=new Select(ele);
		
		List<String> al=new ArrayList();
		
		for(WebElement st :sel.getOptions())
		{
			al.add(st.getText());
		}
		
		List<String> al2=al;
		
		Collections.sort(al2);
		
		for(String temp:al2)
		{
			System.out.println(temp);
		}
		
				
		
		
		
	}

}
