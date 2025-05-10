package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	
public static void main(String[] args) {
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		 
   	    //title of the page
		String titleName = driver.getTitle();
		System.out.println("Facebook" +titleName);
		
		//load url 
		driver.get("https://www.facebook.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		// Enter the email
       driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
      
        // Enter the password
        driver.findElement(By.id("pass")).sendKeys("Tuna@321");
       
        // Click on the Login button
       driver.findElement(By.name("login")).click();
     
    // Closing the browser
    		driver.close();

    	
	}

}

