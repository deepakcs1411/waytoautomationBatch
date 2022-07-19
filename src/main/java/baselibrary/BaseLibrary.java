
package baselibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import waitutility.Waitutility;

public class BaseLibrary 
{
	public static WebDriver driver=null;
	
	public void getlaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\webdriverProject\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='×']")).click();
		driver.findElement(By.xpath("//*[text()='Practice']")).click();
		
	}
	
	public static void waitForVisibility(WebElement el)
	 {
	    WebDriverWait wait=new WebDriverWait(driver, Waitutility.WAIT);
	    wait.until(ExpectedConditions.visibilityOf(el));
	 }

	 public static void alertpresent()
	 {
	    WebDriverWait wait=new WebDriverWait(driver, Waitutility.WAIT);
	    wait.until(ExpectedConditions.alertIsPresent());
	 }
	
	 public static void click(WebElement el)
	 {
	 	waitForVisibility(el);
	 	el.click();
	 }
	 public static void sendkeys(WebElement el, String text)
	 {
	 	waitForVisibility(el);
	 	el.sendKeys(text); 	
	 }
	 public static void clear(WebElement el)
	 {
	 	waitForVisibility(el);
	 	el.clear();
	 }
	@AfterTest
	public void geardown()
	{
	//	driver.quit();
	}

}
