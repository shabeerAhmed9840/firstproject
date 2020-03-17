package pom;

import java.io.IOException;

import Excel.BaseClass;
import pojoclass.A;
import pojoclass.B;
import pojoclass.C;
import pojoclass.D;
import pojoclass.E;

public class finditDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		launch("http://www.adactin.com/HotelApp/index.php");
		A a=new A();
		fill(a.getUser(), "Ahmed7848");
		fill(a.getPass(), "Welcome@123");
		click(a.getLogin());
		
		B b=new B();
		dropDownByIndex(b.getLoc(), 2);
		dropDownBytext(b.getHot(), "Hotel Creek");
		dropDownByValue(b.getRoom(), "Double");
		dropDownByValue(b.getNumroom(), "1");
		dropDownByValue(b.getAdu(), "2");
		dropDownByValue(b.getChild(), "2");
		click(b.getBtn());
		
		C c= new C();
		click(c.getRadio());
		click(c.getConti()); 
		
		D d=new D();
		fill(d.getFirstname(), "shabeer");
		fill(d.getLastname(), "ahmed");
		fill(d.getAddress(), "no49,arck street,USA");
		fill(d.getCredit(), "1234567891234567");
		dropDownByValue(d.getBank(), "AMEX");
		dropDownByValue(d.getMonth(), "1");
		dropDownByValue(d.getYear(), "2020");
		fill(d.getCcv(), "123");
		click(d.getBtn2());
		
		Thread.sleep(10000);
		
		E e=new E();
		attribute(e.getOrder());
		screenShot("Hotel.png");
		
		}

}
