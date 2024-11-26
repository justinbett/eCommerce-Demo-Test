package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	private String url;
	private Properties prop;
	
	// Create a path to the config.properties file and make the data accessible through the prop variable.
	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") +
				"//src//main//java//resources//config.properties");
		prop.load(data);
	}
	
	public static WebDriver getDriver() {
		return WebDriverInstance.getDriver();
	}
	
	// Create an easy way to obtain the test sites URL from the config.properties file.
	public String getURL() {
		url = prop.getProperty("url");
		return url;
	}
	
	// Set up a system to take screenshots of the test to capture any failed tests.
	public void takeScreenshot(String name) throws IOException {
		File srcFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "\\screenshots\\" + timestamp() + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	// Create a timestamp
	public String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	public static void waitForElementInvisible(WebElement element, Duration timer) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timer);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
}
