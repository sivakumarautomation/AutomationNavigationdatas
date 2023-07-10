package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUrl {
	

	public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		 By user = By.name("username");
		 By pass = By.name("password");
		 By login = By.xpath("//button[@type='submit']");
		 
			WebElement u = odriver.findElement(user);
			WebElement p = odriver.findElement(pass);
			WebElement l = odriver.findElement(login);
			
			u.sendKeys("Admin");
			p.sendKeys("admin123");
			l.click();
			Thread.sleep(6000);
			
			odriver.navigate().forward();
			odriver.navigate().back();
			odriver.navigate().refresh();
			
			Thread.sleep(3000);
			
			String currentUrl = odriver.getCurrentUrl();
			System.out.println(currentUrl);
			
			String title = odriver.getTitle();
			System.out.println(title);
			
			odriver.quit();
			

}

}