import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String parent=driver.getWindowHandle();
		
		System.out.print("Parent"+parent);
		driver.findElement(By.xpath("//*[@id='openwindow']")).click();
	
		
		
		Set set=driver.getWindowHandles();
		
		Iterator <String>i=set.iterator();
		while(i.hasNext()) {
		String child= i.next();
		driver.switchTo().window(child);
		Thread.sleep(5000);
		System.out.print(driver.getTitle());
		}
	}
	

}
