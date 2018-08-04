package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
public	RemoteWebDriver driver ;
	int i = 1;
	
	
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/saravananjeganathan/seljuly/Selenium/drivers/chromedriver");
			 driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			 driver = new FirefoxDriver();		
		}
		driver.manage().window().fullscreen();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" is Launched Successfully");
		takeSnap();
		
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "linktext": return driver.findElementByLinkText(locValue);
			case "classname": return driver.findElementByClassName(locValue);
			case "tagname": return driver.findElementByClassName(locValue);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("NoSuchElementException has occured");
			throw new RuntimeException();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has occured");
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();	
		}
		
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriverException has occured");
		}
		finally
		{
		takeSnap();
		}
	}

	
	
	public void click(WebElement ele) {
	try {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
	}
	finally
	{
	takeSnap();		
	}
	}

	public String getText(WebElement ele) {
		
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = ele.getText();
			System.out.println("The text is "+text);
		} catch (Exception e) {
			
		}
		finally
		{
		takeSnap();
		}
		return text;
	}
	

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		 try {
			Select dd = new Select(ele);
			 dd.selectByVisibleText(value);
			 System.out.println("Value selected from dropdown");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		 finally
		 {
		 takeSnap();
	}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		 Select dd = new Select(ele);
		 dd.selectByIndex(i);
		 System.out.println("Value selected from dropdown ");
		 takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		boolean var;
			var = false;
			try {
			String title = driver.getTitle();
			if(title.equals(expectedTitle))
			{
				System.out.println("Title is matching");
				var = true;
			}
			else
			{
				System.out.println("Title is not matching");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		takeSnap();
		}
		return var;
		
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text1 = ele.getText();
		if(expectedText.equals(text1))
		{
			System.out.println("Text is matching");
		}
		else
		{
			System.out.println("Text is not matching");
		}
		takeSnap();
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
		String text1 = ele.getText();
		if(expectedText.contains(text1))
		{
			System.out.println("Text is matching");
		}
		else
		{
			System.out.println("Text is not matching");
		}
		takeSnap();
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String att = ele.getAttribute(attribute);
		if(att.equals(value))
				{
			System.out.println("Attribute is matching");
				}
		else
		{
			System.out.println("Attribute is not matching");
		}
		takeSnap();
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String att = ele.getAttribute(attribute);
		if(att.contains(value))
				{
			System.out.println("Attribute is matching");
				}
		else
		{
			System.out.println("Attribute is not matching");
		}
		takeSnap();
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
	ele.isSelected();
		if(ele.isSelected()==true)
		{
			System.out.println(ele+ "is selected" );
		}
		else
		{
			System.out.println(ele+ "is not selected" );
		}
		takeSnap();
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		ele.isDisplayed();
		if(ele.isDisplayed()==true)
		{
			System.out.println(ele+ "is displayed" );
		}
		else
		{
			System.out.println(ele+ "is not displayed" );
		}
		takeSnap();
	}

	public void switchToWindow(int index) {
		try {
			Set<String> all = driver.getWindowHandles();
			 List<String> allList = new ArrayList<String>();
			allList.addAll(all);
			driver.switchTo().window(allList.get(index));
		} catch (NoSuchWindowException e) {
			System.out.println("NoSuchWindowException has occured");
		}
		finally
		{
	takeSnap();
}
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(ele);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		takeSnap();	
	}
	}
	
	public void switchToFrame(String locvalue) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(locvalue);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		takeSnap();	
	}
	}
	
	public void switchToDefaultContent() {
		
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void switchToAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert();
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void switchToAlertHandling() {
//		// TODO Auto-generated method stub
//		try {
//			Actions builder=new Actions();
//
//		} catch (NoAlertPresentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return driver.switchTo().alert().getText();
		
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	
	public void maximize() {
		driver.manage().window().maximize();
		takeSnap();
	}

}