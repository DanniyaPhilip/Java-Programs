package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElem 
{
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoqa.com/text-box");
	}
	
	@Test 
	public void webtest() 
	{
	
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		WebElement fullnameinput=driver.findElement(By.id("userName"));
		WebElement emailinput=driver.findElement(By.id("userEmail"));
		WebElement submitbutton=driver.findElement(By.id("submit"));
		
		fullnameinput.sendKeys("qwerty");
		emailinput.sendKeys("test123@nwert.com");
		//submitbutton.click();
		driver.quit();
	}
	@Test
	public void webtest1()
	{
		//WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.demoqa.com/links");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links)
		{
		System.out.println(link.getAttribute("href"));
		System.out.println(link.getText());
		}
	} 

}
