package pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.BaseClass;

public class B extends BaseClass{
	
	public B() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement loc;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hot;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement numroom;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adu;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement btn;

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNumroom() {
		return numroom;
	}

	public WebElement getAdu() {
		return adu;
	}

	public WebElement getChild() {
		return child;
	}
	
	

}
