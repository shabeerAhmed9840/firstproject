package iq.SeleiniumQustions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Excel.BaseClass;

public class SnapDeal extends BaseClass {
	public static void main(String[] args) {
		launch("https://www.flipkart.com/");
		/*
		 * ChromeOptions options=new ChromeOptions(); ChromeOptions addArguments =
		 * options.addArguments("--disable-notifications");
		 */
		WebElement closeX = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		click(closeX);
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		fill(searchBox, "hp laptop");
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		click(btnSearch);
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='_2cLu-l']")));
		List<WebElement> lstProdu = driver.findElements(By.xpath("//a[@class='_2cLu-l']"));

		List<WebElement> shirtPrice = driver.findElements(By.xpath("//div[@class'_1vC40E']"));
		int size = shirtPrice.size();
		String[] prodPrice = new String[shirtPrice.size()];
		int n = prodPrice.length;

		for (int i = 0; i < n; i++) {
			prodPrice[i] = shirtPrice.get(i).getText();

			float[] ap = new float[n];
			int k = 0;
			for (int j = 0; j < n; j++) {
				String temp = prodPrice[j].substring(1);
				if (temp.contains(",")) {
					String replace = temp.replace(",", "");
					ap[j] = Float.parseFloat(replace);
					continue;

				}
				ap[j] = Float.parseFloat(temp);
				k++;
			}
			float temp = 0;
			WebElement bal = null;
			for (int x = 0; x < ap.length; x++) {
				for (int y = 0; y < ap.length; y++) {
					if (ap[x] > ap[y]) {
						temp = ap[x];
						ap[x] = ap[y];
						ap[y] = temp;
						bal = lstProdu.get(x);
						lstProdu.set(x, lstProdu.get(y));
						lstProdu.set(y, bal);

					}

				}

			}
			for (float f : ap) {
				System.out.println("" + f + "");

			}
		}
		driver.quit();
	}

}
