package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void insertType(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}
}
