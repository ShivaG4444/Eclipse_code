import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FormFill_AUtomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// driver initiation
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Documents\\Automation\\Selenium\\Driver\\chromedriver_win32.exe");
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
		imageupload.sendKeys("C:\\Users\\Lenovo\\Documents\\image\\gettyimages-469169178-594x594.jpg");

		// register
		WebElement register = driver.findElement(By.xpath("//input[@value='Register']"));
		register.click();

		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	

	}
}