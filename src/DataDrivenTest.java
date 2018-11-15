import java.io.IOException;

import org.apache.xmlbeans.impl.piccolo.xml.Piccolo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Object for TestRead Class where i have written Read and write funcation
		TestRead tr = new TestRead();
		
		for (int i = 1; i < 5; i++) {

			driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed");
			String fFName = tr.ReadData(i, 0);
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

			driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed");

			System.out.println(" we are here");
			driver.findElement(By.name("firstName")).sendKeys(fFName); // find the last
			driver.findElement(By.name("lastName")).sendKeys(fflastName); // find the Phone
			driver.findElement(By.name("phone")).sendKeys(phone); // find email id
			driver.findElement(By.id("userName")).sendKeys(email);
			driver.findElement(By.name("address1")).sendKeys(address); // find the city text field and
																		// send value to it
			driver.findElement(By.name("city")).sendKeys(City); // Find State Text
			driver.findElement(By.name("state")).sendKeys(state); // find postal code
			driver.findElement(By.name("postalCode")).sendKeys(postal); // find the
			driver.findElement(By.name("email")).sendKeys(username); // find
			driver.findElement(By.name("password")).sendKeys(pass); // find confirm
			driver.findElement(By.name("confirmPassword")).sendKeys(repass); // click
			driver.findElement(By.name("register")).click();

			Thread.sleep(8000);
		}

	}

}
