package testbabatest;

import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbabapages.WebTables_Page;

public class WebTables_Test extends BaseLibrary
{
	WebTables_Page ob;
	
@Test(priority = 1)	
public void clickOnWeb()
{
	ob=new WebTables_Page();
	ob.clickOnWebTable();
	
}
@Test(priority = 2)
public void getvalidate() 
{  
	ob=new WebTables_Page();
	ob.getvalidate();
}
@Test(priority = 3)
public void updateData()
{
	ob=new WebTables_Page();
	ob.updateddata();
}
	

}
