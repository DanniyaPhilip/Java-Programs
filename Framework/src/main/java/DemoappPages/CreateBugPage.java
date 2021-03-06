package DemoappPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateBugPage {
	
	@FindBy(xpath="//a[text()='New Bugs']")
	public WebElement selectNewBugs;
	
	@FindBy(xpath="//input[@name='issue_no']")
	public WebElement issueNo;
	
	@FindBy(xpath="//input[@name='bug_title']")
	public WebElement bugTitle;
	
	@FindBy(xpath="//select[@name='reporter']")
	public WebElement selectReporter;
	
	@FindBy(xpath="//select[@name='priority']")
	public WebElement selectPriority;
	
	@FindBy(xpath="//select[@name='severity']")
	public WebElement selectSeverity;
	
	@FindBy(xpath="(//div[@class='note-editable'])[1]")
	public WebElement giveDescription;
	
	@FindBy(xpath="(//div[@class='note-editable'])[2]")
	public WebElement reproducibility;
	
	@FindBy(xpath="//select[@name='bug_status']")
	public WebElement bugStatus;
	
	@FindBy(xpath="//button[@type='submit' and text()='Save']")
	public WebElement saveButton;
	
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

	
}
