package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 WebDriver Driver =new ChromeDriver();

		 //Launch Website
		 Driver.navigate().to("https://www.javatpoint.com/java-tutorial");

		// Click on the search text box and send value
		    Driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");

		 // Click on the search button
		    Driver.findElement(By.name("btnK")).click();





}
}
