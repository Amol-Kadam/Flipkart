package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tempt {
	
	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Applications\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();             							//click on close login window
		//WebElement logIn = driver.findElementByXPath("//*[@class='_1_3w1N']");
		
		Actions act = new Actions(driver);																		    //Hover mouse on login button
		WebElement m1 = driver.findElementByXPath("//*[@class='_1_3w1N']");
		act.moveToElement(m1).build().perform();
		//driver.findElementByXPath("//*[text()='My Profile']").click();
		driver.findElementByXPath("//*[@class='_2kxeIr _1pY_1Z']").click();											//Cllick on my profile button
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akadam719@gmail.com");					//Enter username
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("7588297532");								//Enter password
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();											//Click on login button
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='NS64GK']")).click();												//Click on My addresses
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='ADD A NEW ADDRESS']")).click();									//click on add new address
		
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Amol");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9423298742");
		driver.findElement(By.xpath("//*[@name='pincode']")).sendKeys("414601");
		driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("At post jeur baijabaiche, Kadam lane, AHMED NAGAR,");
		driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("At post jeur baijabaiche, Kadam lane, AHMED NAGAR,");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Nagar");
		driver.findElement(By.xpath("//*[@name='landmark']")).sendKeys("New BOI");
		driver.findElement(By.xpath("//*[@name='alternatePhone']")).sendKeys("9834534532");
		
		Select sel = new Select(driver.findElement(By.xpath("//*[@name='state']")));
		
		sel.selectByVisibleText("Maharashtra");
		
		
		driver.findElement(By.xpath("//*[@class='_2jIO64']")).click();													//Click on radio button
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL'] | //*[text()='SAVE']")).click();		//Click on save button
		
		      
		      
		      
		
		
		
		
	}

}
