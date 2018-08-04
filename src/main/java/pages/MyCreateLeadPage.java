package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wdMethods.Annotattion2;
//import wdMethods.WdAnnotation;

public class MyCreateLeadPage extends Annotattion2 {
	public MyCreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="createLeadForm_companyName]']")
	WebElement eleCName;
	@FindBy(id="createLeadForm_firstName']")
	WebElement eleFName;
	@FindBy(id="createLeadForm_lastName']")
	WebElement eleLName;
	@FindBy(id="smallSubmit']")
	WebElement eleSubmitButton;

	public MyCreateLeadPage eleCName(String data) {
		//WebElement eleLeads = locateElement("linkText", "Leads");	
		type(eleCName, data);
		return this;
	}
	public MyCreateLeadPage eleFName(String data) {
		//WebElement eleLeads = locateElement("linkText", "Leads");	
		type(eleFName, data);
		return this;
	}
	public MyCreateLeadPage eleLName(String data) {
		//WebElement eleLeads = locateElement("linkText", "Leads");	
		type(eleLName, data);
		return this;
	}
	public ViewLeadPage eleSubmitButton(String data) {
		//WebElement eleLeads = locateElement("linkText", "Leads");	
		click(eleSubmitButton);
		return new ViewLeadPage();
	}
}