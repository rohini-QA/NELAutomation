package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager .chromedriver().setup();

		//Opening browser
		WebDriver Driver=new ChromeDriver();

		//Opening application
		Driver.get("https://accounts.lambdatest.com/login");

		//Opening window tab in maximize mode
		Driver.manage().window().maximize();

		//Locating the email field element via Name tag and storing it in the webelement
		WebElement email_field=Driver.findElement(By.name("email"));

		//Entering text into the email field
		email_field.sendKeys("sadhvisingh24@gmail.com");

        //Locating the password field element via Name tag and storing it in the webelement
		WebElement password_field=Driver.findElement(By.name("password"));

        //Entering text into the password field
	    password_field.sendKeys("LoremIpsum");

	    //Clicking on the login button to login to the application
	    WebElement login_button=Driver.findElement(By.xpath("//button[text()='LOGIN']"));

        //Clicking on the 'login' button
	    login_button.click();

	  //Closing the window
        Driver.close();






	}

}
