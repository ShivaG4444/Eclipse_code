import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScenario_interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		List<WebElement> ele=driver.findElements(By.xpath("//span[@data-component-type='s-search-results']"));
		int count = 1;
		
		for(WebElement watch:ele) {
			if(count>10) {
				break;
			}
			System.out.println(watch.getText());
			count++;
			System.out.println("meracount "+count);
		}
		

	}

}
