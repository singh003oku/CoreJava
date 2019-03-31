package DemoPakage;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverRegistration {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open the url which you want
		driver.get("https://www.facebook.com/");

		// Set Time for 10 Sec
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Here we'll wait for 10 sec
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_2")));

	}

}
