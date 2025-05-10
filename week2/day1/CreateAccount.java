package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	
	public static void main(String[] args) {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load URL
        driver.get("http://leaftaps.com/opentaps/");
        
        // Maximize window
        driver.manage().window().maximize();
        
        // Login
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Accounts tab
        driver.findElement(By.linkText("Accounts")).click();

        // Click Create Account
        driver.findElement(By.linkText("Create Account")).click();

        // Fill in account details
        driver.findElement(By.id("accountName")).sendKeys("TestLeafAccount");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        driver.findElement(By.name("numberEmployees")).sendKeys("100");
        driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");

        // Click Create Account button
        driver.findElement(By.className("smallSubmit")).click();
        
        // title verification
        String title = driver.getTitle();
		System.out.println(title);

     	// Close the browser window
     	driver.close();

	}
}
