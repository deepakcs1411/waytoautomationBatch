package screenshotutility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import baselibrary.BaseLibrary;

public class ScreenshotUtility extends BaseLibrary
{
 public static void getScreenShot(String foldername, String filename)
 {
	 String location= System.getProperty("user.dir");
	 
	 try {
		 
		String path= location+"\\screenshot\\"+foldername+"\\"+filename+".jpeg";
		
		EventFiringWebDriver obj=new EventFiringWebDriver(driver);
	    File scr = obj.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(path)); 
		
	} catch (Exception e) {
		// TODO: handle exception
	}
 }
}
