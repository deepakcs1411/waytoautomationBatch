package testbabatest;

import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbabapages.CheckBox_Page;

public class CheckBox_Test extends BaseLibrary
{
	
	CheckBox_Page ob;
@Test(priority = 1)
public void clickonCheckBox()
{
	ob=new CheckBox_Page();
	ob.clickonCheckBox();
}
@Test(priority = 2)
public void clickonMobile()
{
	ob=new CheckBox_Page();
	ob.clickonMobile();
}
@Test(priority = 3)
public void clickonLaptop()
{
	ob=new CheckBox_Page();
	ob.clickOnLaptop();
}
@Test(priority = 4)
public void clickonDesktop()
{
	ob=new CheckBox_Page();
	ob.clickOnDesktop();
}

@Test(priority = 5)
public void clickonRadioBtn()
{
	ob=new CheckBox_Page();
	ob.clickonRadioBtn();
}

}
