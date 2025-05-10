package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// Login
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Navigate to CRM/SFA, Leads and create Leads
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter mandatory fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harishma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		
		 // Select 'Employee' in Source drop down by index
        WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select sourceSelect = new Select(sourceDropdown);
        sourceSelect.selectByIndex(1); 

        // Select 'Automobile' in Marketing Campaign using visible text
        WebElement marketingDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select marketingSelect = new Select(marketingDropdown);
        marketingSelect.selectByVisibleText("Automobile");

        // Select 'Corporation' in Ownership using value
        WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select ownershipSelect = new Select(ownershipDropdown);
        ownershipSelect.selectByValue("OWN_CCORP");

        // Click on Create Lead button
        driver.findElement(By.className("submitButton")).click();

	}
}
