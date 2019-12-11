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
public class Exceltask {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\SHABEER AHMED\\Desktop\\exceltask.xlsx");
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("data1");
		//int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		//System.out.println(physicalNumberOfRows);
		for (int i=0;i<s.getPhysicalNumberOfRows();i++){
			Row r=s.getRow(i);	
			//int physicalNumberOfCells = r.getPhysicalNumberOfCells();
			//System.out.println(physicalNumberOfCells);
		for (int j=0;j<r.getPhysicalNumberOfCells();j++) {
			Cell c=r.getCell(j);
			int t=c.getCellType();
			if(t==1) { //finding string
				String s1 = c.getStringCellValue();
				System.out.println(s1);
			}
			else if(t==0) { //find date and numric
				if(DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					
					SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd-");
					String s2 = sd.format(d);
					System.out.println(s2);
				}
				else { //find numeric
					double d2 = c.getNumericCellValue();
					long l=(long)d2;//typecasting double to long 
					String s3 = String.valueOf(l);
					System.out.println(s3);
					
					}
				
			}
		
			
		}
	}
	
		
	}

}
