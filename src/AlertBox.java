package ADMSanity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// To get A URL
		driver.get("http://demo.automationtesting.in/Alerts.html");

		// Full Screen the browser.
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();

		if (ExpectedConditions.alertIsPresent() != null) {
			System.out.println("we are into If");
		} else {
			System.out.println("we are into else");
		}

		// Accept the alert
		driver.switchTo().alert().accept();
		System.out.println("we are out of alrey accepted");

	}

}
