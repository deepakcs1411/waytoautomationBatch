package applicationutility;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baselibrary.BaseLibrary;

public class ApplicationUtility extends BaseLibrary
{
public static void doubleclick(WebElement ele)
{
	Actions act=new Actions(driver);
	act.doubleClick(ele).perform();
}
public static void rightclick(WebElement ele)
{
   Actions act=new Actions(driver);
   act.contextClick(ele).perform();
}
public static void getwindownchange(int tabno)
{
	Set<String> set = driver.getWindowHandles();
	ArrayList<String> tabs = new ArrayList<String> (set);
	driver.switchTo().window(tabs.get(tabno));	
}
public static void fileupload(String fileloc)
{
	try {
		
		StringSelection sel = new StringSelection(fileloc);
	    Clipboard clipboard	=Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(sel, null);
	    Robot robot= new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.delay(250);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
		
	} catch (Exception e) 
	{
		System.out.println("Exception in fileuploda data" +e);
	}
}

}
