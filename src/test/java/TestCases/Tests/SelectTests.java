package TestCases.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import POM.LoginLocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import TestData.TestData;
import POM.SelectLocators;
import Utilities.Base;


public class SelectTests {
	
	
	@Test(groups= {"smoke"})
	public void VerifySelectButton() {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get(TestData.url);
		
		Base obj1 = new Base(driver);
		
		obj1.WaitForSomeTime(5);
		
		
		SelectLocators obj = new SelectLocators(driver);
		
		obj.ClickCoursesOption();
		
		obj.VerifySelectionButton();
		
		
		driver.close();
		
		
		
	}
	
	@Test
	public void VerifyAlert() {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get(TestData.url);
        SelectLocators obj = new SelectLocators(driver);
		
		obj.ClickCoursesOption();
		obj.ClickSelectButton();
        Base obj1 = new Base(driver);
		
		obj1.WaitForSomeTime(10);
		
		Alert alert = driver.switchTo().alert();
		
		
       	
		alert.accept();
		
		driver.close();
		
		
		
	}

	
	

}
