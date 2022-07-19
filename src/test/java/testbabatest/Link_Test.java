package testbabatest;

import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbabapages.Link_Page;

public class Link_Test extends BaseLibrary
{
	Link_Page ob;
@Test(priority = 1)	
public void clickonLink() 
{
	ob = new Link_Page();
	ob.clickOnLinks();
}
@Test(priority = 2)
public void changeWindow()
{
	ob.opennewWindow();
}
}
