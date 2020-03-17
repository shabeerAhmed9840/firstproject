package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class BaseClass {
	public	static WebDriver driver;
	public	static String value=null;
	public  static Actions a;
	public  static Alert a2;
	public static Select s;
	public static File loc;
	// to launch a browser
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}
	// to sendkeys
	public static void fill(WebElement e,String s) {
		e.sendKeys(s);
		}
	//to click
	public static  void click(WebElement e) {
		e.click();
		}
	//to insert  excel
     public static void fillExcel(String s) {
		 loc=new File(s);
      }
	//to getdata from excel
    public static String getDataFromExcel(String sheetname,int rowno,int cellno) throws IOException {
		
	FileInputStream stream=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s=w.getSheet(sheetname);
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
		return value;}
	//to right click
	public static void rightClick(WebElement e) {
	 a=new Actions(driver);
	  a.contextClick(e).perform();
    }
	//to double click
	public static void doubleClick(WebElement e) {
		 a=new Actions(driver);
        a.doubleClick(e).perform();;
    }
	//to move to element
	public static void movetoElement(WebElement e) {
		 a=new Actions(driver);
         a.moveToElement(e).perform();
   }
	//to drag and drop
	public static  void dragAndDrop(WebElement src,WebElement des) {
		 a=new Actions(driver);
		 a.dragAndDrop(src, des).perform();
  } 
	// to accept the alert
	public static void accept() {
		a2=driver.switchTo().alert();
		a2.accept();
  }  
	// to dismiss the alert
	public static void dismiss() {
		a2=driver.switchTo().alert();
		a2.dismiss();
  } 
	// to sendkeys and accept prompt
	public static void prompt(String input) {
		a2=driver.switchTo().alert();
		a2.sendKeys(input);
		a2.accept();
  } 
	// to drop down by index
	public static void dropDownByIndex(WebElement e,int num) {
		s=new Select(e);
		s.selectByIndex(num);
		}
	// to drop down by value
	public static void dropDownByValue(WebElement e,String sum) {
		s=new Select(e);
		s.selectByValue(sum);
		} 
	// to drop down by text
	public static  void dropDownBytext(WebElement e,String sum) {
		s=new Select(e);
		s.selectByVisibleText(sum);
		
		} 
	// to get attribute
	public static void attribute(WebElement e) {
		String text = e.getAttribute("value");
		System.out.println(text);
		} 
	// to get text
	public static void getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
		 } 
	// to get current url
	public static void currentUrl(WebDriver driver) {
		String url = driver.getCurrentUrl();
		System.out.println(url);

		}
	// to get screenshot
	public static void screenShot(String name) throws IOException {
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
File desc=new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\screenshot\\"+name);
FileUtils.copyFile(src, desc);
	}
	
	public static void windowHandel(WebDriver driver
			) {
		String par=driver.getWindowHandle();
		System.out.println(par);
		
		Set<String>child=driver.getWindowHandles();
		System.out.println(child);
		
		for(String child2:child) {
			if(!par.equals(child2)) {
				driver.switchTo().window(child2);
		}}}
	













}
	
	
	
	
		
	
	
	




	
