package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;
import wdMethods.WdAnnotation;

public class createlead extends WdAnnotation{

	@Test(groups = {"smoke"})
	public void loginCreate() {
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		
		WebElement eleCRM = locateElement("linkText","CRM/SFA");
		click(eleCRM);*/
		
		
		WebElement elelead = locateElement("linkText","Create Lead");
		click(elelead);
		
		WebElement eleCompanyName = locateElement("id","createLeadForm_companyName");
		type(eleCompanyName, "Newbhawani");
		
		WebElement elefirstName = locateElement("id","createLeadForm_firstName");
		type(elefirstName, "Companyanme");
		
		WebElement eleLastName = locateElement("id","createLeadForm_lastName");
		type(eleLastName, "Companyanme");
		
		WebElement elesubmitbutton = locateElement("class","smallSubmit");
		click(elesubmitbutton);
		
		WebElement elename =locateElement("id","viewLead_companyName_sp");
		getText(elename);
		
		verifyExactText(elename,"Newbhawani");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//verifyExactText(eleCompanyName,"Newbhawani");
		//verifyPartialAttribute(eleCompanyName,,"Newbhawani");
		
		
		
		
		
		
	}
	
	
}






