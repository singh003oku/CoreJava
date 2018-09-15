package DemoPakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		// Full Screen the browser.
		driver.manage().window().fullscreen();

		List<WebElement> testurl = driver.findElements(By.tagName("a"));

		for (int i = 0; i < 5; i++) {

			System.out.println("url" + testurl.get(i).getAttribute("href"));

		}

	}

}
