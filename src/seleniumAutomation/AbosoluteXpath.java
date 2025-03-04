package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbosoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/fieldset[1]/input[1]]")).sendKeys("Rahul Shetty");
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahul Shetty");
		driver.close();

	}

}
