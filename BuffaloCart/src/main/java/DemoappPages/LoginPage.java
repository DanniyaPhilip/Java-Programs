package DemoappPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilsPackage.AssertClass;
import UtilsPackage.WaitElements;



public class LoginPage {

	@FindBy(xpath= "//input[@name='user_name']")
	public WebElement loginUsername;
	
	@FindBy(xpath= "//input[@name='password']")
	public WebElement loginPassword;
	
	@FindBy(xpath= "//button[@type='submit'][1]")
	public WebElement loginButton;
	
	

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	WaitElements wait=new WaitElements(driver);
	public void enterUsername(String username)
	{
		wait.waitForElement(10, loginUsername);
		loginUsername.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		loginPassword.sendKeys(password);
	}
	public void clickSignInbutton()
	{
		loginButton.click();
	}
	public void checkIfLoggedIn()
	{
		AssertClass.checkElementIsDisplayed(driver.findElement(By.xpath("//img[@alt='Avatar']")));
	}
	
}
