package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;




public class AlertTesting {
	WebDriver driver;
	String alertWindow;
	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");	
		alertWindow=driver.getWindowHandle();
		driver.switchTo().window(alertWindow);
	}
@Test(enabled=true)
	public void alerttest1()
	{
		WebElement alertButton=driver.findElement(By.id("alertButton"));
		alertButton.click();
		//Assert.assertEquals(driver.switchTo().alert().getText(),"You clicked a button");
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		driver.switchTo().alert().accept();
		driver.quit();
		}
	@Test(enabled=true)
	public void alerttest2()
	{
		
		WebElement timerAlert=driver.findElement(By.id("timerAlertButton"));
		timerAlert.click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(timerAlert.isDisplayed());
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		//Assert.assertEquals(driver.switchTo().alert().getText(),"This alert appeared after 5 seconds");
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		driver.quit();
		}
	@Test(enabled=true)
	public void alerttest3()
	{
		WebElement confirmButton=driver.findElement(By.id("confirmButton"));
		confirmButton.click();
		Alert alert3=driver.switchTo().alert();
		System.out.println(alert3.getText());
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
	@Test(enabled=true)
	public void alertest4()
	{
		WebElement promptButton=driver.findElement(By.id("promtButton"));
		promptButton.click();
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert4=driver.switchTo().alert();
		System.out.println(alert4.getText());
		driver.switchTo().alert().sendKeys("Gwen");
		driver.switchTo().alert().accept();
		driver.quit();
		
	}
}
