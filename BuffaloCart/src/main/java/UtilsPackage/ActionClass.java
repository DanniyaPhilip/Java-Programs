package UtilsPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void giveFileName(WebDriver driver,String filename)
	{
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.SHIFT).sendKeys(filename + Keys.ENTER ).build();
	    keydown.perform();
	    
	}
	public static void openFolder(WebDriver driver, WebElement newFolder) 
	{
		Actions actions=new Actions(driver);
		actions.doubleClick(newFolder).perform();
	}
	public static void moveToAnElement(WebDriver driver, WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
}
