package TestCases.Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Locators;
import TestData.TestData;

import org.openqa.selenium.WebElement;


class LoginTestCases  {
	
	
	
	
    
    @Test
    void VerifyStopButton()  {
    	
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://testautomationpractice.blogspot.com/");
    	
    	
    	
    	driver.findElement(By.xpath("//button[@name='start']")).click();
    	
    	driver.findElement(By.xpath("//button[@name='stop']")).isDisplayed();
    	
    	driver.close();
    	
    	
    	
    	
    	
        
    }
    
    
    
    
    
    
   
    
    

}
