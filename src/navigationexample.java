package webDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverTest {

	public static void main(String[] args) throws InterruptedException {

		// Browser setup
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Url which you want to open
		String url = "http://newtours.demoaut.com/";
		// Open the Url
		driver.get(url);

//Store all the url of http://newtours.demoaut.com/ page
		ArrayList<WebElement> urlList = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
// Do the itration and find out the url which having text as Register
		for (int i = 0; i < urlList.size(); i++) {
			// Verification which url has the text REGISTER
			try {
				if (urlList.get(i).getText().equals("REGISTER")) {
					// Click at the url
					urlList.get(i).click();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
//put wait for 3 sec
		Thread.sleep(3000);
		// Go back to Home Page
		driver.navigate().back();
		Thread.sleep(3000);
		// Go forward to Registration page
		driver.navigate().forward();
		Thread.sleep(3000);
		// Go back to Home page
		driver.navigate().to(url);

		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();

	}

}
