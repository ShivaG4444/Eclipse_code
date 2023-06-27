import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_Scenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Documents\\Automation\\Selenium\\Driver\\chromedriver_win32.exe");
		driver.get("https://www.google.co.in/");
	WebElement ele=	driver.findElement(By.xpath("//input[@class='gLFyf']"));
			ele.sendKeys("cricket");
		
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.click(ele).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).build().perform();
		
		act.sendKeys(Keys.ENTER).build().perform();
	//	Thread.sleep(3000);
		//act.sendKeys(Keys.ENTER).build().perform();

	}

}
