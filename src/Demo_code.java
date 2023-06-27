import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "shivaghoshaos";
		char str1 = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					str1=str.charAt(i);
					System.out.println(str1);
				}
			}
		}
		
	}

}
