package org.excep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) {
		
		// configure the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\src\\driver\\chromedriver.exe" );
		
		// launch browser
		 ChromeDriver driver =new ChromeDriver();
		 
		 // to navigate url
		 driver.get("https://en-gb.facebook.com/");
		 
		 // to print title in console
		 
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 // 	TTO PRINT CURRENT PAGE URL
		 String cu=driver.getCurrentUrl();
		 System.out.println(cu);
		 
		 //find the locator
		 
		 WebElement txtMail=driver.findElement(By.id("email"));
		 
		 // type in the field
		 txtMail.sendKeys("java");
		 
		 WebElement txtpwd=driver.findElement(By.name("pass"));
		 txtpwd.sendKeys("selenium");
		 
		 
		 WebElement loginbtn=driver.findElement(By.name("login"));
		 loginbtn.click();
		 
		 
		 
		 
		 
	
		 
		 
	}
	}		