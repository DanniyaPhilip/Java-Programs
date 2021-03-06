package DemoappTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import DemoappPages.LoginPage;

public class LoginTest 
{
    WebDriver driver;
	@BeforeTest
	public void loginTest()
	{
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsername("admin");
	loginpage.enterPassword("123456");
	loginpage.clickSignInbutton();
		}
	
	@BeforeSuite
	@Parameters({"Browser"})
	public void webpage(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))   {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\danniyax\\Documents\\");
		driver=new FirefoxDriver();
				}
		driver.get("http://buffalocart.com/demo/erp/login");
	}
   @AfterTest()
    public void exit()
    {
    	driver.quit();
    }
}
