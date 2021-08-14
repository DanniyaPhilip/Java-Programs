package SwagLabTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelinput 
{
	public void datain () throws IOException
	{
		FileInputStream f= new FileInputStream("C:\\Users\\danniyax\\Documents\\SwagLabs.xlsx");
	     XSSFSheet sh;
		XSSFWorkbook w= new XSSFWorkbook(f);
			sh= w.getSheet("Sheet1");
			int t=sh.getLastRowNum();
			System.out.println(t);
}
}