package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		//EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("crmsfa");

		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click on the "Accounts" tab
		driver.findElement(By.partialLinkText("Accounts")).click();
		
		//Click on the "Create Account" button
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Priya");
		
		//Enter a description as "Selenium Automation Tester." 
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry
		
		WebElement sourceElement1 = driver.findElement(By.name("industryEnumId")); // Step1: Find the dropdown element
		Select dropdown1 = new Select(sourceElement1); // Step2: Select-Create an Object
		dropdown1.selectByValue("IND_SOFTWARE"); // Step3: Use the method to Select - 3 Methods

		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement sourceElement2 = driver.findElement(By.name("ownershipEnumId")); // Step1: Find the dropdown element
		Select dropdown2 = new Select(sourceElement2); // Step2: Select-Create an Object
		dropdown2.selectByVisibleText("S-Corporation"); // Step3: Use the method to Select - Visible Text Method
		
		//Select "Employee" as the source using SelectByValue.
		WebElement sourceElement3 = driver.findElement(By.id("dataSourceId")); // Step1: Find the dropdown element
		Select dropdown3 = new Select(sourceElement3); // Step2: Select-Create an Object
		dropdown3.selectByValue("LEAD_EMPLOYEE"); // Step3: Use the method to Select - Value
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement sourceElement4 = driver.findElement(By.id("marketingCampaignId")); // Step1: Find the dropdown element
		Select dropdown4 = new Select(sourceElement4); // Step2: Select-Create an Object
		dropdown4.selectByIndex(6); // Step3: Use the method to Select - By Index
		
		//Select "Texas" as the state/province using SelectByValue. 
		WebElement sourceElement5 = driver.findElement(By.id("generalStateProvinceGeoId")); // Step1: Find the dropdown element
		Select dropdown5= new Select(sourceElement5); // Step2: Select-Create an Object
		dropdown5.selectByValue("TX"); // Step3: Use the method to Select - By Index
		
		//Click the "Create Account" button. 
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
