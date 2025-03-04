package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
		//radio2.click();
		WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
		//boolean selectState= radio1.isSelected();
		//boolean selectState= radio1.isDisplayed();
		boolean selectState= radio1.isEnabled();
		if(!selectState) {
			radio1.click();
			}
		// close chrome driver
		//driver.close();

		}

}
