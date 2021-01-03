package Basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\Downloads\\chrome83\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.rediff.com");
		
		Set<Cookie> s=driver.manage().getCookies();
		
		System.out.println("Cookie size "+ s.size());
		
		for(Cookie c : s)
		{
			System.out.println(c.getName()+ " =" +c.getValue());
		}
		
	}

}
