package Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class SwagLabs 
{
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority=3)
	public void swagtest3()
	{
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		WebElement select=driver.findElement(By.xpath("//select[@class='product_sort_container']")); 
		Select dropdown=new Select(select);    
		//dropdown.selectByIndex(2);
		//dropdown.selectByValue("za");
		dropdown.selectByVisibleText("Name (Z to A)");
	}
	
@Test(dataProvider="d1",dataProviderClass=DataInput.class,priority=1)
	public void swagtest(String a,String b)
	{
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("login-button"));
                    username.sendKeys(a);
		            password.sendKeys(b);
		            login.click();
		            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		            Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
		            
		            }
@Test(dataProvider="d2",dataProviderClass=DataInput.class,priority=2)
public void swagtest2(String a, String b)
{
	WebElement username=driver.findElement(By.id("user-name"));
	WebElement password=driver.findElement(By.id("password"));
	WebElement login=driver.findElement(By.id("login-button"));
                username.sendKeys(a);
	            password.sendKeys(b);
	            login.click();
	            
	            List<WebElement> itemnames=driver.findElements(By.xpath("//div[@class='inventory_item']/div/div/a/div[@class='inventory_item_name']"));         
	            List<WebElement> itemprices=driver.findElements(By.xpath("//div[@class='pricebar']/div"));
	           
	            Iterator<WebElement> i=itemnames.iterator();
	            Iterator<WebElement> j=itemprices.iterator();
	            while(i.hasNext())
	            {
	            	WebElement itemname=i.next();
	            	WebElement itemprice=j.next();
	            	System.out.println(itemname.getText());
	            	System.out.println(itemprice.getText());
	            }
	            }

@AfterMethod
public void aftertest()
{
	driver.quit();
}

}