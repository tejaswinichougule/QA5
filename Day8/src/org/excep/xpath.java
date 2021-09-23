package org.excep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

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
			 
			 WebElement txtMail=driver.findElement(By.xpath("//input[@type='text']")); 
			 // type in the field
			 txtMail.sendKeys("java");
			 
			 WebElement txtpwd=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
			 txtpwd.sendKeys("selenium");
			 
			 
			 WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
			 loginbtn.click();
			 
			 WebElement titl=driver.findElement(By.xpath("//a[text()='create a page']"));
			 String txt=titl.getText();
			 System.out.println(txt);
			 
			 WebElement para=driver.findElement(By.xpath("/h2[contains(text(),'facebook helps')]"));
			 String txt2=para.getText();
			 System.out.println(txt2);
					 
			 // get attri and type in field
			 txtMail.sendKeys("java");
			 String att=txtMail.getAttribute("class");
			 System.out.println(att);
		}
		}		

