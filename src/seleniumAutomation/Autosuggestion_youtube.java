package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion_youtube {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://seleniumbase.io/demo_page");
		Driver.findElement(By.id("Text input Filed ")).sendKeys("AbC");





	}

}
