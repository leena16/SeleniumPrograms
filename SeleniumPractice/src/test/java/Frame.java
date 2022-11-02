import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		////iframe[@id='courses-iframe']
		
		////a[text()='Learning paths']
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Learning paths']")).click();
		Thread.sleep(5000);

	}

}
