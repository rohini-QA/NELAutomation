package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingBrowser {

	private static Object expectedURL;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		//Storing the application Url in the string variable
		String url ="https://www.eurail.com/en";

		// Launch the website
		driver.get(url);
		driver.manage().window().maximize();

		//Storing title name in the string variable
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		//Storing expected title in string varible
		String expectedTitle ="Discover Europe By Train With Euril | Eurail.com";

		//Verification
		if(actualTitle.equals(expectedTitle));
		{
			System.out.println("The title of the page is : + actualtitle");
		}

		{
			System.out.println("Title verifiaction is failed");
			System.out.println("ActualTitle name is : + actualTitle");
			System.out.println("Expected name is : + expectedTitle");
		}
		//Navigate to Help screen
		driver.findElement(By.linkText("HELP")).click();

		//Storing actual url in the string variable
		String actualURL = driver.getCurrentUrl();

		//Storing expected title in string variable
		String expected ="https://www.eurail.com/en/help";


		//Verification
		if(actualURL.equals(expectedURL));
		{
			System.out.println("The current url of the page is : + actualURL");
		}

		{
			System.out.println("URL verifiaction is failed");
			System.out.println("ActualTitle name is : + actualURL");
			System.out.println("Expected name is : + expectedURL");
		}


	}


}
