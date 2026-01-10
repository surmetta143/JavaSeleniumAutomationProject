package TestCases.Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.LoginLocators;
import TestData.TestData;


public class Arjun {


	@Test
	public void FlipkartLogin() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(TestData.Flipkarturl);
		
		LoginLocators obj=new LoginLocators(driver);
		
			
		obj.VerifyFlipkartLoginButton();
		
		driver.close();
		
		
	}
	
	@Test
	public void MouseHover()throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(TestData.Flipkarturl);
		
 WebElement hoverElement = driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		
		Actions obj = new Actions(driver);
		 obj.moveToElement(hoverElement).perform();
		 
		 Thread.sleep(3000);
				 
	 driver.findElement(By.xpath("//li[normalize-space()='Orders']")).isDisplayed();
					 
	 driver.close();
	}	
		
	}

	
