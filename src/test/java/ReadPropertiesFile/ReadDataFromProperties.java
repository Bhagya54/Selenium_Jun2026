package ReadPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	static FileInputStream fis;
	public static void main(String[] args) throws IOException {
		fis=new FileInputStream("./src/test/resources/properties/config.properties");
		Properties config = new Properties();
		config.load(fis);
		
		System.out.println(config.getProperty("browser"));//chrome
		System.out.println(config.getProperty("testsiteurl"));//https://facebook.com

		fis=new FileInputStream("./src/test/resources/properties/or.properties");
		Properties or = new Properties();
		or.load(fis);
		
		System.out.println(or.getProperty("email_NAME"));
	}

}
