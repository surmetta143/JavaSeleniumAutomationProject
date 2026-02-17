package TestCases.Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.LoginLocators;
import TestData.TestData;


public class Babu {
	
	
	@Test
	public void VerifyMobileTextbox()throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(TestData.Abhibusurl);
		
		LoginLocators obj=new LoginLocators(driver);
		obj.Clickloginsignup();
		obj.MobileTextBox();
		driver.close();
		
		
	}
}
