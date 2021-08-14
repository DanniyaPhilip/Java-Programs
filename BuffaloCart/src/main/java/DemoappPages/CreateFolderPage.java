package DemoappPages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import UtilsPackage.ActionClass;
import UtilsPackage.AssertClass;
import UtilsPackage.WaitElements;

public class CreateFolderPage {
	
	@FindBy(xpath="//div[@title='New folder']")
	public WebElement createFolder;
	
	@FindBy(xpath="//div[@title='New text file']")
	public WebElement createFile;

	public WebDriver driver;
	public CreateFolderPage(WebDriver driver) {
		this.driver=driver;
		WaitElements wait=new WaitElements(driver);
		wait.waitForElement(10,driver.findElement(By.xpath("//div[@title='New folder']")));
		PageFactory.initElements(driver, this);
	}
	public void createFolder(String foldername)
	{
		createFolder.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		ActionClass.giveFileName(driver, foldername);
	    
		WebElement newFolder=driver.findElement(By.xpath("//div[@title='"+foldername+"']"));
		AssertClass.checkElementIsDisplayed(newFolder);
		WaitElements waitob=new WaitElements(driver);
		waitob.fluentWaitForElement(5, newFolder);
	    ActionClass.openFolder(driver, newFolder);
	}
		  
	public void createFile(String foldername , String filename) {
		
		WebElement identifyFolderIsOpen=driver.findElement(By.xpath("//span[@title='"+foldername+"']"));
		WaitElements waitob=new WaitElements(driver);
		waitob.waitForElement(10,identifyFolderIsOpen);
		
		createFile.click();
		ActionClass.giveFileName(driver, filename);
		String xpath="//div[@title='"+filename+".txt']";
		AssertClass.checkElementIsDisplayed(driver.findElement(By.xpath(xpath)));
		}
}
