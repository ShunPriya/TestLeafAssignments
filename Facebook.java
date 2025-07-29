package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		// Load the url - get
		driver.get("https://en-gb.facebook.com/");

		// Maximize the browser
		driver.manage().window().maximize();
		
		//Click on the Create new account button		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name. 
		driver.findElement(By.name("firstname")).sendKeys("Sample");
		
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("Trial");
		
		//Enter the Mobile number or email address  
		driver.findElement(By.name("reg_email__")).sendKeys("123@gmail.com");
		
		//Enter the New password 
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		
		//Handle all three drop downs in Date of birth
		WebElement date = driver.findElement(By.id("day"));
		Select dropdown1 = new Select(date);
		dropdown1.selectByValue("16");
		
		WebElement month = driver.findElement(By.id("month"));
		Select dropdown2 = new Select(month);
		dropdown2.selectByVisibleText("Sep");
		
		WebElement year = driver.findElement(By.id("year"));
		Select dropdown3 = new Select(year);
		dropdown3.selectByIndex(19);
		
		//Select the radio button in Gender
		driver.findElement(By.xpath("//input[@id='sex' and @value='2']")).click();
		

	}

}
