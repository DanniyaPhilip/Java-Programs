package DemoappPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)
	{
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
	
}
