import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@value='Hide']")).click();
		Thread.sleep(5000);
		
		System.out.print(driver.findElement(By.xpath("//*[@name='show-hide']")).isDisplayed());
		driver.findElement(By.xpath("//*[@value='Show']")).click();
		System.out.print(driver.findElement(By.xpath("//*[@name='show-hide']")).isDisplayed());
	}

}
