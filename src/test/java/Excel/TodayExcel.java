package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TodayExcel {
	public static void main(String[] args) throws IOException {

        File f=new File("C:\\\\Users\\\\SHABEER AHMED\\\\Desktop\\\\exceltask.xlsx");
		FileInputStream fob=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fob);
		Sheet sh = wb.getSheet("Sheet1");
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			int type = c.getCellType();
			
			if (type==1) {
				String s1 = c.getStringCellValue();
				System.out.println(s1);
				
			}
			else if (type==0) {
				if(DateUtil.isCellDateFormatted(c)) {
					Date s2 = c.getDateCellValue();
					
					SimpleDateFormat sd=new SimpleDateFormat("MMM-dd-yy");
							String s3 = sd.format(s2);
					System.out.println(s3);
							
				}
				else {
					double s4 = c.getNumericCellValue();
					long l=(long)s4;
					String s5 = String.valueOf(l);
					System.out.println(s5);
				}
				
			}
			
			
		}
		
	}

}}


