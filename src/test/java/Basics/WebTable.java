package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\Downloads\\chrome83\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		
		// single column
		WebElement singlecolumn=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]"));
		
		
		System.out.println(singlecolumn.getText());
		
		
		//single row
		WebElement singleRow=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]"));
		
		System.out.println(singleRow.getText());
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for(int i=0; i<rows.size(); i++)
		{
			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0; j<col.size(); j++)
			{
				System.out.print(col.get(j).getText());
			}
			
			System.out.println("");
		}
		
		
			
		
		
		
		
		

	}

}
