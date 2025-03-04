package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdeopdown {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement ddown= driver.findElement(By.name("employes_c"));
		Select select = new Select(ddown);
		select.selectByValue("Level1");
		Thread.sleep(1000);
		select.selectByVisibleText("");
		Thread.sleep(1000);
		select.selectByIndex(5);
		Thread.sleep(1000);



	}



}
