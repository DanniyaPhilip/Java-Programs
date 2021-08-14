package Test;

import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class SwagDemo {

	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\danniyax\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		WebElement select=driver.findElement(By.xpath("//select[@class='product_sort_container']")); 
		Select dropdown=new Select(select);    
		//dropdown.selectByIndex(2);
		dropdown.selectByValue("hilo");
		//dropdown.selectByVisibleText("Name (Z to A)");
		
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
	
	
	
	
}
