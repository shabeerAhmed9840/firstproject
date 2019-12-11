package company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com/");
		WebElement e=driver.findElement(By.id("email"));
		e.sendKeys("xyz@gmail.com");
		WebElement e2=driver.findElement(By.id("pass"));
		e2.sendKeys("12345678");
		WebElement e3=driver.findElement(By.id("u_0_ev"));
		e3.click();
		
		


}
}
