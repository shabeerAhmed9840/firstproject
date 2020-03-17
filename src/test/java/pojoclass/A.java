package pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.BaseClass;

public class A extends BaseClass{
		
		public A() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//input[@name='username']")
		private WebElement user;

		@FindBy(xpath="//input[@name='password']")
		private WebElement pass;
		
		@FindBy(xpath="//input[@name='login']")
		private WebElement login;

		public WebElement getUser() {
			return user;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLogin() {
			return login;
		}
		
		
		
		

	}


