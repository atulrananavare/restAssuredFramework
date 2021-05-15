package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnv {

	public static Map<String, String> fileAndEnv=new HashMap<String, String>();
	public static Properties propMain=new Properties();
	public static Properties propPreSet=new Properties();
	
	public static Map<String, String> envAndFile(){
		
	String environment=System.getProperty("env");
		
		
		
		return fileAndEnv;
		
	}
	
}
