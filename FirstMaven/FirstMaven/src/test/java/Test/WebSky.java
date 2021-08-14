package Test;

import org.testng.annotations.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSky {

	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.skyscanner.net/");
		driver.navigate().to("https://www.skyscanner.co.in/carhire");
	}

	@Test(enabled=true)
	public void test()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links)
		{
		System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
		}
		}
	@Test
		public void test1()
		{
			List<WebElement> images=driver.findElements(By.tagName("img"));
			for(WebElement image:images)
			{
				if(image.getAttribute("src").contains(".png"))
					System.out.println(image.getAttribute("src"));
				else
					System.out.println(".png extension images not found");
				if(image.getAttribute("src").contains(".jpg"))
					System.out.println(image.getAttribute("src"));
				else
					System.out.println(".jpg extension images not found");
			}
			driver.quit();
		
	}
}
