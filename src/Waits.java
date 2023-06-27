import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waits {
    
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Documents/Selenium_Pradeep/Testing_Pages/UserRegistration.html");
       
		// firstname
		WebElement firstname = driver.findElement(By.xpath("//input[@class='fNameClass']"));
		firstname.sendKeys("Narendra");

		// middlename
		WebElement middlename = driver.findElement(By.xpath("//input[@name='mname']"));
		middlename.sendKeys("Damodardas");

		// lastname
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']"));
		lastname.sendKeys("Modi");

		// age
		WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
		age.sendKeys("79");

		// option[@value="4"]
		// WebElement matialstatus=
		// driver.findElement(By.xpath("//option[@value='4']"));
		// matialstatus.click();

		// matialstatus using select class
		WebElement matialstatus = driver.findElement(By.xpath("//select[@id='marital']"));
		Select select = new Select(matialstatus);
		select.selectByVisibleText("Married");

		// gender
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();

		// subject
		WebElement subject = driver.findElement(By.xpath("//input[@name='selenium']"));
		subject.click();

		// imageupload
		WebElement imageupload = driver.findElement(By.xpath("//input[@type='file']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		imageupload.sendKeys("C:\\Users\\Lenovo\\Documents\\image\\gettyimages-469169178-594x594.jpg");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Registers']")));
		
		FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver);
		wait1.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).until(ExpectedConditions.alertIsPresent());
		wait1.ignoring(null, null)
		
		// register
		WebElement register = driver.findElement(By.xpath("//input[@value='Registers']"));
		
		//register.click();
		
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.);
	   Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
