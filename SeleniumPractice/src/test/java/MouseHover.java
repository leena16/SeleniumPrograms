import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		Actions action = new Actions(driver);
		WebElement mainmenu=driver.findElement(By.xpath("//button[contains(@id,'product')]"));
		WebElement submenu=driver.findElement(By.xpath("(//a[contains(@class,'menu-item-integration')])[1]"));
		
		action.moveToElement(mainmenu);
		Thread.sleep(5000);
		action.moveToElement(submenu).click().build().perform();
		Thread.sleep(5000);
		
		

	}

}
