package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Datainput {

WebDriver driver;

@BeforeClass
public void befclass()
{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
	driver=new ChromeDriver();
}

	@Test
	public void test1()
	{
		System.out.println("Test 1 executed");
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2 executed");
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3 executed");
		driver.get("https://www.saucedemo.com/");
	}
}
