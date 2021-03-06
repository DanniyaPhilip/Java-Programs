package SwagLabTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Test.DataInput;

public class SwagLab {
	WebDriver driver;
	
	@BeforeClass
	public void befclass()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(dataProvider="data1",dataProviderClass=Dataprovider.class)
	public void swagtest(String a,String b)
	{
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("login-button"));
                    username.sendKeys(a);
		            password.sendKeys(b);
		            login.click();
	}
}
