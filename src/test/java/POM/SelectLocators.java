package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class SelectLocators {
	
	
WebDriver driver;
	
	public SelectLocators(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickCoursesOption() {
		
		driver.findElement(By.id("Courses")).click();
	}
	
	public void VerifySelectionButton() {
		driver.findElement(By.id("select button")).isDisplayed();
	}
	
	


}
