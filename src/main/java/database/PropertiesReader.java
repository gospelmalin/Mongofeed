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
	
			// get the property value for ip-address and print it out
			System.out.println(prop.getProperty("ip"));
			
			// set property value to return variable
			ip = prop.getProperty("ip");
	
		} catch (IOException e) {
			System.err.println("An IOException occurred when reading properties. "+e.getMessage());
		}
		return ip;

	}
	
	public String getPortProperty() {
		Properties prop = new Properties();
		InputStream input = null;
		String port = null;

			try {
		
				input = new FileInputStream("properties.properties");
		
				// load a properties file
				prop.load(input);
		
				// get the property value for port and print it out
				System.out.println("Port is: " + prop.getProperty("port"));
				
				// set property value to return variable
				port = prop.getProperty("port");
		
			} catch (IOException e) {
				System.err.println("An IOException occurred when reading properties. "+e.getMessage());
			}
			return port;

		}
}
