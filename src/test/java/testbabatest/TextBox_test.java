 package testbabatest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.PropertyUtility;
import testingbabapages.Textbox_Page;

public class TextBox_test extends BaseLibrary
{
	
	Textbox_Page ob;
	
	@BeforeTest
	public void getlaunch()
	{
		getlaunch(PropertyUtility.getreaddata("url"));
		ob=new Textbox_Page();
	}

	@Test(priority = 0)
	public void clickonelements()
	{
		ob.clickonelements();
	}
	@Test(priority = 1)
	public void clicktextbox()
	{
		ob.clicktextbox();
	}
	@Test(priority = 2)
	public void tc01()
	{
		ob.tc01();
	}
	@Test(priority = 3)
	public void getverify()
	{
		ob.getverify();
	}
	
	
}
