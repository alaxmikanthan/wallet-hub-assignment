package com.qa.automation.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CommonPageHelpersLib {

	public static WebDriver driver;
	public static WebElement we;
	public static FirefoxOptions ffoptions;

	@SuppressWarnings("deprecation")
	public static void init() {

		if (Config.browser == "Firefox") {
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("permissions.default.desktop-notification", 1);
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability(FirefoxDriver.PROFILE, profile);
			System.setProperty("webdriver.gecko.driver", Config.firefoxdriverpath);
			driver = new FirefoxDriver(capabilities);
		} else if (Config.browser == "Chrome") {
			System.setProperty("webdriver.chrome.driver", Config.chromedriverpath);
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Config.timeout, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}

	public static void get(String url) {
		driver.get(url);
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void enterText(String element, String text) {
		String[] field = element.split("=", 2);
		WebElement we = null;
		if (field[0].contentEquals("id")) {
			we = driver.findElement(By.id(field[1]));
		} else if (field[0].contentEquals("xpath")) {
			we = driver.findElement(By.xpath(field[1]));
		}
		we.sendKeys(text);
	}

	public static void clickButton(String button_element) {
		String[] field = button_element.split("=", 2);
		WebElement we = null;
		if (field[0].contentEquals("id")) {
			we = driver.findElement(By.id(field[1]));
		} else if (field[0].contentEquals("xpath")) {
			we = driver.findElement(By.xpath(field[1]));
		}
		we.click();
	}

	public static String getText(String element) {
		String[] field = element.split("=", 2);
		WebElement we = null;
		if (field[0].contentEquals("id")) {
			we = driver.findElement(By.id(field[1]));
		} else if (field[0].contentEquals("xpath")) {
			we = driver.findElement(By.xpath(field[1]));
		}
		return we.getText();
	}

	public static void click(String element) {
		String[] field = element.split("=", 2);
		WebElement we = null;
		if (field[0].contentEquals("id")) {
			we = driver.findElement(By.id(field[1]));
		} else if (field[0].contentEquals("xpath")) {
			we = driver.findElement(By.xpath(field[1]));
		}
		we.click();
	}

	public static void sleep(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	public static void mouseHoverOver(String element) {
		String[] field = element.split("=", 2);
		WebElement we = null;
		if (field[0].contentEquals("id")) {
			we = driver.findElement(By.id(field[1]));
		} else if (field[0].contentEquals("xpath")) {
			we = driver.findElement(By.xpath(field[1]));
		}

		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
	}
}
