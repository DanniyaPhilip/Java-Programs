package UtilsPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertClass {
	
	public static void checkElementIsDisplayed(WebElement element)
	{
		Assert.assertTrue(element.isDisplayed());
	}
	public static void softAssert(WebDriver driver,WebElement element) throws IOException
	{
		SoftAssert softAssertion=new SoftAssert();
		softAssertion.assertTrue(element.isDisplayed());
		TakeScreenshot.takeScreenshot(driver);
	}

}
