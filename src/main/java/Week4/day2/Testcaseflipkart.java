package Week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcaseflipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saravananjeganathan/seljuly/Selenium/drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions builder= new Actions(driver);
		WebElement flipObj1= driver.findElementByXPath("//a[@title='TVs & Appliances']");
		WebElement flipObj2= driver.findElementByXPath("//a[@title='Television']");
		System.out.println(flipObj1);
		System.out.println(flipObj2);
		//Actions builder2= new Actions(driver);
	    builder.moveToElement(flipObj1).pause(2000).click(flipObj2).perform();
	   WebElement ele =  driver.findElementByXPath("//div[text()='Samsung']/preceding-sibling::div");
	  
	   ele.click();
	   //builder.click(ele).perform();
	   // driver.findElementByXPath("//div[text()='Samsung']/preceding-sibling::div").click();
	   Thread.sleep(3000);
	  // driver.findElementByXPath("//div[text()='Samsung']/preceding-sibling::div").click();
	  //  driver.close();
	}

}
