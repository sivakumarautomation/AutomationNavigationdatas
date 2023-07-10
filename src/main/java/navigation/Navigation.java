package navigation; //package//

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation { //class//
	
	public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://www.flipkart.com/");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		odriver.navigate().to("https://www.ebay.com/");
		odriver.manage().window().maximize();
		Thread.sleep(3000);
		
		odriver.navigate().back();
		Thread.sleep(2000);
		
		odriver.navigate().forward();
		odriver.navigate().refresh();
		
		Thread.sleep(3000);
		
		odriver.quit();
		
		
		
		
		
	    
		
	}

}
