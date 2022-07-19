package waitutility;

import java.util.concurrent.TimeUnit;

import baselibrary.BaseLibrary;

public class Waitutility extends BaseLibrary
{
  public static final long WAIT=10;
  
  public static void implicitwait(int time)
  {  
	  driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS); 
	   }
}
