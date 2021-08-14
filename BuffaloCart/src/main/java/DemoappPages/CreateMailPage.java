package DemoappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilsPackage.ActionClass;
import UtilsPackage.AssertClass;

public class CreateMailPage {
    
	@FindBy(xpath="//a[@class='btn btn-danger btn-xs mr-sm']")
	public WebElement composeButton;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	public WebElement selectRecipient;
	
	@FindBy(xpath="//input[@name='subject']")
	public WebElement giveSubject;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, ck_editor']")
	public WebElement typeMail;
	
	@FindBy(xpath="//button[text()=' Send                    ']")
	public WebElement clickSend;
	
    public WebDriver driver;
	public CreateMailPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void clickCompose() {
		composeButton.click();
	}
	public void giveRecipientName()
	{
		selectRecipient.sendKeys("demoAdmin167");
		selectRecipient.sendKeys(Keys.ENTER);
	}
	public void giveSubject(String subject)
	{
		giveSubject.sendKeys(subject);
	}
	public void composeMail()
	{
		driver.switchTo().frame(0);
		WebElement enterText= driver.switchTo().activeElement();
		enterText.click();
		enterText.sendKeys("This is a Demo mail");
		ActionClass.moveToAnElement(driver, typeMail);
		clickSend.click();
		}
	public void searchMail(String subject)
	{
		String xpath="//a[text()='"+subject+"']";
		AssertClass.checkElementIsDisplayed(driver.findElement(By.xpath(xpath)));
	}
}