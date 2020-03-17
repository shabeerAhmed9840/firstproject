package pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.BaseClass;

public class C extends BaseClass{
	 public C() {
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement conti;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getConti() {
		return conti;
	}
	
	

}
