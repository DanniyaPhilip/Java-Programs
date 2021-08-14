package DemoappPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfilesPage {

	@FindBy(xpath= "//a[text()='New User']")
	public WebElement newUser;
	
	
public WebDriver driver;
	
	public UserProfilesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	
	public void clickNewUser()
	{
		newUser.click();
	}
}
