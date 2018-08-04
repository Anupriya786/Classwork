package Week4.day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Testcaseuserreg extends SeMethods{

	@Test
	public void startApp() throws InterruptedException 
	{
		startApp("chrome", "http://www.flipkart.com");
		Thread.sleep(3000);
		WebElement closePopUp=locateElement("xpath", "//button[text()='✕']");
		closePopUp.click();
		
	}
	
}


 
