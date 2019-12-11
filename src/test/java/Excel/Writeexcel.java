package Excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Writeexcel {
	public static void main(String[] args) throws IOException {
		
File loc=new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\excel\\NewExcel.xlsx");

 Workbook w=new XSSFWorkbook();
 Sheet s=w.createSheet("Shabeer");
 
 Row r=s.createRow(5);
 
 Cell c = r.createCell(2);
 
 c.setCellValue("world");
 
FileOutputStream n = new FileOutputStream(loc);
w.write(n);
System.out.println("created");
		
		
		
		
		
		
	}

}
