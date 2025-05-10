package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
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

        // Click Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();
        
        // Enter lead details
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL technologies");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harishma");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AI Engineer");

        // Click Create Lead button
        driver.findElement(By.className("submitButton")).click();
        
        // title verification
     	String title = driver.getTitle();
     	System.out.println(title);

     	// Close the browser window
     	driver.close();
	}
}
