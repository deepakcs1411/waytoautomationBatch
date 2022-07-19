package testingbabapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.ApplicationUtility;
import baselibrary.BaseLibrary;
import screenshotutility.ScreenshotUtility;
import waitutility.Waitutility;

public class Link_Page extends BaseLibrary{
	
public Link_Page()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@href='#tab_6']")
private WebElement linksBtn;

@FindBy(xpath = "//*[text()='Demo Page']")
private WebElement DemoPageBtn;

@FindBy(xpath = "//*[text()='×']")
private WebElement crossbtn;

public void clickOnLinks()
{
	Waitutility.implicitwait(20);
	click(linksBtn);
	click(DemoPageBtn);	
}
public void opennewWindow()
{
	try {
		ApplicationUtility.getwindownchange(1);
		ScreenshotUtility.getScreenShot("passed", "link");
		click(crossbtn);	
		Thread.sleep(2000);
		driver.close();
		ApplicationUtility.getwindownchange(0);
	} catch (Exception e) {
		System.out.println("Exception in new Window open" +e);
	}
	
	
}

}
