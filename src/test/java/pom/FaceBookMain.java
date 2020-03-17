package pom;

import Excel.BaseClass;
import pojoclass.FaceA;

public class FaceBookMain extends BaseClass {
	public static void main(String[] args) {
		launch("https://www.facebook.com/");
		FaceA a= new FaceA();
		fill(a.getNewacc().get(0),"ahmed");
		fill(a.getNewacc().get(1), "khan");
		fill(a.getNewacc().get(2), "123456");
		fill(a.getNewacc().get(4), "kbfewbhgi");
		
		}

}
