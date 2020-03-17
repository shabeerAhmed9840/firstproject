package company;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws IOException, AWTException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver(); driver.get("http://www.fb.com/");
		 * WebElement e=driver.findElement(By.id("email")); e.sendKeys("xyz@gmail.com");
		 * WebElement e2=driver.findElement(By.id("pass")); e2.sendKeys("12345678");
		 * WebElement e3=driver.findElement(By.id("u_0_ev")); e3.click(); Alert a =
		 * driver.switchTo().alert(); a.toString()
		 * 
		 */
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		WebElement emailBoc = driver.findElement(By.id("email"));
		emailBoc.sendKeys("mustag.s.ahmed@gmail.com");

		Robot r = new Robot();
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofMillis(10)).ignoring(Throwable.class);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.id("mail")));

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);

	}
}
