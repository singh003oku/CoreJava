import static org.testng.Assert.expectThrows;

import java.io.IOException;
import org.apache.log4j.Logger;

import org.apache.xmlbeans.impl.piccolo.xml.Piccolo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Logger logger = Logger.getLogger("devpinoyLogger");

		// Object for TestRead Class where i have written Read and write funcation
		TestRead tr = new TestRead();

		int i = 1;
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed");
		String fFName = TestRead.ReadData(i, 0);
		System.out.println("First Name" + fFName);

		String fflastName = tr.ReadData(i, 1);
		System.out.println("lname" + fflastName);

		String phone = tr.ReadData(i, 2);
		System.out.println("Phone " + phone);

		String email = tr.ReadData(i, 3);
		System.out.println("email" + email);

		String address = tr.ReadData(i, 4);
		System.out.println("address" + address);

		String City = tr.ReadData(i, 5);
		System.out.println("City" + City);

		String state = tr.ReadData(i, 6);
		System.out.println("State" + state);

		String postal = tr.ReadData(i, 7);
		System.out.println("Postal" + postal);

		String username = tr.ReadData(i, 8);
		System.out.println("username" + username);

		String pass = tr.ReadData(i, 9);
		System.out.println("password" + pass);

		String repass = tr.ReadData(i, 10);
		System.out.println("confirm pass" + repass);

		String baseURL = "http://newtours.demoaut.com/mercuryregister.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed";
		driver.get(baseURL);
		logger.info("Url has been Opened");

		driver.findElement(By.name("firstName")).sendKeys(fFName); // find the last
		logger.info("First Name has been entred");

		driver.findElement(By.name("lastName")).sendKeys(fflastName); // find the Phone
		logger.info("last name has been entred");
		driver.findElement(By.name("phone")).sendKeys(phone); // find email id

		logger.info("phone number has been entred");
		driver.findElement(By.id("userName")).sendKeys(email);
		logger.info("email has been entred");

		driver.findElement(By.name("address1")).sendKeys(address); // find the city text field and
		logger.info("Address has been entred");
		driver.findElement(By.name("city")).sendKeys(City); // Find State Text
		logger.info("city has been entred");
		driver.findElement(By.name("state")).sendKeys(state); // find postal code
		logger.info("state has been entred");
		driver.findElement(By.name("postalCode")).sendKeys(postal); // find the
		logger.info("postal code has been entred");
		driver.findElement(By.name("email")).sendKeys(username); // find
		logger.info("User name has been entred");
		driver.findElement(By.name("password")).sendKeys(pass); // find confirm
		logger.info("Password has been entred");
		driver.findElement(By.name("confirmPassword")).sendKeys(repass); // click
		logger.info("confirm passowrd has been entred");
		driver.findElement(By.name("register")).click();
		logger.info("Clicked at Registed");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			logger.error(e);
		}
		logger.info("Thread has been sleeped for 8000 M.S.");

		String currentURL = driver.getCurrentUrl();
		logger.info("Current URL " + currentURL);

		if (currentURL.equals("Url which was expected")) {
			TestRead.writeToExcel(i, 11, "Pass");
			
		} else {
			TestRead.writeToExcel(i, 11, "Fail");
		}
	}

}
