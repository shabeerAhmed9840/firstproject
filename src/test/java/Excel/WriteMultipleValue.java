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

public class WriteMultipleValue {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\excel\\badman321.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sh = w.createSheet("Data1");
		String[] s = new String[] { "shabeer", "Ahmed", "chennai", "tamilNadu" };
		int k = 0;
		for (int i = 0; i <= 3; i++) {
			Row r = sh.createRow(i);
			for (int j = 0; j < 1; j++) {
				Cell c = r.createCell(j);
				c.setCellValue(s[k]);
				k++;
			}
		}

		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);
	}

}
