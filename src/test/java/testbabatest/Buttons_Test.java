package testbabatest;

import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbabapages.Button_Page;

public class Buttons_Test extends BaseLibrary
{
	Button_Page ob;
@Test(priority = 1)
public void clickonButtons()
{   
	ob= new Button_Page();
	ob.clickonButtons();
	ob.doubleClick();	
}
@Test(priority = 2)
public void rightclick()
{
	ob= new Button_Page();
	ob.rightClick();
}
@Test(priority = 3)
public void onlyclick()
{
	ob= new Button_Page();
	ob.onlyClick();	
}
@Test(priority = 4)
public void verifyButtons()
{
	ob= new Button_Page();
	ob.buttonverify();
}
}
