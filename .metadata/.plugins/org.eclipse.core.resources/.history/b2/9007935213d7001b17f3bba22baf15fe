package UtilsPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public void takeScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot tk=((TakesScreenshot)driver);
		File f=tk.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\danniyax\\Documents\\pic.png");
		FileUtils.copyFile(f,destFile);
		
	}
}
