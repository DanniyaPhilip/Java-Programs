package Test;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CovinTest
{
	WebDriver driver;
	@BeforeMethod
	public void befmethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	@Test
	public void test1()
	{
		driver.get("https://www.cowin.gov.in/home");
		WebElement searchbypin=driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[2]"));
		searchbypin.click();
		WebElement enterpin=driver.findElement(By.id("mat-input-0"));
		enterpin.sendKeys("695584");
		WebElement searchbutton=driver.findElement(By.xpath("//button[@class='pin-search-btn']"));
		searchbutton.click();
		WebElement agebutton=driver.findElement(By.xpath("(//label[text()=' Age 18+ '])[2]/parent::div[@class='form-check nomargright']"));
		agebutton.click();	
		List<WebElement> dates=driver.findElements(By.xpath("//slide[@class='item carousel-item ng-star-inserted']/div/li/a/p"));
		for(WebElement date:dates)
		{
			System.out.println(date.getAttribute("class"));
			System.out.println(date.getText());
		}
		driver.quit();
	}
	
	@Test(enabled=false)
	public void test2()
	{
		driver.navigate().to("https://dashboard.cowin.gov.in/");
		WebElement site=driver.findElement(By.xpath("//div[@class='small-box bg-white dash-box cm-site-conduct-box']/div[2]/p"));
		System.out.println(site.getText()); 
		WebElement sitenumber=driver.findElement(By.xpath("//div[@class='small-box bg-white dash-box cm-site-conduct-box']/div[2]/h3"));
		System.out.println(sitenumber.getText());
		
		WebElement totalregstrns=driver.findElement(By.xpath("(//p[@class='fontnormal titlemob'])[2]"));
		System.out.println(totalregstrns.getText());
		WebElement regnumber=driver.findElement(By.xpath("(//div[@class='inner innerbox'])[2]/h3"));
		System.out.println(regnumber.getText());
		WebElement today1=driver.findElement(By.xpath("(//span[@class='fontnormal'])[2]"));
		System.out.print(today1.getText());
		WebElement todaycount1=driver.findElement(By.xpath("(//strong[@class='greencolor'])[1]"));
		System.out.println(todaycount1.getText());
		
		WebElement totaldoses=driver.findElement(By.xpath("(//p[@class='fontnormal titlemob'])[3]"));
		System.out.println(totaldoses.getText());
		WebElement dosesnumber=driver.findElement(By.xpath("(//div[@class='inner innerbox'])[3]/h3"));
		System.out.println(dosesnumber.getText());
		WebElement today2=driver.findElement(By.xpath("(//span[@class='fontnormal'])[3]"));
		System.out.print(today2.getText());
		WebElement todaycount2=driver.findElement(By.xpath("(//strong[@class='greencolor'])[2]"));
		System.out.println(todaycount2.getText());
		driver.quit();
	}
}