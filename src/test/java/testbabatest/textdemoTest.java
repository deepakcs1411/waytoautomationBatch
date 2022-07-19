package testbabatest;

import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbabapages.textdemo;

public class textdemoTest extends BaseLibrary
{ 
	textdemo ob;
@Test	
public void clickon()
{
	getlaunch("https://www.makemytrip.com/");
	ob= new textdemo();
	ob.clickonelements();
}
}
