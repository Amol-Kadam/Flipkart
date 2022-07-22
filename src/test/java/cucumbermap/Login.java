package cucumbermap;


import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login
{

	@Given ("^user open browser with \"(.*)\" and \"(.*)\"$")
	public void BLaunch(String key , String value) 
	{
		Object [] input1 = new Object[2];
		input1[0] = key;
		input1[1] = value;
		SeleniumOperations.browserlaunch(input1 );
	}
	
	@Given ("^user enter url \"(.*)\"$") 
	public void BLaunch(String url)
	{
		Object [] input2 = new Object[1];
		input2[0] = url;
		SeleniumOperations.OpenApplication(input2); 
	}
	
	@When("user click on initial login page")
	public void user_click_on_initial_login_page() {
		Object [] input3 = new Object[1];
		input3[0] = "//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.ClickOnElement(input3); 
	}

	@When("user navigate to login button")
	public void user_navigate_to_login_button() {
		Object [] input4 = new Object[1];
		input4[0] = "//*[@class='_1_3w1N']";
		Hashtable<String,Object>output4 =  SeleniumOperations.MoveToElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user navigate to login button", output4.get("MESSAGE").toString());
	}

	@When("user click on My profile")
	public void user_click_on_my_profile() throws InterruptedException {
		Object [] input5 = new Object[1];
		input5[0] = "//*[@class='_2kxeIr _1pY_1Z']";
		Hashtable<String,Object>output5 =SeleniumOperations.ClickOnElement(input5);
		Thread.sleep(3000);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user click on My profile", output5.get("MESSAGE").toString());
	}

	@When("^user enter (.+) as username$")
	public void user_enter_as_username(String string) {
		Object [] input6 = new Object[2];
		input6[0] = "(//input[@type='text'])[2]";
		input6[1] = string;
		Hashtable<String,Object>output6 =SeleniumOperations.SendTextOnUi(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter (.+) as username$", output6.get("MESSAGE").toString());
	}

	@When("^user enter (.+) as password$")
	public void user_enter_as_password(String string) {
		Object [] input7 = new Object[2];
		input7[0] = "//*[@type='password']";
		input7[1] = string;
		Hashtable<String,Object>output7 =SeleniumOperations.SendTextOnUi(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user enter (.+) as password$", output7.get("MESSAGE").toString());
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
		Object [] input8 = new Object[1];
		input8[0] = "(//*[@type='submit'])[2]";
		Hashtable<String,Object>output8 =SeleniumOperations.ClickOnElement(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "user click on Login button", output8.get("MESSAGE").toString());
	}

	@Then("application shows login successfully")
	public void application_shows_login_successfully() {
		Object [] input9 = new Object[2];
		input9[0] = "Personal Information";
		input9[1] = "//*[text()=\"Personal Information\"]";
		Hashtable<String,Object>output9 =SeleniumOperations.ValidationbyGetText(input9 );
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "application shows login successfully", output9.get("MESSAGE").toString());
	}
	
}
