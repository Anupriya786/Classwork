package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testleafassign1 extends WdMethods
{
	@Test
	public void assign() 
	{
//		System.setProperty("webdriver.chrome.driver", "/Users/saravananjeganathan/seljuly/Selenium/drivers/chromedriver");
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().fullscreen();
//		driver.get("http://leaftaps.com/opentaps");
//		driver.findElementById("username").sendKeys("demosalesmanager");
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("crmsfa");
//		driver.findElementByClassName("decorativeSubmit").click();
//		//driver.close();
//		driver.findElementByLinkText("CRM/SFA").click();
//		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CapGemini");
		driver.findElementById("createLeadForm_firstName").sendKeys("Saravanan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jeganathan");
		WebElement source = driver.findElementById("createLeadForm_industryEnumId");
		//Select is a class to get the multiple values in the list
		Select dd = new Select(source);
		dd.selectByIndex(2);
		WebElement marketc = driver.findElementById("createLeadForm_marketingCampaignId");
		//Selecting all options
		Select mc = new Select(marketc);
		mc.selectByIndex(2);
		List<WebElement> markc = mc.getOptions();
		for (WebElement webElement : markc) 
		{
			System.out.println(webElement.getText());
		}
	}
}
