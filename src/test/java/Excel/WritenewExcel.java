package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritenewExcel {
	public static void main(String[] args) throws IOException {
		File Loc=new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\excel\\Decexcel.xlsx");
		FileInputStream in=new FileInputStream(Loc);
		Workbook w=new XSSFWorkbook(in);
		Sheet s = w.getSheet("shabeer");
		Row r = s.getRow(4);
		Cell c = r.getCell(4);
		String s1 = c.getStringCellValue();
		if (s1.equals("shabeer")) {
			c.setCellValue("joker");
			}
		FileOutputStream o=new FileOutputStream(Loc);
		w.write(o);
		System.out.println("over righted done");
		
		
		
		
		
		
		
		
		
		
		
	}

}
