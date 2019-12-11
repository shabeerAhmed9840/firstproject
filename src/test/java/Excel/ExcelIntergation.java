package Excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelIntergation extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		for(int a=0;a<3;a++) {
		launch("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		fill(user, getDataFromExcel(a,0));
	   WebElement password = driver.findElement(By.id("pass"));
	   fill(password, getDataFromExcel(a, 1));
		WebElement button = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		click(button);
		driver.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
