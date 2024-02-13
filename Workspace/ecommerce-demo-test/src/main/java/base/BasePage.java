package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public static WebDriver driver;
	private String url;
	private Properties prop;
	
	// Create a path to the config.properties file and make the data accessible through the prop variable.
	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") +
				"\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}

	//Create a way to easily switch between different drivers for different WebDrivers using the config.properties file.
	public WebDriver getDriver() {
		if (prop.getProperty("browser").equals("chrome")) {
			// If the value equals chrome, set the WebDriver to use the chromedriver.exe
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			// If the value equals firefox, set the WebDriver to use the gekodriver.exe
			System.setProperty("webdriver.geko.driver", System.getProperty("user.dir") + "\\drivers\\gekodriver.exe");
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("edge")) {
			// If the value equals edge, set the WebDriver to use the msedgedriver.exe
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	// Create an easy way to obtain the test sites URL from the config.properties file.
	public String getURL() {
		url = prop.getProperty("url");
		return url;
	}
	
	// Set up a system to take screenshots of the test to capture any failed tests.
	
	
}
