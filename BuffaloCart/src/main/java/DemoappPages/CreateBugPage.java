package DemoappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilsPackage.AssertClass;

public class CreateBugPage {
	
	@FindBy(xpath="//a[text()='New Bugs']")
	public WebElement selectNewBugs;
	
	@FindBy(xpath="//input[@name='issue_no']")
	public WebElement issueNo;
	
	@FindBy(xpath="//input[@name='bug_title']")
	public WebElement bugTitle;

	@FindBy(xpath="//button[@type='submit' and text()='Save']")
	public WebElement saveButton;
	
	@FindBy(xpath="//a[text()='Bugs']")
	public WebElement selectBugs;
	
	@FindBy(xpath="//label[text()='Search all columns:']")
	public WebElement searchBug;
	
	public WebDriver driver;
	
	public CreateBugPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewBugs()
	{
		selectNewBugs.click();
	}
	public void giveIssueNo(String number) {
		issueNo.clear();
		issueNo.sendKeys(number);
	}
	
	public void giveBugTitle(String title)
	{
		bugTitle.sendKeys(title);
	}
	
	public void clickSaveButton() {
		saveButton.click();
		}
	public void checkBugIsCreated(String title)
	{
		selectBugs.click();
		searchBug.sendKeys(title);
		String xpath="//a[text()='"+title+"']";
		WebElement createdBug=driver.findElement(By.xpath(xpath));
		AssertClass.checkElementIsDisplayed(createdBug);
	}

	
}
