package TestCases.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SelectRelated {
	
	
	
	@Test(groups = {"deepika"})
	public void VerifySelectButton() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jovial-buttercream-da99f3.netlify.app/");
		driver.findElement(By.xpath("//a[@id='Courses']")).click();	
		driver.findElement(By.xpath("//button[@id='select button']")).isDisplayed();
		driver.close();
			
	}
	
	
	@Test
	public void VerifySubmitButton() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jovial-buttercream-da99f3.netlify.app/");
		driver.findElement(By.xpath("//button[@id='Sign Up button']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='submitSignup()']")).isDisplayed();
		
		driver.close();
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
