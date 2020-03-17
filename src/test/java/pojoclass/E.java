package pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.BaseClass;

public class E extends BaseClass{
	
	public E() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}

}
