package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;

public class Base {
	
	
WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver=driver;
	}
	
	public void WaitForSomeTime(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	
	
	

}
