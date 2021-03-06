package DemoappPages;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilsPackage.AssertClass;
import UtilsPackage.SelectDropdown;

public class IdentifyClient {
@FindBy(xpath="//label/input[@type='search']")
public WebElement search;
	
@FindBy(xpath="//a[contains(text(),'Obsqura')]")
List<WebElement> clients;
	
@FindBy(xpath="//select[@name='DataTables_length']")
public WebElement selectDropdown;
	
public WebDriver driver;
public IdentifyClient(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}

public void searchClient() 
{
search.sendKeys("Obsqura");
SelectDropdown.selectByValueFromDropdown(selectDropdown, "100");
}
public void identifyFromClientList()
{
String clientWindow=driver.getWindowHandle();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
for(WebElement client:clients)
{
String openNewWindow=Keys.chord(Keys.CONTROL,Keys.RETURN);
client.sendKeys(openNewWindow);
Set<String> newBrowser=driver.getWindowHandles();
for (String i:newBrowser)
{
if(!(i.equals(clientWindow)))
{
driver.switchTo().window(i);
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
WebElement clientName=driver.findElement(By.xpath("//div[@class='col-md-6']//div[@class='col-md-6'][1]"));
AssertClass.checkElementIsDisplayed(clientName);
System.out.println("Name of Client: "+clientName.getText());

WebElement clientMailId=driver.findElement(By.xpath("(//div[@class='col-md-6']//div[@class='col-md-6'])[3]"));
AssertClass.checkElementIsDisplayed(clientMailId);
System.out.println("Mail Id: "+clientMailId.getText());
System.out.println();
driver.close();
	}
	}
driver.switchTo().window(clientWindow);
}
}	
}
	
	



