package ToolsQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Toolsqa_assgnmt {
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
@Test(priority=1)
public void textbox()
{
	driver.get("https://www.demoqa.com/text-box");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	WebElement title=driver.findElement(By.xpath("//div[@class='main-header']"));
	System.out.println(title.getText());
	System.out.println(title.getAttribute("class"));
	System.out.println(title.getSize());
	System.out.println(title.getLocation());
	WebElement userName=driver.findElement(By.id("userName"));
	WebElement userMailid=driver.findElement(By.id("userEmail"));
	WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
	if(userName.isEnabled())
	userName.sendKeys("Danniya Philip"); 
	
	userMailid.sendKeys("danniya@toolsq.com");
	currentAddress.sendKeys("Thiruvalla,Kerala");
	currentAddress.clear();
	permanentAddress.sendKeys("Thiruvalla,Kerala");
	if(userName.isDisplayed() && userMailid.isDisplayed()) 
	{
	WebElement submitButton=driver.findElement(By.id("submit"));
	submitButton.submit(); }
}
@Test(priority=2)
public void checkbox()
{
	driver.navigate().to("https://www.demoqa.com/checkbox");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement tickbox=driver.findElement(By.xpath("//span[@class='rct-title']"));
	WebDriverWait wait=new WebDriverWait(driver,10);
	tickbox.click();
	wait.until(ExpectedConditions.elementToBeClickable(tickbox));
	boolean t=tickbox.isSelected();
	System.out.println(t);
}
@Test(priority=3)
public void radio_button()
{
	driver.navigate().to("https://www.demoqa.com/radio-button");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	WebElement radiobutton=driver.findElement(By.xpath("//label[text()='Yes']"));
	radiobutton.click();
}
@AfterClass
public void closewindow()
{
	driver.close();
}
}
