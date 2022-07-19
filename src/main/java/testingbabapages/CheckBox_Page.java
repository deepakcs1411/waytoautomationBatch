package testingbabapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;
import propertyutility.PropertyUtility;
import waitutility.Waitutility;

public class CheckBox_Page extends BaseLibrary{
	
	public CheckBox_Page()
	{
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//*[@href='#tab_2']")
private WebElement checkboxBtn;

@FindBy(xpath = "//*[@src='Checkbox.html']")
private WebElement EnterFrame;

@FindBy(xpath = "//*[@id='myCheck']")
private WebElement MobileBtn;

@FindBy(xpath = "//*[text()='You are selected Mobile']")
private WebElement actualDataMob;

@FindBy(xpath = "//*[@id='mylaptop']")
private WebElement LaptopBtn;

@FindBy(xpath = "//*[text()='You are Selected Laptop']")
private WebElement actualDataLap;

@FindBy(xpath = "//*[@id='mydesktop']")
private WebElement DesktopBtn;

@FindBy(xpath = "//*[text()='You are Selected Desktop']")
private WebElement actualDataDesk;

@FindBy(xpath = "//*[@href='#tab_3']")
private WebElement radioBtn;

@FindBy(xpath = "//*[@value='yes']")
private WebElement radioyesBtn;

@FindBy(xpath = "//*[text()='You have selected yes']")
private WebElement actualradioData;




public void clickonCheckBox()
{
	Waitutility.implicitwait(20);
	click(checkboxBtn);
	driver.switchTo().frame(EnterFrame); // This Code Enter In Frame
}	 

public void clickonMobile()
{
	click(MobileBtn);
	System.out.println("Successfully verified = "+actualDataMob.getText());
    Assert.assertEquals(actualDataMob.getText(), PropertyUtility.getreaddata("mobile_Data"));
   
}
public void clickOnLaptop()
{
	click(LaptopBtn);
    System.out.println("Successfully verified = "+actualDataLap.getText());
    Assert.assertEquals(actualDataLap.getText(), PropertyUtility.getreaddata("Laptop_Data"));
    
}
public void clickOnDesktop()
{
	click(DesktopBtn);
    System.out.println("Successfully verified = "+actualDataDesk.getText());
    Assert.assertEquals(actualDataDesk.getText(), PropertyUtility.getreaddata("Desktop_Data"));
    driver.switchTo().defaultContent(); //This Code Exit in frame    
}

public void clickonRadioBtn()
{
	Waitutility.implicitwait(20);
	click(radioBtn);
	click(radioyesBtn);
	System.out.println("Successfully verified = "+actualradioData.getText());
	Assert.assertEquals(actualradioData.getText(), PropertyUtility.getreaddata("Radio_Data"));
}
}


