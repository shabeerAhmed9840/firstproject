package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Updateexcel {
	public static void main(String[] args) throws IOException   {
		
		File loc=new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\excel\\NewExcel.xlsx");
FileInputStream stream=new FileInputStream(loc);
		 Workbook w=new XSSFWorkbook(stream);
		 Sheet s=w.createSheet("Shabeer");
		 
		 
		 Row r=s.createRow(5);
		 
		 Cell c = r.createCell(2);
		 String s1 = c.getStringCellValue();
		 if (s1.equals("world")) {
			 c.setCellValue("java");
			}
		FileOutputStream n = new FileOutputStream(loc);
		w.write(n);
		System.out.println("updated");}}
				

