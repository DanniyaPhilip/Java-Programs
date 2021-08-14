package ToolsQA;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DroppableTest {
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoqa.com/droppable");
	}
	
@Test
public void draganddrop() throws Exception
{
	Actions act=new Actions(driver);
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	act.dragAndDrop(drag, drop).build().perform();
	
	TakesScreenshot tk=((TakesScreenshot)driver);
	File file=tk.getScreenshotAs(OutputType.FILE);
	File destfile=new File ("C:\\Users\\Public\\Pictures\\picture.png");
	FileUtils.copyFile(file,destfile);
	System.out.println("Screenshot taken");
	
}
}
