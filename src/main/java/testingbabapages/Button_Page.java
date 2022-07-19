package testingbabapages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import applicationutility.ApplicationUtility;
import baselibrary.BaseLibrary;
import propertyutility.PropertyUtility;
import waitutility.Waitutility;

public class Button_Page extends BaseLibrary {
	public Button_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@href='#tab_5']")
	private WebElement buttons;

	@FindBy(xpath = "//*[@ondblclick='doubletext()']")
	private WebElement doubleclickBtn;

	@FindBy(xpath = "//*[@oncontextmenu='righttext()']")
	private WebElement rightclickBtn;

	@FindBy(xpath  = "//*[@onclick='clicktext()']")
	private WebElement clickmeBtn;

	@FindBy(xpath = "//*[@class='btn-content']/p")
	private List<WebElement> data;

	public void clickonButtons() {
		Waitutility.implicitwait(50);
		click(buttons);

	}

	public void doubleClick() {
		try {
			Thread.sleep(2000);
			ApplicationUtility.doubleclick(doubleclickBtn);
		} catch (Exception e) {
			System.out.println("Exception in doubleclick" + e);
		}

	}

	public void rightClick() {
		try {
			Thread.sleep(2000);
			ApplicationUtility.rightclick(rightclickBtn);
		} catch (Exception e) {
			System.out.println("Exception in rightclick" + e);
		}

	}

	public void onlyClick() {
		try {
			Thread.sleep(2000);
			click(clickmeBtn);
		} catch (Exception e) {
			System.out.println("Exception in onlyclick" + e);
		}
	}

	   public void buttonverify()  
	   {  ArrayList<String> actualData = new ArrayList<String>(); 
	   
	        for(int i=0;i<=data.size()-1;i++) 
	      {
	        	actualData.add(data.get(i).getText()); 
	         }
	  ArrayList<String> expecteddata = new ArrayList<String>();  
	  expecteddata.add(PropertyUtility.getreaddata("Double_click"));
	  expecteddata.add(PropertyUtility.getreaddata("Right_click")); 
	  expecteddata.add(PropertyUtility.getreaddata("only_click")); 
	  
	  for(String dd:actualData)  
		  for(String ee:expecteddata)  
	  
	  {     Assert.assertEquals(dd, ee); 
	        expecteddata.remove(0); 
	        System.out.println("Successfully verified = " +ee );
	        break;
	 
}
	   }
}
	  
	  
	  
	  
