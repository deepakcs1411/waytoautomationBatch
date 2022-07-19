package testingbabapages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;
import propertyutility.PropertyUtility;

public class Textbox_Page extends BaseLibrary
{
	public Textbox_Page()
	{
		PageFactory.initElements(driver, this);	
	}
	
  @FindBy(xpath  = "//*[@data-target='#elements']")
  private WebElement elements;
  
  @FindBy(xpath = "//*[text()='text box']")
  private WebElement textbox;
  
  @FindBy(xpath = "//*[@id='fullname1']")
  private WebElement name;
  
  @FindBy(xpath = "//*[@id='fullemail1']")
  private WebElement email;
  
  @FindBy(xpath = "//*[@id='fulladdresh1']")
  private WebElement currentadd;
  
  @FindBy(xpath = "//*[@id='paddresh1']")
  private WebElement permanentadd;
  
  @FindBy(xpath = "//*[@value='Submit']")
  private WebElement submitbtn;
  
  @FindBy(xpath = "//*[@class='col-md-6 mt-5']/label")
  private List<WebElement> actualdata;
  
  public void clickonelements()
  {
	  try 
	  {
		  elements.click();
	     } 
	  catch (Exception e) 
	  {
		System.out.println("Exception in clickonelments" +e);
	    }	 
  }
  public void clicktextbox()
  {
	  try {
		textbox.click();
	       }  
	  catch (Exception e) 
	  {
		System.out.println("Exception in clicktextbox" +e);
	}
  }
  
  public void tc01() 
  {
	  name.sendKeys(PropertyUtility.getreaddata("Name")); 
	  email.sendKeys(PropertyUtility.getreaddata("Email"));
	  currentadd.sendKeys(PropertyUtility.getreaddata("CurrentAddress"));
	  permanentadd.sendKeys(PropertyUtility.getreaddata("PermanentAddress"));
	  submitbtn.click();	
	
  }	 
  
  public void getverify()
  {
	  SoftAssert assertt=new SoftAssert();
	  ArrayList<String> expecteddata=new ArrayList<String>();
	  expecteddata.add(PropertyUtility.getreaddata("Name"));
	  expecteddata.add(PropertyUtility.getreaddata("Email"));
	  expecteddata.add(PropertyUtility.getreaddata("CurrentAddress"));
	  expecteddata.add(PropertyUtility.getreaddata("PermanentAddress"));
	  
	  ArrayList<String> actual= new ArrayList<String>();
	  
	  for(int i=1;i<=actualdata.size()-1;i++)
	  {
		 actual.add(actualdata.get(i).getText());
		 i++;
	  }
	  
	  for(String dd:actual) {
		  for(String ee:expecteddata) {
			  
			  Assert.assertEquals(dd,ee);
			 expecteddata.remove(0);
			 if(dd.equals(ee)) {
				 System.out.println("match = "+dd);
				 break;
			 }
			 else {
				 System.out.println("not match");
			  
			  }
		  }
	  }
	  assertt.assertAll();
	 
  }
 
 
  }
  

