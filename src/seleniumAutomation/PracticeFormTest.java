package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeFormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		// Enter First Name
		Driver.findElement(By.name("firstname")).click();
		Driver.findElement(By.name("firstname")).sendKeys("TOM");
		// Set Lastname
        Driver.findElement(By.name("lastname")).click();
        Driver.findElement(By.name("lastname")).sendKeys("Wood");
        // Select Gender
        Driver.findElement(By.id("sex-0")).click();
        // Select Experience
        Driver.findElement(By.id("exp-4")).click();
        // Enter Date
        Driver.findElement(By.id("datepicker")).click();
        Driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
        // Select Profession
        Driver.findElement(By.id("profession-1")).click();
        // Select Automation Tool
        Driver.findElement(By.id("tool-2")).click();

        // Select Continent
        Driver.findElement(By.id("continents")).click();
        WebElement dropdown = Driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

        // Select Command
        WebElement dropdown1 = Driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();




        // Click Submit
        Driver.findElement(By.id("submit")).click();
  }
}






