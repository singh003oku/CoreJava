package ADMSanity;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverDemo {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// To get A URL
		driver.get("http://toolsqa.com/automation-practice-form/");

		// Full Screen the browser.
		driver.manage().window().fullscreen();

		// Take Screenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// create file of that screen
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// destination of file
		File DestFile = new File("C:\\Selenium\\screenshoton.png");
		// copy of that file
		Files.copy(SrcFile, DestFile);

	}

}
