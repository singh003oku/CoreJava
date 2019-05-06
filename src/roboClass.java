package DemoPkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class roboClass {

	public static void main(String[] args) throws AWTException {

		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhishek\\Desktop\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
		Robot robo = new Robot();

		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=b45667f0fa8ffb42770ea4c2bfc8e9dd");

		driver.findElement(By.name("firstName")).sendKeys("Abhishek");

		WebElement el = driver.findElement(By.name("firstName"));

		Actions act = new Actions(driver);

		act.doubleClick(el).build().perform();

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_C);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_C);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);

	}

}
