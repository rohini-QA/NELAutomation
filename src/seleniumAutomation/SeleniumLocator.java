package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocator {



	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWaits();
		driver.findElement(By.name("enter-name")).sendKeys("Rahul Shetty");
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("REST API")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.partialLinkText("REST ")).click();
		//driver.findElement(By.className("inputs")).sendKeys("Rahul Shetty");
		//driver.findElement(By.cssSelector("btton#openwindow")).click();
		//driver.findElement(By.cssSelector("button.btn-style class1")).click();

	}

}
