package ADMSanity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-form/");

		// Full Screen the browser.
		driver.manage().window().fullscreen();

		WebElement dropdown = driver.findElement(By.id("continents"));
		System.out.println("dropdown value" + dropdown);

		//find out the webelement of select type
		Select drop = new Select(dropdown);
		// To select Value , we have multiple methods lets do it by index
		drop.selectByIndex(3);

	
	}

}
