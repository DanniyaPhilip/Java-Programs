package DemoappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import UtilsPackage.AssertClass;
import UtilsPackage.ImageUpload;
import UtilsPackage.SelectDropdown;


public class CreateProfilePage {
	
	@FindBy(xpath= "//input[@name='fullname']")
	public WebElement fullName;

	@FindBy(xpath= "//input[@name='employment_id']")
	public WebElement employmentID;
	
	@FindBy(xpath= "//input[@name='username']")
	public WebElement newUserName;
	
	@FindBy(id= "new_password")
	public WebElement newPassword;
	
	@FindBy(xpath= "//input[@name='confirm_password']")
	public WebElement confirmPassword;
	
	@FindBy(id= "check_email_addrees")
	public WebElement emailAddress;
	
	@FindBy(id= "myImg")
	public WebElement uploadImg;
	
	@FindBy(id= "user_type")
	public WebElement select;
	
	@FindBy(xpath="//span[@title='Select Designation']")
	public WebElement selectDesignation;
	
	@FindBy(xpath="//option[@Value='1' and text()='Manager']")
	public WebElement designation;
	
	@FindBy(xpath= "//button[@type='submit' and text()='Create User']")
	public WebElement createUser;
	
	@FindBy(xpath="(//input[@type='search'])[2]")
	public WebElement searchButton;
	
	public WebDriver driver;
	
	public CreateProfilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterFullName(String name)
	{
		fullName.sendKeys(name);
	}
	public void enterEmploymentID(String id)
	{
		employmentID.sendKeys(id);
	}
	public void enterUserName(String userName)
	{
		newUserName.sendKeys(userName);
	}
	public void enterPassword(String password)
	{
		newPassword.sendKeys(password);
	}
	public void confirmPassword(String password)
	{
		confirmPassword.sendKeys(password);
	}
	public void enterEmailaddress(String emailId)
	{
		emailAddress.sendKeys(emailId);
	}
	
	public void selectUsertype(String value)   {
		SelectDropdown.selectByTextFromDropdown(select, value);
	}
	public void selectDesignation() {
		selectDesignation.click();
		designation.click();
		}
	public void uploadImage(WebDriver driver) {
		 ImageUpload upimg=new ImageUpload();
		 upimg.uploadImage(driver,uploadImg,"C:\\Users\\danniyax\\Downloads\\768px-Eo_circle_brown_letter-a.svg.png");
		} 
   public void createUser() {
		createUser.click();
   }
   public void isUserCreated(String userName)
   {
	   searchButton.sendKeys(userName);
	   String xpath="//td[text()='"+userName+"']";
	   AssertClass.checkElementIsDisplayed(driver.findElement(By.xpath(xpath)));
   }
		}   
