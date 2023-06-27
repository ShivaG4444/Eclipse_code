import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinkautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Documents\\Automation\\Selenium\\Driver\\chromedriver_win32.exe");
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		int numoflinks= links.size();
//		System.out.println(numoflinks);
//		
//		for(WebElement ele :links ) {
//			System.out.println(ele.getText());
//		}
	//	driver.findElement(By.linkText("Download Image")).click();
         
	WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		 for(WebElement val: rows) {
			 List<WebElement> cells= val.findElements(By.tagName("td"));
			  for(WebElement cell : cells) {
				  System.out.print(cell.getText()+ " ");
			  }
			  System.out.println();
	 }
		 
		 WebElement tableHeader = table.findElement(By.tagName("th`"));
		 List<WebElement> headers = tableHeader.findElements(By.tagName("th"));

		 for (WebElement header : headers) {
		     System.out.print(header.getText() + " ");
		 }
//	 List<WebElement> rows=table.findElements(By.tagName("tr"));
//	  for(WebElement row : rows) {
//		  List<WebElement> cells=row.findElements(By.tagName("td"));
//		 // System.out.println(cells.size());
//		    if(cells.get(0).getText().equals("Google")) {
//		    	System.out.println("Success");
//			  
//		  }
//		    else {
//		    	System.out.println("failed");
//	    }
//	  }
		
	}

}
