package excelcode;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
public XSSFSheet sh;
	
	public Excel() throws IOException {
		FileInputStream f= new FileInputStream("C:\\Users\\danniyax\\OneDrive - Intel Corporation\\Documents\\Java\\Excel\\mavensample.xlsx");
		//FileInputStream f= new FileInputStream("C:\\Users\\User\\Desktop\\ExcelFileRead.xlsx");

		XSSFWorkbook w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");
		
	}
	


	public String readData(int i, int j) {
		Row r= sh.getRow(i);
		Cell c= r.getCell(j); //Import Cell of apache poi not Table
		int celltype=c.getCellType();
		switch(celltype) 
		{
		
		case Cell.CELL_TYPE_NUMERIC:
		{
			double a=c.getNumericCellValue();
			return String.valueOf(a);
		}
		case Cell.CELL_TYPE_STRING:
		{
			return c.getStringCellValue();
		}
		}
		return null; 
		
	}

}
