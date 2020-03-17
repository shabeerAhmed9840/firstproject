package Excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelIntergation extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launch("https://www.facebook.com/");
		fillExcel("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\excel\\badman.xlsx");
		WebElement user = driver.findElement(By.id("email"));
		fill(user, getDataFromExcel("Data1", 1,0));
	   WebElement password = driver.findElement(By.id("pass"));
	   fill(password, getDataFromExcel("Data1", 1, 1));
		WebElement button = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		click(button);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
