package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("rohinip.cybernative@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Control@12345");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();



	}
}
