package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelementsize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/saravananjeganathan/seljuly/Selenium/drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.close();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		List<WebElement> dropdown=driver.findElementsByTagName("Select");
		int size = dropdown.size();
		System.out.println(size);

	}
}
