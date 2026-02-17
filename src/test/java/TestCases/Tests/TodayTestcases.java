package TestCases.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;


public class TodayTestcases {
	
	
	
	@Test
	public void LoginTest() {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jovial-buttercream-da99f3.netlify.app/");
		
		driver.findElement(By.xpath("//button[@id='login button']")).isDisplayed();
		
		driver.close();
		
	}
	
	
	@Test (groups = {"deepika"})
	public void VerifyLoginPopup() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jovial-buttercream-da99f3.netlify.app/");
		
		driver.findElement(By.xpath("//button[@id='login button']")).click();
		
		driver.findElement(By.xpath("//button[@id='Submit']")).isDisplayed();
		
		driver.close();
		
		
		
	}
	
	
	@Test
	public void VerifyLoginPopupText() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jovial-buttercream-da99f3.netlify.app/");
		
		driver.findElement(By.xpath("//button[@id='login button']")).click();
		
		driver.findElement(By.xpath("//h3[normalize-space()='Login']")).isDisplayed();
		
		driver.close();
		
		
		
	}


}
