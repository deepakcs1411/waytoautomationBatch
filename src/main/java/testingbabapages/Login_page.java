package testingbabapages;

import baselibrary.BaseLibrary;

public class Login_page extends BaseLibrary
{
	public void gettitle()
	{
		String title =driver.getTitle();
		System.out.println("Title is " +title);
	}

}

