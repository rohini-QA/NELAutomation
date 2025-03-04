package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		/*driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement From= driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To= driver.findElement(By.xpath("//*[@id='bank']/li"));
	 // dragAndDrop() method for dragging the element from source to //destination
	      Actions a = new Actions(driver);
	      Thread.sleep(5000);
	      a.dragAndDrop(From, To).build().perform();
	      Thread.sleep(5000);
	      driver.quit();*/
		// Navigate to the webpage containing the draggable elements
        driver.get("http://example.com/drag_and_drop_page");

        // Locate the source element to be dragged
        WebElement sourceElement = driver.findElement(By.id("source_element_id"));

        // Locate the target element where the source element will be dropped
        WebElement targetElement = driver.findElement(By.id("target_element_id"));

        // Create Actions instance
        Actions actions = new Actions(driver);

        // Perform drag and drop operation
        actions.clickAndHold(sourceElement) // Click and hold the source element
               .moveToElement(targetElement) // Move to the target element
               .release() // Release the source element to drop it on the target element
               .build() // Build the Action
               .perform(); // Perform the Action

        // Wait for a while to see the result before closing the browser
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();

	}

}
