
package SwagLabTest;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class Dataprovider {

	@DataProvider(name="data1")
	public Object[][] input() throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\danniyax\\Documents\\SwagLabs.xlsx");
		XSSFSheet sh;
		XSSFWorkbook w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		int t = sh.getLastRowNum();
		System.out.println(t);
		Object ob[][] = new Object[t][2];
		
		String data=sh.getRow(1).getCell(0).getStringCellValue();
				System.out.println(data);
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


}
	
