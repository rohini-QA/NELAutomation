package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99registration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		// Opening browser
		WebDriver Driver = new ChromeDriver();
		// Opening application
		Driver.get("https://demo.guru99.com/test/newtours/register.php");

		// Opening window tab in maximize mode
		Driver.manage().window().maximize();

		// WebElement fn=Driver.findElement(By.xpath("//input[@name='firstName']"));
		// fn.sendKeys("Rohini");
		Driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Rohini");
		Thread.sleep(1000);
		WebElement ln = Driver.findElement(By.xpath("//input[@name='lastName']"));
		ln.sendKeys("Pakhale");
		Thread.sleep(1000);
		WebElement pn = Driver.findElement(By.xpath("//input[@name='phone']"));
		pn.sendKeys("234567891");
		Thread.sleep(1000);
		WebElement un = Driver.findElement(By.xpath("//input[@name='userName']"));
		un.sendKeys("rvp@gmail.com");
		Thread.sleep(1000);
		WebElement ad = Driver.findElement(By.xpath("//input[@name='address1']"));
		ad.sendKeys("Gala Empire");
		Thread.sleep(1000);
		WebElement ct = Driver.findElement(By.xpath("//input[@name='city']"));
		ct.sendKeys("Ahmedabad");
		Thread.sleep(1000);
		WebElement st = Driver.findElement(By.xpath("//input[@name='state']"));
		st.sendKeys("Gujarat");
		Thread.sleep(1000);
		WebElement pc = Driver.findElement(By.xpath("//input[@name='postalCode']"));
		pc.sendKeys("380054");
		Thread.sleep(1000);
		WebElement country = Driver.findElement(By.xpath("//select[@name='country']"));
		country.sendKeys("INDIA");
		Thread.sleep(1000);
		WebElement email = Driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("rvp@yogmail.com");
		Thread.sleep(1000);
		WebElement pass = Driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("123456");
		Thread.sleep(1000);
		WebElement cpass = Driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		cpass.sendKeys("123456");
		Thread.sleep(2000);
		WebElement submit = Driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Thread.sleep(2000);

	}

}
