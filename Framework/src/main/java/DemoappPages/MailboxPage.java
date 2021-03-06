package DemoappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MailboxPage {


	@FindBy(xpath="//a[@class='btn btn-danger btn-xs mr-sm']")
	public WebElement composeButton;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	public WebElement selectRecipient;
	
	@FindBy(xpath="//input[@name='subject']")
	public WebElement subject;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, ck_editor']")
	public WebElement typeSubject;
	
    public WebDriver driver;
	public MailboxPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void compose() {
		composeButton.click();
	}
	public void recipient()
	{
		selectRecipient.sendKeys("demoAdmin167");
		selectRecipient.sendKeys(Keys.ENTER);
	}
	public void giveSubject(String s)
	{
		subject.sendKeys(s);
	}
	public void mailBody()
	{
		driver.switchTo().frame(0);
		//WebElement enterText= driver.switchTo().activeElement();
		WebElement enterText=driver.findElement(By.xpath("//html/body[@contenteditable='true']"));
		//enterText.click();
		enterText.sendKeys("Subject");
		//Actions action=new Actions(driver);
		//action.moveToElement(typeSubject).build().perform();
	}
}