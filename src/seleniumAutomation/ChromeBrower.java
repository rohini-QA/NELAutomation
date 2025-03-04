package seleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrower {

	public static void main(String[] args) throws Exception  {
		//System.getProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver_win32.exe");


		 WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();


		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();


		// Launching url

		driver.get("https://www.javatpoint.com/selenium-tutorial");
		driver.manage().window().maximize();
		Thread.sleep(3000);





	}

}
