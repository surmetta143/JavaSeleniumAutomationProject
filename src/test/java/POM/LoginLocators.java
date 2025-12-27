package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class LoginLocators {
	
	
    WebDriver driver;
	
	public LoginLocators(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	public void ClickLoginButton() {
		
		driver.findElement(By.xpath("//button[@id='login button']")).click();
	}
	
	public void VerifySignInButton() {
		driver.findElement(By.id("Submit")).isDisplayed();
	}

}
