package testbabatest;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import propertyutility.PropertyUtility;
import testingbabapages.Login_page;

public class Login_Test extends BaseLibrary

{
 Login_page ob;
 
 @BeforeTest
 public void getlaunch()
 {
	 getlaunch(PropertyUtility.getreaddata("url"));
	 ob=new Login_page();
 }
 @Test
 public void gettitle()
 {
	 ob.gettitle();
 }
 
}
