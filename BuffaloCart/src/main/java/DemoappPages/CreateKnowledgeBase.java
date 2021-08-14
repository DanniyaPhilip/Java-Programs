package DemoappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilsPackage.AssertClass;

public class CreateKnowledgeBase {

	@FindBy(xpath="//div/a[text()='  New Category']")
	public WebElement newCategory;
	
	@FindBy(xpath="//input[@type='text' and @name='category']")
	public WebElement enterCategory;
	
	@FindBy(xpath="//input[@type='text' and @name='sort']")
	public WebElement enterOrder;
	
	@FindBy(xpath="//button[@id='sbtn']")
	public WebElement saveButton;
	
	@FindBy(xpath="//label/input[@type='search']")
	public WebElement searchButton;
	
	public WebDriver driver;
	public CreateKnowledgeBase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createNewCategory()
	{
		newCategory.click();
	}
	public void enterCategoryDetails(String categoryName,String orderNumber)
	{
		enterCategory.sendKeys(categoryName);
		enterOrder.sendKeys(orderNumber);
		saveButton.click();
	}
	public void isCategoryCreated(String categoryName)
	{
		searchButton.sendKeys(categoryName);
		String s="//td[@tabindex='0' and text()='"+categoryName+"']";
		WebElement categoryCreated=driver.findElement(By.xpath(s));
		AssertClass.checkElementIsDisplayed(categoryCreated);
	}
	
}
