package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		 // Launch website
		 Driver.navigate().to("https://www.google.com/");

		 //Click on the search text box and send value
		  Driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorial");

		  // Click on the Search button
		   Driver.findElements(By.name("q"));

	}

}
