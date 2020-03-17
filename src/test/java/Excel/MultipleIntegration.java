package Excel;

import java.util.List;
import java.io.IOException;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleIntegration extends BaseClass {
	public static void main(String[] args) throws IOException {

		launch("https://www.facebook.com/");
		fillExcel("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\Employee\\excel\\badman.xlsx");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement phno = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
	    WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	  /*  WebElement[][] wb= new WebElement[2][2];
	    wb[0][0]=firstname;
	    wb[0][1]=lastname;
	    wb[1][0]=phno;
	    wb[1][1]=pass; */  
	    List<WebElement>li=new LinkedList<WebElement>();
	    li.add(firstname);
	    li.add(lastname);
	    li.add(phno);
	    li.add(pass);
	    int k=0;
	    for(int i=0; i<4;i++) {
	    	for(int j=0;j<1;j++) {
	    		   fill(li.get(k),getDataFromExcel("Data1", i, j));
	    		   k++;
	    	}
	    }
	}

}
