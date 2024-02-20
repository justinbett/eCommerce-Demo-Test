package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInstance {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		if(driver.get() == null) {
			try {
				driver.set(createDriver());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return driver.get();
	}
	
	public static WebDriver createDriver() throws IOException {
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") +
				"\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
		
		//Create a way to easily switch between different drivers for different WebDrivers using the config.properties file.
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	
	public static void driverCleanup() {
		driver.get().quit();
		driver.remove();
	}
}
