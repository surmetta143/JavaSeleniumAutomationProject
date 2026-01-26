package TestCases.Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.LoginLocators;
import TestData.TestData;

public class Mamatha {
	
	@Test
	public void VerifyProfileAndCart() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.meesho.com/?srsltid=AfmBOoqq4-DdCYFk4zUHeQATvriwi3vWfo50e6FIFmZ-fHXWuDvI3gLE");
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M15.316 13')]")).isDisplayed();
		driver.findElement(By.xpath("//div[@class='sc-kFkjun cEGPDc TabWrapper-sc-1edf3ww-0 jtaRdY']//*[name()='svg']")).isDisplayed();
		driver.close();	
	}
	

    @Test
    void VerifyEnterPickupLocationAndEnterDropLocation()  {
    	
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.rapido.bike/Home");
    	
    	driver.findElement(By.xpath("//input[@placeholder='Enter Pickup Location']")).isDisplayed();
    	
    	driver.findElement(By.xpath("//input[@placeholder='Enter Drop Location']")).isDisplayed();
    	
    	driver.close(); 
    }
	
	}