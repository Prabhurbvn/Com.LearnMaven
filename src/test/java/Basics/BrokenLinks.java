package Basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++)
		{
			WebElement ele=allLinks.get(i);
			
			String link=ele.getAttribute("href");
			
			URL url=new URL(link);
			
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			
			Thread.sleep(2000);
			
			con.connect();
			
			int rescode=con.getResponseCode();
			
			if(rescode>=400)
			{
				System.out.println(link+" - "+" is broken link");
			}
			else
			{
				System.out.println(link+" - "+" is valid link");
			}
		}

	}

}
