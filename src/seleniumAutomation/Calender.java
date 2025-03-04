package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {



	private static final By By = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(org.openqa.selenium.By.id("datepicker")).click();

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.id("ui-datepicker-div")));
		String aMonth = driver.findElement(org.openqa.selenium.By.className("ui-datepicker-month")).getText();
		String aYear = driver.findElement(org.openqa.selenium.By.className("ui-datepicker-year")).getText();

		While(!aMonth.equals("July")&& aYear.equals(2023));{
			driver.findElement(org.openqa.selenium.By.xpath("//a[@data-handler='next']")).click();
			aMonth = driver.findElement(org.openqa.selenium.By.className("ui-datepicker-month")).getText();
			aYear = driver.findElement(org.openqa.selenium.By.className("ui-datepicker-year")).getText();
			}
			driver.findElement(org.openqa.selenium.By.xpath("//td[@data-handler='selectDay']/a[text()='23']")).click();



	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub

	}

}
