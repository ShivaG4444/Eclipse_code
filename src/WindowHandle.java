import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Documents\\Automation\\Selenium\\Driver\\chromedriver_win32.exe");
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gclid=EAIaIQobChMI87Osn_Hv_AIVmWSLCh33TQ_EEAAYASAAEgLCavD_BwE&gclsrc=aw.ds");
	WebElement ele=driver.findElement(By.xpath("//a[text()=' Terms and Conditions ']"));
	ele.click();
	 System.out.println(driver.getTitle());
	 driver.navigate().refresh();
		//driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		
	//	driver.findElement(By.xpath("//img[@src='https://cdnx.tribalfusion.com/media/9527446.gif']")).click();
		
		Set<String> childwindow= driver.getWindowHandles();
		
		for(String window:childwindow) {
			if(!window.equals(parent)) {
				driver.switchTo().window(window);
			}
		}
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		Thread.sleep(10000);
		//ele.click();
		driver.findElement(By.xpath("//a[text()=' Privacy Policy ']")).click();
		//driver.getTitle();
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
		
// *In case multiple windows are present and need to click 3 or 4th for which we are aware of title of page 		
//		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='aajZCb']"));
//		Thread.sleep(3000);
//		for(WebElement str:ele) {
//			//System.out.println(str.getText());
//			if(str.getText().equals("cricket match")) {
//				str.click();
//                break;
//			}
//		}
		
		

	}

}
