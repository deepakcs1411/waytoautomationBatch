package testingbabapages;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;
import excelutility.Excelutility;
import waitutility.Waitutility;

public class WebTables_Page extends BaseLibrary
{
	public WebTables_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@href='#tab_4']")
	private WebElement webTableBtn;	
	
	@FindBy(xpath = "//*[@src='Webtable.html']")
	private WebElement EnterFrame;

	@FindBy(xpath = "//*[@name='name'][@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement EnterFirstName;
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement EnterFirstEMail;
	
	@FindBy(xpath = "//*[text()='Save']")
	private WebElement clickSaveBtn;
	
	@FindBy(xpath = "//*[@class='table table-bordered data-table']/tbody/tr/td[1]")
	private List<WebElement> actualDataName;
	
	@FindBy(xpath = "//*[@class='table table-bordered data-table']/tbody/tr/td[2]")
	private List<WebElement> actualDataMail;
	
	@FindBy(xpath = "(//*[text()='Edit'])[1]")
	private WebElement editfirstBtn;
	
	@FindBy(xpath = "//*[@name='edit_name']")
	private WebElement editfirstNameBtn;
	
	@FindBy(xpath = "//*[@name='edit_email']")
	private WebElement editfirstEmailBtn;
	
	@FindBy(xpath = "//*[text()='Update']")
	private WebElement updateFirstBtn;
	
	@FindBy(xpath = "(//*[text()='Edit'])[2]")
	private WebElement editsecondBtn;
	
	@FindBy(xpath = "//*[@name='edit_name']")
	private WebElement editsecondNameBtn;
	
	@FindBy(xpath = "//*[@name='edit_email']")
	private WebElement editsecondEmailBtn;
	
	@FindBy(xpath = "//*[text()='Update']")
	private WebElement updatesecondBtn;
	
	
public void clickOnWebTable()
{
	Waitutility.implicitwait(20);
	click(webTableBtn);
	driver.switchTo().frame(EnterFrame); // This Code Enter In Frame
	for(int i=1;i<=2;i++) {
		sendkeys(EnterFirstName, Excelutility.excelreaddata(i, 0));
		sendkeys(EnterFirstEMail, Excelutility.excelreaddata(i, 1));
		click(clickSaveBtn);  
	}
}
public void getvalidate()
{
	ArrayList<String> expected=new ArrayList<String>();
	ArrayList<String> actul=new ArrayList<String>();
	for(int i=1;i<=2;i++) {
		expected.add(Excelutility.excelreaddata(i,0));
		expected.add(Excelutility.excelreaddata(i,1));
	}
	

	for(int j=0;j<=actualDataName.size()-1;j++) {
		actul.add(actualDataName.get(j).getText())	;
		actul.add(actualDataMail.get(j).getText())	;
	
	
}
		
	for(String dd:expected) {
		for(String ee:actul) {
			Assert.assertEquals(dd, ee);
			actul.remove(0);
			break;
			
		}
	}
   
}	
public void updateddata()
{
	try {
		Waitutility.implicitwait(20);
		click(editfirstBtn);
		clear(editfirstNameBtn);
		sendkeys(editfirstNameBtn, Excelutility.excelreaddata(1, 2));
		clear(editfirstEmailBtn);
		sendkeys(editfirstEmailBtn, Excelutility.excelreaddata(1, 3));
		click(updateFirstBtn);
		click(editsecondBtn);
		clear(editsecondNameBtn);
		sendkeys(editsecondNameBtn, Excelutility.excelreaddata(2, 2));
		clear(editsecondEmailBtn);
		sendkeys(editsecondEmailBtn, Excelutility.excelreaddata(2, 3));
		click(updatesecondBtn);
		driver.switchTo().defaultContent();
		Waitutility.implicitwait(20);
		
	} catch (Exception e) {
		System.out.println("Exception in updated data" +e);
	}
	
	
	
}
}
