package Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcel {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\excel\\Decexcel.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("shabeer");
		Row r = s.createRow(4);
		Cell c = r.createCell(4);
		c.setCellValue("shabeer");
		
		FileOutputStream o=new FileOutputStream(loc);
		w.write(o);
		System.out.println("new excel is created");
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
