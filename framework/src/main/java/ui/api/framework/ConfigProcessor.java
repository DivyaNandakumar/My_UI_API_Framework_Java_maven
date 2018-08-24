package ui.api.framework;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ConfigProcessor {
	public static volatile String SESSION;
	public static volatile String URL;
	public static volatile String MYNTRATENANT;
	public static volatile String JABONGTENANT;
	public static volatile String DBHOST;
	public static volatile String DBPASSWORD;
	public static volatile String DBUSER;
	public static volatile String THREADCOUNT;
	public static volatile ConfigProcessor instance = null;
	
	
	///public void ConfigProcessor
	
	public static void load() throws Exception
	{
		Properties  prop = new Properties();
		//FileInputStream input= new FileInputStream("config.properties");
		InputStream 	input = ConfigProcessor.class.getClassLoader().getResourceAsStream("config.properties");
		
		try {
			// load a properties file
			prop.load(input);
	
			// get the property value and print it out
			SESSION=prop.getProperty("session-id");
			URL= prop.getProperty("url");
			MYNTRATENANT=prop.getProperty("myntratenant");
			JABONGTENANT=prop.getProperty("jabongtenant");
			DBHOST=prop.getProperty("dbhost");			
			DBPASSWORD=prop.getProperty("dbpassword");
			THREADCOUNT= prop.getProperty("threadcount");
	
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static ConfigProcessor getInstance() throws Exception
	{
		if(instance == null)
		{
			synchronized (ConfigProcessor.class) {
				instance = new ConfigProcessor();
				load();
			}
		}
		return instance;
	}
}
