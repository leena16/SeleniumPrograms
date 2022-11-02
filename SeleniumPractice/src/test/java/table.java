import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//*[@id='product']/tbody/tr[1]/td[2];
		//table[@name='courses']/tbody/tr[1]
		//fetch number of cols
		
		List<WebElement> set=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println(set.size());
		
		
		for(int i=2;i<set.size();i++) {
		String rowPath= "//table[@name='courses']/tbody/tr["+i+"]/td";
		
		List<WebElement> cols=driver.findElements(By.xpath(rowPath));
		System.out.println("Number of cols in row"+i+":  "+cols.size());
	
		
			for (int j=1;j<=cols.size();j++) {
				String colsPath="//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]";
				
				String Value=driver.findElement(By.xpath(colsPath)).getText();
				
				System.out.println(Value+"   ");
			}
				
		
		}
			
		}
		
		
		
	

}
