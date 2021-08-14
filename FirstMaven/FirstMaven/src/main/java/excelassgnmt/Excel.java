package excelassgnmt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {

public static XSSFSheet sh;
	
public static void main(String args[]) throws Exception {
	
	FileInputStream f= new FileInputStream("C:\\Users\\danniyax\\Documents\\Excel_object.xlsx");
		
	XSSFWorkbook w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");
		int t=sh.getLastRowNum();
		System.out.println(t);
		Object ob[][]= new Object[t][3];
		
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<3;j++)
			{
				Row r= sh.getRow(i);
				Cell c= r.getCell(j); //Import Cell of apache poi not Table
				int celltype=c.getCellType();
				
				//switch(celltype) 
				//{
				if (celltype==Cell.CELL_TYPE_NUMERIC)
				{
					double a=c.getNumericCellValue();
					String p=""+a;
					
					ob[i][j]=p;
					System.out.print(ob[i][j]+" ");
				}
				else if(celltype== Cell.CELL_TYPE_STRING)
				
				{
					ob[i][j]=c.getStringCellValue();
					System.out.print(ob[i][j]+" ");
				}
			}
			System.out.println();	
		}
			
	
}
		
	}

	