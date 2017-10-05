package com.selenium.suit.saucelabs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesClass {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		Properties CONFIG = new Properties();
		FileInputStream inputStream = new FileInputStream("CONFIG.properties");
		CONFIG.load(inputStream);
		
		if (CONFIG.getProperty("browserType").equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
			driver = new ChromeDriver();

			driver.get(CONFIG.getProperty("testURL"));
			}
		
		
	}

}
