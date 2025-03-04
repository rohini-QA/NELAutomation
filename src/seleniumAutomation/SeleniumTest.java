package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("automation step by step");

		// click on the search button
		driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		// close the browser
		//driver.close();
		driver.quit();
		}

}
