import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Documents\\Automation\\Selenium\\Driver\\chromedriver_win32.exe");
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("cricket");
		driver.manage().window().maximize();
		
		TakesScreenshot tss=(TakesScreenshot)driver; 
            File input =tss.getScreenshotAs(OutputType.FILE);  
            File output= new File("C:\\Users\\Lenovo\\Documents\\image\\shiva.jpg");
            Files.copy(input, output);

	}

}
