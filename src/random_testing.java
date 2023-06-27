import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class random_testing {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Documents\\Automation\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/text-box");
	
			
				driver.findElement(By.id("userName")).sendKeys("shiva");
				
			
			
		
				driver.findElement(By.id("userEmail")).sendKeys("s@gmail.com");
				
			
			
		
				driver.findElement(By.id("currentAddress")).sendKeys("varanasi");
				
			
			
			
				driver.findElement(By.id("permanentAddress")).sendKeys("vns");
				WebElement tar=driver.findElement(By.xpath("//button[text()='Submit']"));
				 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", tar);
			        tar.click();
			   System.out.println("done");
				
			
			
				
			
			

		}


	}


