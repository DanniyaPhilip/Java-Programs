package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.DataProvider;



public class DataInput {

	@DataProvider(name="d1")
	public Object[][] datain () throws IOException
	{
		FileInputStream f= new FileInputStream("C:\\Users\\danniyax\\Documents\\SwagLabs.xlsx");
	     XSSFSheet sh;
		XSSFWorkbook w= new XSSFWorkbook(f);
			sh= w.getSheet("Sheet1");
			int t=sh.getLastRowNum();
			Object ob[][]= new Object[t][2];
			for(int i=0;i<t;i++)
			{
				for(int j=0;j<2;j++)
				{
					Row r= sh.getRow(i+1);
					Cell c= r.getCell(j); 
					ob[i][j]=c.getStringCellValue();
				   }
			}
			return ob;	
	}		
	
	@DataProvider(name="d2")
	public Object[][] datain1 () throws IOException
	{
		FileInputStream f= new FileInputStream("C:\\Users\\danniyax\\Documents\\SwagLabs.xlsx");
	     XSSFSheet sh;
		XSSFWorkbook w= new XSSFWorkbook(f);
			sh= w.getSheet("Sheet1");
			
			Object ob[][]= new Object[1][2];
			
			
			for(int i=0;i<1;i++)
			{
				for(int j=0;j<2;j++)
				{
					Row r= sh.getRow(i+1);
					Cell c= r.getCell(j); 
					ob[i][j]=c.getStringCellValue();
				   }
			}
			return ob;	
	}		


}