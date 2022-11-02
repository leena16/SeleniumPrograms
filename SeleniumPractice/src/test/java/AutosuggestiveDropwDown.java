import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestiveDropwDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		textbox.sendKeys("Ind");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[contains(@class,'wrapper')])[2]"));
		Thread.sleep(10000);
				
		
		driver.close();
				

	}

}
