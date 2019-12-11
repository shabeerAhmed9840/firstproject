package Junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuiteA {
	static WebDriver driver;
	@BeforeClass
	public static  void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@AfterClass
	public static void quitBrowser() {
		driver.quit();  }
	@Test
	public void test3() {
		driver.get("https://facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mustag.s.ahmed@gmail.com ");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345678");
		
		WebElement button = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		button.click();
		
		Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110"));	
		}

	@Test
	public void test4() {
		driver.get("https://facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("12345678");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("password");
		
		Assert.assertEquals("passwords",password.getAttribute("value"));
		
		WebElement button = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		button.click();
		}
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
		}
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);
		}

	}
