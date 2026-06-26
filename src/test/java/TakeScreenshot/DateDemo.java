package TakeScreenshot;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d= new Date();
		String fileName=d.toString().replace(" ","_").replace(":","_")+".png";
		System.out.println(fileName);
		

	}

}
