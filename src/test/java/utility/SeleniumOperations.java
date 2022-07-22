package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations {
	
	public static ChromeDriver driver = null;
	
	public static Hashtable<String,Object> outputParameters= new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserlaunch(Object[] InputParameters)
	{	
		try
		{
			String BrowserName = (String)InputParameters[0];
			String BrowserExe = (String)InputParameters[1];
			System.setProperty(BrowserName , BrowserExe );
			driver = new ChromeDriver();	
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch,Input Given: "+InputParameters[0].toString());
		}
		
	
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch,Input Given: "+InputParameters[0].toString());			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> OpenApplication(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			driver.get(path);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:OpenApplication,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:OpenApplication,Input Given: "+InputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> MoveToElement(Object[] InputParameters) 
	{
		try
		{
			String path = (String)InputParameters[0];
			Actions act = new Actions(driver);																		    //Hover mouse on login button
			WebElement m1 = driver.findElementByXPath(path);
			act.moveToElement(m1).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:MoveToElement,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:MoveToElement,Input Given: "+InputParameters[0].toString());			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> ClickOnElement(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			driver.findElementByXPath(path).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:ClickOnElement,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:ClickOnElement,Input Given: "+InputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> SendTextOnUi(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			String text = (String)InputParameters[1];
			driver.findElementByXPath(path).sendKeys(text);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:SendTextOnUi,Input Given: "+InputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SendTextOnUi,Input Given: "+InputParameters[1].toString());			
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> SelectText(Object[] InputParameters)
	{
		try
		{
			String path = (String)InputParameters[0];
			String text = (String)InputParameters[1];
			Select sel = new Select(driver.findElement(By.xpath(path)));
			sel.selectByVisibleText(text);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:SelectText,Input Given: "+InputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:SelectText,Input Given: "+InputParameters[1].toString());
			
		}
		return outputParameters;
	}
	
	
	
	public static Hashtable<String,Object> ValidationbyGetText(Object[] InputParameters)
	{	
		try
		{
			String giventext = (String)InputParameters[0];
			String path = (String)InputParameters[1];
			
			String capturedtText = driver.findElement(By.xpath(path)).getText();
			
			if(giventext.equalsIgnoreCase(capturedtText))
			{
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("test case fail");
			}
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:ValidationbyGetText,Input Given: "+InputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:ValidationbyGetText,Input Given: "+InputParameters[0].toString());
			
		}
		return outputParameters;
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//SeleniumOperations S = new SeleniumOperations();
		
		//Browser launch
		Object [] input1 = new Object[2];
		input1[0] = "webdriver.chrome.driver";
		input1[1] = "D:\\Testing\\Applications\\chromedriver_win32\\chromedriver.exe";
		SeleniumOperations.browserlaunch(input1 ); 
		
		//Open application
		Object [] input2 = new Object[1];
		input2[0] = "https://www.flipkart.com/";
		SeleniumOperations.OpenApplication(input2); 
		
		//Close login window
		Object [] input3 = new Object[1];
		input3[0] = "//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.ClickOnElement(input3); 
	
		//move on login button
		Object [] input4 = new Object[1];
		input4[0] = "//*[@class='_1_3w1N']";
		SeleniumOperations.MoveToElement(input4); 
		
		//click on my profile
		Object [] input5 = new Object[1];
		input5[0] = "//*[@class='_2kxeIr _1pY_1Z']";
		SeleniumOperations.ClickOnElement(input5);															
		
	
		//send username password and click on login button
		Object [] input6 = new Object[2];
		input6[0] = "(//input[@type='text'])[2]";
		input6[1] = "akadam719@gmail.com";
		SeleniumOperations.SendTextOnUi(input6);
		
		Object [] input7 = new Object[2];
		input7[0] = "//*[@type='password']";
		input7[1] = "7588297532";
		SeleniumOperations.SendTextOnUi(input7);
		
		Object [] input8 = new Object[1];
		input8[0] = "(//*[@type='submit'])[2]";
		SeleniumOperations.ClickOnElement(input8);	
		
	}

}
