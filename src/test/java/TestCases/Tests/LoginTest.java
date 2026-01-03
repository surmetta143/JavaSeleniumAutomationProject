package TestCases.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.LoginLocators;

import java.time.Duration;

import org.openqa.selenium.By;

import TestData.TestData;






public class LoginTest {
	
	
	@Test(groups= {"smoke"})
	public void VerifySignInButton() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(TestData.url);
		
		LoginLocators obj=new LoginLocators(driver);
		
		
		obj.ClickLoginButton();
		
		obj.VerifySignInButton();
		
		driver.close();
		
		
		
		
		
	}
	
	
	@Test(groups= {"regression"})

	public void VerifySignInButton1() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(TestData.url);
		
		LoginLocators obj=new LoginLocators(driver);
		
		
		obj.ClickLoginButton();
		
		obj.VerifySignInButton();
		
		driver.close();
		
		
		
		
		
	}
	@Test(groups= {"regression"})

	public void VerifyCoursesOption() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(TestData.url);
		driver.findElement(By.id("Courses")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='select button']")).isDisplayed();
		driver.close();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
