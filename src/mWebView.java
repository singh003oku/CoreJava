package ADMSanity;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mWebView {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Nexus 5");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		WebDriver driver = new ChromeDriver(chromeOptions);

		// To get A URL
		driver.get("http://demo.automationtesting.in/Alerts.html");
		// Accept the alert
		driver.switchTo().alert().accept();
		System.out.println("we are out of alrey accepted");

	
	
	
	}

}
