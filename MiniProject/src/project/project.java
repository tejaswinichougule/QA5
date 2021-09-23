package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {
	
static void proj() throws IOException{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium\\src\\driver\\chromedriver.exe" );
		
		// LAUNCH BROWSER
		 ChromeDriver driver =new ChromeDriver();
		 
		 // NAVIGATE URL
		 driver.get("https://www.amazon.com/");
		 String cu=driver.getCurrentUrl();
		 System.out.println(cu);
		 
		// LOGIN CODE AND SIGNIN CODE
		 
	    // sign in button 
		 WebElement signin=driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span"));
		  // type in the field
		 signin.click();		
		 
		 // mail/ph-no
		 WebElement txtMail=driver.findElement(By.xpath("//input[@type='email']"));
		  // type in the field
		txtMail.sendKeys("7028191378");
		 
		 // continue button
		 WebElement continuebtn=driver.findElement(By.xpath("//input[@id='continue']"));
		 continuebtn.click();
		 
		 // Password
		 WebElement txtpwd=driver.findElement(By.xpath("//input[@type='password']"));
		 txtpwd.sendKeys("Tejas@12345");
		
		 // SIGNI-IN
		 WebElement signbtn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		 signbtn.click();
		 
		 //PRINT ITEMS IN SEARCH TAB IN AMAZON 
		 System.out.println("***********PRINT THE OUTPUT************");
		 for(int i=0;i<ab.size();i++) {
			
			 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
			 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(ab.get(i));
			 System.out.println("********************SHOES********************");
			 driver.findElement(By.xpath(	"//*[@id=\"nav-search-submit-button\"]")).click();
	
			 
			 // PRINT ITEMS IN CONSOLE
	
			 System.out.println("\n "+ab.get(i)+"\n");
			 
			 // TEXT FILE 
File f7=new File("C:\\Users\\Admin\\eclipse-workspace\\DataDriven\\textfolder\\Tdata.txt");
			// FileUtils.write(f7, "Hello",true);
 
		
				 }
	
			 }	
			 

	// READ THE EXCEL FILE HERE
	static WebDriver driver;
	
	static ArrayList<String> ab=new ArrayList<String>();
	static void readfile() {
		try {
			// CREATE FILE
			File fi=new File("C:\\Users\\Admin\\eclipse-workspace\\DataDriven\\Excel\\Data.xlsx");
			FileInputStream in=new FileInputStream(fi);
			// WORKBOOK FROM FILE SYSIEM
			XSSFWorkbook wb=new XSSFWorkbook (in);
			// SHEET ON WORKBOOK
			XSSFSheet s=wb.getSheet("Sheet1");
			//PRINT THE CONTENT
			Iterator<Row>itr=s.iterator();
			//CHECK ROWS IN SHEET
			while(itr.hasNext()) {
				Row r=itr.next();
				Iterator<Cell> cellitr=r.cellIterator();
				
				while(cellitr.hasNext()) {
					Cell c=cellitr.next();
					
					switch(c.getCellType()) {
					
					case Cell.CELL_TYPE_STRING:
						String get=c.getStringCellValue();
						ab.add(get);
						break;						
					
					}
				}
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println(ab);
			}



// MAIN METHOD
public static void main(String[] args)throws IOException{
	
	readfile();
	proj();
	
}
}



}
