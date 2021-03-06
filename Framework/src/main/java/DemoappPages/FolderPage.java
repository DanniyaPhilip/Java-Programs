package DemoappPages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilsPackage.WaitElements;

public class FolderPage {
	
	@FindBy(xpath="//div[@title='New folder']")
	public WebElement createFolder;
	
	@FindBy(xpath="//div[@title='New text file']")
	public WebElement createFile;

	public WebDriver driver;
	public FolderPage(WebDriver driver) {
		this.driver=driver;
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='New folder']")));
		PageFactory.initElements(driver, this);
	}
	public void createFolder(String foldername)
	{
		
		createFolder.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.SHIFT).sendKeys(foldername + Keys.ENTER ).build();
	    keydown.perform();
	    
	    WebDriverWait wait1=new WebDriverWait(driver,50);
	  	wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@title='FOLDERNKG']"))));
	  	WebElement newFolder = driver.findElement(By.xpath("//div[@title='FOLDERNKG']"));
	    Actions actions=new Actions(driver);
		actions.doubleClick(newFolder).perform();
		  
	}
		  
	public void createFile(String foldername , String filename) {
		
		
		WaitElements waitob=new WaitElements(driver);
		waitob.waitForElement(20,driver.findElement(By.xpath("//span[@title='"+foldername+"']")));
		
		createFile.click();
		Actions actionProvider1 = new Actions(driver);
		Action keydown1 = actionProvider1.keyDown(Keys.SHIFT).sendKeys(filename + Keys.ENTER).build();
		keydown1.perform();
		

	
	}
}
