package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demoqa {
	WebDriver driver;
	String parentWindow;
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\danniyax\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		parentWindow=driver.getWindowHandle();
		//System.out.println(parentWindow);
	}

	@Test(priority=1)
	public void newWindow()
	{
		
		WebElement newwindow=driver.findElement(By.id("windowButton"));
		newwindow.click();
		
		Set<String> newBrowser=driver.getWindowHandles();
		for(String c:newBrowser)
		{
			if(!(c.equals(parentWindow)))
			{
				driver.switchTo().window(c);
				System.out.println(driver.getCurrentUrl());
				WebElement text=driver.findElement(By.id("sampleHeading"));
				Assert.assertEquals(text.getText(), "This is a sample page");
				System.out.println(text.getText());
				driver.close();
		}
	} }
	@Test(priority=2)
		public void newWindowmessage()
		{
		driver.switchTo().window(parentWindow);
		WebElement windowMessage=driver.findElement(By.id("messageWindowButton"));
		windowMessage.click();
		/*
		Set<String> newWindow=driver.getWindowHandles();
		for(String k:newWindow)
		{
			if(!(k.equals(parentWindow)))
			{
				driver.switchTo().window(k);
				//System.out.println(driver.getCurrentUrl());
				WebElement textmessage=driver.findElement(By.tagName("body"));
				//Assert.assertEquals(textmessage.getText(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
				System.out.println(textmessage.getText());
				driver.close();
			}
	} */
}
	@Test(priority=3)
	public void newTab()
	{
		driver.switchTo().window(parentWindow);
		WebElement newTabbutton=driver.findElement(By.id("tabButton"));
		newTabbutton.click();
		Set<String> newTab=driver.getWindowHandles();
		for(String t:newTab)
		{
			if(!(t.equals(parentWindow)))
			{
				driver.switchTo().window(t);
				System.out.println(driver.getCurrentUrl());
				WebElement newtext=driver.findElement(By.id("sampleHeading"));
				Assert.assertEquals(newtext.getText(),"This is a sample page");
				System.out.println(newtext.getText());
				driver.close();
	}
}
	}
	@AfterMethod
	public void aftermethod()
	{
		
		driver.quit();
	}
}