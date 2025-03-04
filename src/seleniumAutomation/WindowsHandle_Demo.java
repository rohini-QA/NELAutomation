package seleniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
            Set<String> s1=driver.getWindowHandles();
        for (String ChildWindow : s1) {
            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    driver.findElement(By.name("cusid")).sendKeys("gaurav.3n@gmail.com");

                    driver.findElement(By.name("submit")).click();

			// Closing the Child Window.
                        driver.close();
            }
        }
     // Switching to Parent window i.e Main Window
        driver.switchTo().window(MainWindow);

	}

}
