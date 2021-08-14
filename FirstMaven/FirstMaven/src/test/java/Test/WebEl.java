package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebEl {

	WebDriver driver;
	
	@BeforeMethod
	public void befmet()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.demoqa.com/text-box");
	}
	@Test
	public void test()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		WebElement name=driver.findElement(By.id("userName"));
		WebElement emailid=driver.findElement(By.id("userEmail"));
		WebElement address=driver.findElement(By.id("currentAddress"));
		WebElement address1=driver.findElement(By.id("permanentAddress"));
		WebElement submit=driver.findElement(By.id("submit"));
		
		name.sendKeys("rewqfff");
		emailid.sendKeys("eeem@gmail.com");
		address.sendKeys("ffjsdg kjhsjkdh");
		address1.sendKeys("ffjsdg kjhsjkdh");
		submit.click();
		driver.quit();
	}
	
	
}
