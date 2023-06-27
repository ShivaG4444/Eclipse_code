import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Documents\\Automation\\Selenium\\Driver\\chromedriver_win32.exe");
		driver.get("file:///C:/Users/Lenovo/Documents/Selenium_Pradeep/Testing_Pages/WebSite/Calendar/PradeepSeleniumTraining.html");
		
		    driver.findElement(By.xpath("//img[@src='calander.png']")).click();
		  //  String expecteddate= "March 2023";

		    System.out.println("Initialdate: "+driver.findElement(By.xpath("//input[@class='form-control']")).getAttribute("value"));
		    String expectedyear="2030";
		    
		  WebElement currdate= driver.findElement(By.xpath("(//th[@class='picker-switch'])[1]"));
		  currdate.click();
		    
		  WebElement year=driver.findElement(By.xpath("(//th[@class='picker-switch'])[2]"));
				  
		  
		  // System.out.println(currdate);
		   
		   while(!expectedyear.equals(year.getText())) {
	     	   driver.findElement(By.xpath("(//th[@class='next'])[2]")).click(); 
	     	   }
		    //   System.out.println("done");
		   
	      driver.findElement(By.xpath("//span[@class='month' and text()='May']")).click();
	       driver.findElement(By.xpath("//td[@class='day' and text()='29']")).click();
	       
	       System.out.println("Finaldate: "+driver.findElement(By.xpath("//input[@class='form-control']")).getAttribute("value"));
	       
	       
	       
	       
	
		    

	}
}

