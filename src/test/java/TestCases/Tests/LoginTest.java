package TestCases.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.LoginLocators;

import org.openqa.selenium.By;

import TestData.TestData;






public class LoginTest {
	
	@Test
	public void VerifySignInButton() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(TestData.url);
		
		LoginLocators obj=new LoginLocators(driver);
		
		obj.ClickLoginButton();
		
		obj.VerifySignInButton();
		
		driver.close();
		
		
		
		
		
	}
	
	
	
	

}
