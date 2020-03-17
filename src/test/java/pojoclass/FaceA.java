package pojoclass;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Excel.BaseClass;

import org.openqa.selenium.support.FindAll;

public class FaceA extends BaseClass {
	public FaceA() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(id = "email"), @FindBy(xpath = "//input[@type='email']") })
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindAll({ @FindBy(id = "pass"), @FindBy(xpath = "//input[@type='password']") })
	private List<WebElement> pass;

	@FindAll({ @FindBy(xpath = "//input[@value='Log In']") })
	private WebElement login;

	@FindAll({ @FindBy(xpath = "//input[@class='inputtext _58mg _5dba _2ph-']") })
	private List<WebElement> newacc;

	public List<WebElement> getNewacc() {
		return newacc;
	}

}
