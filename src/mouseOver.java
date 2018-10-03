package DemoPakage;

import java.io.File;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;

import javax.tools.Diagnostic;

import org.apache.commons.io.FileUtils;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;

public class mouseOver {

	public static void main(String[] args) throws IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open the url which you want
		driver.manage().window().fullscreen();
		driver.get("http://newtours.demoaut.com/");

		Actions act = new Actions(driver);
		// MouseOver at web element
		act.moveToElement(driver.findElement(By.name("login"))).build().perform();

		driver.get("http://newtours.demoaut.com/");
		// Double Click
		act.doubleClick(driver.findElement(By.name("login"))).build().perform();

		driver.get("http://newtours.demoaut.com/");
		// Click
		act.click(driver.findElement(By.name("login"))).build().perform();

		driver.get("http://newtours.demoaut.com/");
		// Right Click
		act.contextClick(driver.findElement(By.name("login"))).build().perform();

		driver.get("http://newtours.demoaut.com/");
        //Mouse Over
		act.moveToElement(driver.findElement(By.name("login"))).build().perform();

	}

}
