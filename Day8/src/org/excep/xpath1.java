package org.excep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class xpath1 {
	// **********MOVETO ELEMENT*********
	
	public static void main(String[] args) {
	// configure the driver
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Admin\\eclipse-workspace\\selenium\\src\\driver\\chromedriver.exe" );
				
				// launch browser
				 ChromeDriver driver =new ChromeDriver();
				 
				 //to naviage url
				/* driver.get("http://www.snapdeal.com/");
				 
				 WebElement mou1=driver.findElement(By.xpath("//span[text()='Electronics']"));
			  Actions acc=new Actions(driver);
			  acc.moveToElement(mou1).perform();
			  
			  WebElement mou2=driver.findElement(By.xpath("//span[text()='Computers & Gaming']"));
			  Actions acc1=new Actions(driver);
			  acc.moveToElement(mou2).perform();
			  
			  WebElement btn=driver.findElement(By.xpath("//pan[text()='Hp']"));
			  btn.click(); */
				 
				 // ************USE DRAG& DROP*************************
				/* driver.get("http://demo.guru99.com/test/drag_drop.html");
				 
				 Actions acc=new Actions(driver);
				 
				  WebElement src1=driver.findElement(By.id("credit"));
				  WebElement des1=driver.findElement(By.id("bank"));
				  
				  acc.dragAndDrop(src1, des1).perform();
				  
				  WebElement src2=driver.findElement(By.id("foutrh"));
				  WebElement des2=driver.findElement(By.id("amt7"));
				  
				  acc.dragAndDrop(src2, des2).perform();
				  */
				  
				  // **************DOUBLE CLICL OR CONTEXT CLICK***************
				  
				  driver.get("http://en-gb.facebook.com");	  
				    Actions acc1=new Actions(driver); 
				    WebElement mail=driver.findElement(By.id("email"));
				    mail.sendKeys("selenium");
				    
				    acc1.doubleClick(mail).build().perform();
				  
				    // acc.double click(mail) .context click (mail).build
				    acc1.doubleClick(mail).contextClick(mail).build().perform();
				    
				    acc1.contextClick(mail).build().perform();
				    
				  						 
				  
				 
				 
				 
			  
				 
				 
				 

}
}
