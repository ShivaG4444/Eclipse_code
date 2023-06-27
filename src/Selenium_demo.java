import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		//ChromeDriver driverch= new ChromeDriver();
		//SearchContext driver1= new ChromeDriver();
		//ChromiumDriver
	//	RemoteWebDriver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Automation\\Selenium\\Driver\\chromedriver_win32.exe");
	//	driver.get("file:///C:/Users/Lenovo/Documents/Selenium_Pradeep/WebSite/WebSite/FaqExtended.html");
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
	//	Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='ques']")).sendKeys("shiva");
		//driver.close();
		//driver.get(null)
		
		System.out.println(driver.findElement(By.xpath("(//img[@itemprop='image' and @id='cb-logo-main-menu'])[1]")).getText());
		//Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("(//img[@itemprop='image' and @id='cb-logo-main-menu'])[1]")).getAttribute("title"));
		
		

	}

}
