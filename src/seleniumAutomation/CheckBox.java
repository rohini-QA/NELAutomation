package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//To find web element using Xpath and performing click event on check box
		WebElement option3= driver.findElement(By.xpath("//input[@value='option3']"));
		//boolean isSelected =option3.isSelected();
		//boolean isSelected =option3.isDisplayed();
		boolean isSelected =option3.isEnabled();
		if(!isSelected) {
		option3.click();
		}
	}

}
