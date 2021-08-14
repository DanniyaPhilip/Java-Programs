package UtilsPackage;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelRead {

	@DataProvider(name="data1")
	public Object[][] getExcelData(String path,int columns) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet sh = w.getSheet("Sheet1");
		int t=sh.getLastRowNum();
		Object ob[][]=new Object[t][columns];
		
				
				for(int i=0;i<t;i++)
				{
					for(int j=0;j<columns;j++)
					{
						Row r=sh.getRow(i);
						Cell c=r.getCell(j);
						ob[i][j]=c.getCellType();	
					}
				}
				return ob;
			}
}
