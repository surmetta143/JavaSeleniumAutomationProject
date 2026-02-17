package TestCases.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GaneshTestCases {
	
	
	
	
	 @Test(groups= {"ganesh"})

	    void VerifyStopButton()  {
	    	
	    	WebDriver driver = new ChromeDriver();
	    	
	    	driver.get("https://testautomationpractice.blogspot.com/");
	    	
	    	
	    	
	    	 WebElement x= driver.findElement(By.xpath("//button[@name='start']"));
	         
	    	 x.click();
	    	 
	    	
	            
	    	driver.findElement(By.xpath("//button[@name='stop']")).isDisplayed();
	    	
	    	driver.close();
	    	
	    	
	    	
	    	
	    	
	        
	    }
	    
	    @Test(groups = {"ganesh"})
	    void VerifySelectButton()  {
	   
	    	
	    	WebDriver driver = new ChromeDriver();
	    	
	    	// Step 1: Open application URL
	    	driver.get("https://jovial-buttercream-da99f3.netlify.app/");
	    	
	    	// Step 2: Click on Courses option
	    	driver.findElement(By.id("Courses")).click();
	    	
	    	
	    	// Step 3: Verify Select button is displayed
	    	driver.findElement(By.xpath("//button[text()='Select']")).isDisplayed();
	    	
	    	driver.close();
	    }


}
