package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wdMethods.Annotattion2;
//import wdMethods.WdAnnotation;

public class MyLeadsPage extends Annotattion2 {
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Create Lead']")
	WebElement eleCreateLeads;

	public MyCreateLeadPage clickLeads() {

		//WebElement eleLeads = locateElement("linkText", "Leads");
		click(eleCreateLeads);
		return new MyCreateLeadPage();
	}
}
