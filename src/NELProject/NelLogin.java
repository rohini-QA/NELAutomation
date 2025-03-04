package NELProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NelLogin {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\Chrome_128\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://smartexam.navneet.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//h6[normalize-space()='Contact']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Trial Register']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("syncinst36");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='No']")).click();
		
        try {
            Thread.sleep(1000);  // Replace with WebDriverWait for better reliability
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate the "Yes" button and click it
        WebElement yesButton = driver.findElement(By.xpath("//button[text()='Yes']"));
        yesButton.click();


		 Thread.sleep(3000);
		 List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@class='gap-1 flex flex-col']//a"));
		for (WebElement item : menuItems) {
           if (item.getText().equals("Teachers")) {  // Change to desired menu name
                item.click();
                break;
           }
       }
      driver.findElement(By.xpath("//a[@href='/teachers']//li[@class='transition duration-300 group-")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@placeholder='Enter Keyword']")).sendKeys("Rohini");
		
	}
}