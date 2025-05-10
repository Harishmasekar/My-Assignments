package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountHomeAssignment {

	public static void main(String[] args) {
		
	       //instantiate the browser driver
			ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			ChromeDriver driver=new ChromeDriver(options);
			
		            // Load URL and maximize browser window
		            driver.get("http://leaftaps.com/opentaps/");
		            driver.manage().window().maximize();

		            // Login
		            driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		            driver.findElement(By.id("password")).sendKeys("crmsfa");
		            driver.findElement(By.className("decorativeSubmit")).click();

		            // Click CRM/SFA
		            driver.findElement(By.linkText("CRM/SFA")).click();

		            // Click Accounts tab
		            driver.findElement(By.linkText("Accounts")).click();

		            // Click Create Account
		            driver.findElement(By.linkText("Create Account")).click();

		            // Enter account name and description
		            driver.findElement(By.id("accountName")).sendKeys("Harishmasekar");
		            driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

		          //enter industry
		    		WebElement  industryBox=driver.findElement(By.xpath("industryEnumId"));
		    		Select select= new Select(industryBox);
		    		select.selectByVisibleText("Computer Software");
		    		
		    		//ownershipEnumId
		    		WebElement  ownershipBox=driver.findElement(By.xpath("ownershipEnumId"));
		    		Select owner= new Select(ownershipBox);
		    		owner.selectByVisibleText("S-Corporation");
		    		
		    		//enter source
		    		WebElement  sourceBox=driver.findElement(By.xpath("'dataSourceId"));
		    		Select selectSource= new Select(sourceBox);
		    		selectSource.selectByValue("LEAD_EMPLOYEE");
		    		
		    		//enter  marketingCampaignId
		    		
		    		WebElement  marketingCampaign=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		    		Select selectMc= new Select(marketingCampaign);
		    		selectMc.selectByIndex(6);
		    		
		    		//select state /province
		    		WebElement  stateProvince=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		    		Select selectState= new Select(stateProvince);
		    		selectState.selectByValue("TX");
		    		
					
					//Click on the create account button
					driver.findElement(By.className("smallSubmit")).click();
					
					//get title of the page
					String title=driver.getTitle();
				    System.out.println(title);
				    
				    //close the window
				    driver.close();
		    		
	}
	
	
}
