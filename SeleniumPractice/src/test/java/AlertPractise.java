import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractise {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Hello");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		Alert al= driver.switchTo().alert();
		 Thread.sleep(3000);
		System.out.print(al.getText());
		 al.accept();
		 Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
