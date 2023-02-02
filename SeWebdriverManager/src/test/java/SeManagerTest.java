import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeManagerTest {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().driverVersion("2.36").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.close();
		driver.quit();
		
	}

}
