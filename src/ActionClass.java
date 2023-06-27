import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
	
		 WebDriver driver = new ChromeDriver();
		// driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobile");
		button[@type='submit']
		// Actions act=new Actions(driver);
		 
//		 WebElement source=driver.findElement(By.xpath("//*[@id='credit2']/a"));
//		 WebElement target=driver.findElement(By.xpath("//a[text()='Selenium']"));
//		 Thread.sleep(3000);
//	//	act.dragAndDrop(source, target).build().perform();
//		act.contextClick().build().perform();
//	//	act.moveToElement(target).click().build().perform();
//		act.keyDown(Keys.PAGE_DOWN).build().perform();
//		System.out.println("Shiva");
		
		

	}

}
