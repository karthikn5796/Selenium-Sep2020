package Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
				
public class LunchApplication {

 public static void main(String[] args) {
	 
 WebDriverManager.chromedriver().setup();
  ChromeDriver Chrome= new ChromeDriver();
  Chrome.manage().window().maximize();
  Chrome.get("http://leaftaps.com/opentaps/control/main");
  
	}

}
