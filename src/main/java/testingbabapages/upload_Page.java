package testingbabapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.ApplicationUtility;
import baselibrary.BaseLibrary;
import extentlisteners.ExtentListeners;
import waitutility.Waitutility;

public class upload_Page extends BaseLibrary
{
 public upload_Page()
 {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath  = "//*[@data-target='#elements']")
 private WebElement elements;
 
 @FindBy(xpath = "//*[@href='#tab_8']")
 private WebElement uploadBtn;
 
 @FindBy(xpath = "//*[text()='Select a file']")
 private WebElement selectfile;


public void clickonupload()
{
	Waitutility.implicitwait(20);
	click(elements);
	click(uploadBtn);
	click(selectfile);
	
}
public void selectFile()
{
	try {
		Thread.sleep(2000);
		String path ="C:\\Users\\Priya\\eclipse-workspace\\webdriverProject\\testdata\\Important_Appium_Interview_Questions.pdf";
		ApplicationUtility.fileupload(path);
	} catch (Exception e) {
		System.out.println("Exception in file upload" +e);
	}
	
		
}
}