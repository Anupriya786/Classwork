package week2.day2;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Irctcautomation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/saravananjeganathan/seljuly/Selenium/drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("userRegistrationForm:userName").sendKeys("saravanaan32");
		WebElement password = driver.findElement(By.id("userRegistrationForm:password"));
		password.sendKeys("Saibaba030681#");
		WebElement confPassword = driver.findElement(By.id("userRegistrationForm:confpasword"));
		confPassword.sendKeys("Saibaba030681#");
		WebElement secQues = driver.findElementById("userRegistrationForm:securityQ");

		//Selecting all options
		Select sq = new Select(secQues);
		sq.selectByIndex(2);
		List<WebElement> secQ = sq.getOptions();
		for (WebElement webElement : secQ) 
		{
			System.out.println(webElement.getText());
		}
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Guru");
		WebElement lang = driver.findElementById("userRegistrationForm:prelan");
		//Selecting all options
		Select lan = new Select(lang);
		lan.selectByIndex(1);
		List<WebElement> webLan = sq.getOptions();
		for (WebElement webElement : webLan) 
		{
			System.out.println(webElement.getText());
		}
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Saravanan");
		//driver.findElementById("userRegistrationForm:gender").isSelected();
		
		//Selecting the Gender
		List  oRadioButton = driver.findElements(By.name("userRegistrationForm:gender"));
		// Create a boolean variable which will hold the value (True/False)
		boolean bValue = false;
		// This statement will return True, in case of first Radio button is selected
		bValue = ((WebElement) oRadioButton.get(0)).isSelected();
		// This will check that if the bValue is True means if the first radio button is selected
		if(bValue = true)
		{
			// This will select Second radio button, if the first radio button is selected by default
			((WebElement) oRadioButton.get(0)).click();
		}
		else
		{
			// If the first radio button is not selected by default, the first will be selected

			((WebElement) oRadioButton.get(1)).click();
		}
		
		//Selecting the Marital Status
		List  omRadioButton = driver.findElements(By.name("userRegistrationForm:maritalStatus"));
		// Create a boolean variable which will hold the value (True/False)
		boolean rbValue = false;
		// This statement will return True, in case of first Radio button is selected
		rbValue = ((WebElement) omRadioButton.get(0)).isSelected();
		// This will check that if the bValue is True means if the first radio button is selected
		if(rbValue = true)
		{
			// This will select Second radio button, if the first radio button is selected by default
			((WebElement) omRadioButton.get(0)).click();
		}
		else
		{
			// If the first radio button is not selected by default, the first will be selected

			((WebElement) omRadioButton.get(1)).click();
		}
		
		//This Block is to Select the Date of Birth, Selecting only Date
		WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");
		//Selecting all options
		Select bDay = new Select(dobDay);
		bDay.selectByIndex(6);
		List<WebElement> webDay = bDay.getOptions();
		for (WebElement webElement : webDay) 
		{
			System.out.println(webElement.getText());
		}

		//This Block is to Select the Date of Birth, Selecting only Month
		WebElement dobMonth = driver.findElementById("userRegistrationForm:dobMonth");
		//Selecting all options
		Select bMonth = new Select(dobMonth);
		bMonth.selectByIndex(5);
		List<WebElement> webMonth = bMonth.getOptions();
		for (WebElement webElement : webMonth) 
		{
			System.out.println(webElement.getText());
		}

		//This Block is to Select the Date of Birth, Selecting only Year
		WebElement dobYear = driver.findElementById("userRegistrationForm:dateOfBirth");
		//Selecting all options
		Select bYear = new Select(dobYear);
		bYear.selectByIndex(12);
		List<WebElement> webYear = bYear.getOptions();
		for (WebElement webElement : webYear) 
		{
			System.out.println(webElement.getText());
		}

		//This Block is to Select the Occupation
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		//Selecting all options
		Select irctcOccupation = new Select(occupation);
		irctcOccupation.selectByIndex(1);
		List<WebElement> webOccupation = irctcOccupation.getOptions();
		for (WebElement webElement : webOccupation) 
		{
			System.out.println(webElement.getText());
		}

		//This Block is to Select the Country
		WebElement countries = driver.findElementById("userRegistrationForm:countries");
		//Selecting all options
		Select irctcCountries = new Select(countries);
		irctcCountries.selectByIndex(1);
		List<WebElement> webCountries = irctcCountries.getOptions();
		for (WebElement webElement : webCountries) 
		{
			System.out.println(webElement.getText());
		}

		driver.findElementById("userRegistrationForm:email").sendKeys("saravanaan@gmail.com");
		//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
		//driver.findElementById("userRegistrationForm:mobile").sendKeys("9840693868");

		//This Block is to Select the Nationality
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		//Selecting all options
		Select irctcNationality = new Select(nationality);
		irctcNationality.selectByIndex(1);
		List<WebElement> webNationality = irctcNationality.getOptions();
		for (WebElement webElement : webNationality) 
		{
			System.out.println(webElement.getText());
		}
		driver.findElementById("userRegistrationForm:address").sendKeys("132 Ponniamman koil st");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600113", Keys.TAB);
		//Thread.sleep(5000);
		//This Block is to Select the City
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		//Selecting all options
		Select irctcCity = new Select(city);
		irctcCity.selectByValue("Chennai");
		List<WebElement> webCity = irctcCity.getOptions();
		for (WebElement webElement : webCity) 
		{
			System.out.println(webElement.getText());
		}

		/*	WebElement cityName = driver.findElementById("userRegistrationForm:cityName");
				Select cn = new Select(cityName);
				List<WebElement> allOptions = cn.getOptions();
				int size = allOptions.size();
				System.out.println(size);
				cn.selectByIndex(size-1);
				for (WebElement eachOpt : allOptions)
				{
					String text = eachOpt.getText();
					System.out.println(text);
				}
		 */	
		Thread.sleep(5000);
		//This Block is to Select the Post Office
		WebElement postOffice = driver.findElementById("userRegistrationForm:postofficeName");
		//Selecting all options
		Select irctcPO = new Select(postOffice);
		irctcPO.selectByIndex(1);
		List<WebElement> webPO = irctcPO.getOptions();
		for (WebElement webElement : webPO) 
		{
			System.out.println(webElement.getText());
		}
		driver.findElementById("userRegistrationForm:landline").sendKeys("04424323232");
	}

	private static Object click() {
		// TODO Auto-generated method stub
		return null;
	}

}
