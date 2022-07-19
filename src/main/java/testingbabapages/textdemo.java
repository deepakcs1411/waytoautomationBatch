package testingbabapages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class textdemo extends BaseLibrary
{
 public textdemo()
 {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath = "//*[text()='Login with Phone/Email']")
 private WebElement elementsbtn;
 
 
public void clickonelements()
{
	elementsbtn.click();
}
 
}
