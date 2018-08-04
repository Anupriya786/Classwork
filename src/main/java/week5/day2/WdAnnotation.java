package week5.day2;

import org.testng.annotations.Test;

import wdMethods.SeMethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class WdAnnotation extends SeMethods{
	@Parameters({"url","username","password"})
	@BeforeMethod
  //public void beforeMethod() {
	public void login(String url, String username, String password) {			
		   startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, "DemoSalesManager");
			WebElement elePassword = locateElement("id","password");
			type(elePassword, "crmsfa");
			WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleLogin);
  }

  @AfterMethod
  public void afterMethod() 
  {
	 // public void closeBrowser() {
			// TODO Auto-generated method stub
			//driver.close();
			
		}
  }
