package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class WebTest1 {
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void Seltest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoqa.com/text-box");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println("Selenium Test");
		driver.navigate().to("https://www.demoqa.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
	@Test
	public void Seltest1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skyscanner.net");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.quit();
	}
}
