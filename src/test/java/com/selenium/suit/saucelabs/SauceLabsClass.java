package com.selenium.suit.saucelabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabsClass {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://saucelabs.com/blog");
		
		List<WebElement> postElementsList = driver.findElements(By.className("_3Rdy"));
		for (WebElement elementPost : postElementsList) {
			System.out.println(elementPost.findElement(By.className("_7RFW")).getText());
		}
	}

}
