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
	loginpage.checkIfLoggedIn();
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
		System.setProperty("webdriver.gecko.driver","C:\\Users\\danniyax\\Documents\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
				}
		driver.get("https://erp.buffalocart.com/admin/dashboard");
	}
   @AfterTest()
    public void exit()
    {
    	driver.quit(); 
    }
}
