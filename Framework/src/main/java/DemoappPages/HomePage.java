package DemoappPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	@FindBy(xpath= "//span[text()='User']")
	public WebElement Usericon;
	
	@FindBy(xpath="//span[text()='Bugs']")
	public WebElement selectBugs;
	
	@FindBy(xpath="//span[text()='Client']")
	public WebElement selectClient;
	
	@FindBy(xpath="//span[text()='Calendar']")
	public WebElement calendarIcon;
	
    @FindBy(xpath="//span[text()='Mailbox']")
	public WebElement mailIcon;
    
    @FindBy(xpath="//span[text()='File Manager']")
    public WebElement fileManager;
	
public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		} 
	
	public void clickUser()
	{
		Usericon.click();
	}
	public void selectBugIcon()
	{
		selectBugs.click();
	}
	public void selectClient()
	{
		selectClient.click();
	}
	public void selectCalendar() {
		calendarIcon.click();
	}
	public void clickMail()
	{
		mailIcon.click();
	}
	public void fileManager()
	{
		fileManager.click();
	}
}
