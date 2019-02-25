package webDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getURLfromPropertyFile {

	public static void main(String[] args) throws IOException {

		// Inptstrem from where you would like to read the data
		FileInputStream fs = new FileInputStream("C:\\Users\\abhishek\\Desktop\\test.properties");
//Properties class to use the Property file
		Properties pro = new Properties();
		pro.load(fs);

		String url;
		// get value of url key
		url = pro.getProperty("url");

		// Browser setup
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// open the url which you have get
		driver.get(url);
	}

}
