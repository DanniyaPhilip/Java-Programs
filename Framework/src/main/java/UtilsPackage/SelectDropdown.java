package UtilsPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void selectByValueFromDropdown(WebElement select,String value)
	{
		Select dropdown=new Select(select);
		dropdown.selectByValue(value);
	}
	public static void selectByTextFromDropdown(WebElement select,String value)
	{
		Select dropdown=new Select(select);
		dropdown.selectByVisibleText(value);
	}

	
	
}
