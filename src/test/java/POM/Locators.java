package POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class Locators {
	
	WebDriver driver;
	
	By login = (By.id("login button"));
	
	public Locators(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickLogin() {
		
		 driver.findElement(this.login).click();
	}
	
	

}
