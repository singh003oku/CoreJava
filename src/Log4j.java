import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Log4j {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		WebDriver unitDriver = new HtmlUnitDriver();

		unitDriver.get("https://www.google.co.in/");

		System.out.println("hi we are into this");
		
		
// Create reference variable “log” referencing getLogger method of Logger class, it is used to store logs in selenium.txt
//Logger log = Logger.getLogger(“devpinoyLogger”);
		Logger logger = Logger.getLogger("devpinoyLogger");
		
	

//unitDriver.findElement(By.xpath("asdasd")).click();

// Call debug method with the help of referencing variable log and log the information in test.logs file

		logger.debug("Log4jExample: A Sample Debug Message");

		logger.info("Log4jExample: A Sample Info  Message");

		logger.warn("Log4jExample: A Sample Warn  Message");

		logger.error("Log4jExample: A Sample Error Message");

		logger.fatal("Log4jExample: A Sample Fatal Message");

		System.out.println("hi");

		
	
	
	}

}