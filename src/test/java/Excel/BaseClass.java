package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	static String value=null;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);}
	
	public static void fill(WebElement e,String s) {
		e.sendKeys(s);
		}
	public static  void click(WebElement e) {
		e.click();
		}
	public static String getDataFromExcel(int rowno,int cellno) throws IOException {
		
	File loc=new File("C:\\Users\\SHABEER AHMED\\Desktop\\exceltask.xlsx");
	FileInputStream stream=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s=w.getSheet("data1");
	Row r=s.getRow(rowno);	
    Cell c=r.getCell(cellno);
		int t=c.getCellType();
		if(t==1) { 
			 value  = c.getStringCellValue();
		}
		else if(t==0) { 
			if(DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				
				SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd-");
				 value = sd.format(d);
				
			}
			else { 
				double d2 = c.getNumericCellValue();
				long l=(long)d2;
				 value = String.valueOf(l);
			}
	
			}
		return value;}}
	
