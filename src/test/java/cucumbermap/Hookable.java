package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.HTMLReportGenerator;

public class Hookable {

	@Before
	public void before(Scenario scenario) throws UnknownHostException 
	{
		
		HTMLReportGenerator.TestSuiteStart("C:\\Report\\flipkart.html", "Flipkart");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("-----------------Scenario Start---------------");
	}
	
	
	@After
	public void after(Scenario scenario) 
	{
		System.out.println("-----------------Scenario end---------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
	}
}
