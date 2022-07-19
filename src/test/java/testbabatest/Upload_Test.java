package testbabatest;

import org.testng.annotations.Test;

import testingbabapages.upload_Page;

public class Upload_Test 
{
	upload_Page ob;
@Test(priority = 1)	
public void clickonupload()
{
	ob = new upload_Page();
	ob.clickonupload();
}
@Test(priority = 2)
public void selectfile() 
{
  ob.selectFile();	
}
}
