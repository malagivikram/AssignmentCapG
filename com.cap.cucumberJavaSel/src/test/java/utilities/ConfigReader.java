package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties property;
	private static String configPath = "src/test/resources/config.properties";

	public static void initializePropertyFile() {
		
		property = new Properties();
		
		try {
			InputStream input = new FileInputStream(configPath);
			property.load(input);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
}
