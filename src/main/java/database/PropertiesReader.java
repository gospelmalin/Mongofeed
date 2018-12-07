package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
	
	public String getIpProperty() {
	Properties prop = new Properties();
	InputStream input = null;
	String ip = null;

		try {
	
			input = new FileInputStream("properties.properties");
	
			// load a properties file
			prop.load(input);
	
			// get the property value and print it out
			System.out.println(prop.getProperty("ip"));
			System.out.println(prop.getProperty("port"));
			
			// set property value to return variable
			ip = prop.getProperty("ip");
			//System.out.println("This is the ip-address: " + ip);
	
		} catch (IOException e) {
			System.err.println("An IOException occurred when reading properties. "+e.getMessage());
		}
		return ip;

	}
}
