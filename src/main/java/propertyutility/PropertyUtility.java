package propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility 
{
 static String path ="C:\\Users\\Priya\\eclipse-workspace\\webdriverProject\\testdata\\confiq.properties";
 
 public static String getreaddata(String key)
 {
	 String value="";
	 try {
		 FileInputStream fis=new FileInputStream(path);
		 Properties props=new Properties();
		 props.load(fis);
		 value=props.getProperty(key);
		 	
	} catch (Exception e) 
	 {
		System.out.println("Issue in GetRead Data" +e);
	}
	return value;
	 
 }
}
