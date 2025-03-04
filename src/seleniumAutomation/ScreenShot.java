package seleniumAutomation;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/newtours/register.php");
		Driver.manage().window().maximize();

		File f=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("D:\\#Rohini\\Office\\Screenshot\\Guru.jpg"));





	}

}
