package DemoappPages;


import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilsPackage.AssertClass;

public class GetCalendarDataPage {
	
	@FindBy(xpath="//button[@type='button' and text()='day']")
	public WebElement dayButton;
	
	@FindBy(xpath="//a[@class='fc-more']")
	public WebElement moreButton;
	
	@FindBy(xpath="//div[@class='fc-center']/h2")
	public WebElement date;
	
	@FindBy(xpath="//span//parent::th")
	public WebElement day;
	
	@FindBy(xpath="//div[@class='fc-content']")
	List<WebElement> events;
	
	@FindBy(xpath="//button[@type='button'][2]")
	public WebElement nextButton;
	
public WebDriver driver;
	public GetCalendarDataPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickDay()
	{
		dayButton.click();
	}
	public void calendarDetails() throws IOException 
	    {
		int i=0;
		nextButton.click();
		while(i<7) {
		Assert.assertTrue(date.isDisplayed());
		System.out.println(date.getText());
		Assert.assertTrue(day.isDisplayed());
		System.out.println(day.getText());
		for (WebElement event:events)
		{
	    AssertClass.softAssert(driver,event);
		System.out.println(event.getText());
		}
		System.out.println();
		nextButton.click();
		i++;
		
		}
	}
	}
	
	


