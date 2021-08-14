package DemoappPages;
import UtilsPackage.ExcelRead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProfile {
	
	@FindBy(xpath="(//input[@type='search'])[2]")
	public WebElement searchUser;
	
	@FindBy(xpath="//button[@type='submit' and text()='Proceed Anyway!']")
	public WebElement proceedButton;
	
	public WebDriver driver;

public DeleteProfile(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
    ExcelRead obj=new ExcelRead();
   
    
	public void deleteUserProfile(String s)
	{
		
		searchUser.sendKeys(s);
		
		String xpath="//td[text()='"+s+"']/following-sibling::td/a[@title='Click to Delete ']";
		try {
		WebElement deleteButton=driver.findElement(By.xpath(xpath));
		deleteButton.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			WebElement deleteButton=driver.findElement(By.xpath(xpath));
			deleteButton.click();	
		}
		
		proceedButton.click();
	}
	}
		
		


