package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alertsandframes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/saravananjeganathan/seljuly/Selenium/drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		driver.findElementById("tryhome").click();
Set<String> allWindowHandles = driver.getWindowHandles();
System.out.println(allWindowHandles);
List<String> allListWindowHandles = new ArrayList<String>();
allListWindowHandles.addAll(allWindowHandles);
//System.out.println(allWindowhandles);
		//driver.findElementByXPath("")
		//driver.findElementByLinkText("Try it Yourself »").click();
		//driver.switchTo().frame("iframeResult");
		//driver.findElementByXPath("//button[text()='Try it']").click();
		//Thread.sleep(2000);
		//driver.switchTo().alert();
		
		//WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("crmsfa");
		//driver.findElementByClassName("decorativeSubmit").click();
		//driver.close();
		//driver.findElementByLinkText("CRM/SFA").click();
		//driver.findElementByLinkText("Create Lead").click();
		//List<WebElement> dropdown=driver.findElementsByTagName("Select");
		//int size = dropdown.size();
		//System.out.println(size);
		

	}
}
