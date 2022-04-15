package all;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Getproperties {

	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		FileInputStream input = new FileInputStream("C:\\eclipse_ origi\\framework\\src\\main\\resources\\readingproperties\\config.properties");
		property.load(input);
		System.out.println(property.getProperty("Browser"));
		

	}

}
