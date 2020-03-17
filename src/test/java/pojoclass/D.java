package pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.BaseClass;

public class D extends BaseClass{
	
	public D() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']") 
	private WebElement address;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement credit;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement bank;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement ccv;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement btn2;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit() {
		return credit;
	}
	public WebElement getBank() {
		return bank;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBtn2() {
		return btn2;
	}
	

}
