package UtilsPackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElements {
	public WebDriver driver;
	public WaitElements(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	public void waitForElement(int t, WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,t);
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitForAlert(int t) {
		WebDriverWait wait=new WebDriverWait(driver,t);
		wait.until(ExpectedConditions.alertIsPresent());	
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void fluentWaitForElement(int t, WebElement element) {
		Wait wait=new FluentWait(driver).pollingEvery(Duration.ofSeconds(t)).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}

}
