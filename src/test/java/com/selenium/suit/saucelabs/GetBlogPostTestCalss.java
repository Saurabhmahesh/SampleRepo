package com.selenium.suit.saucelabs;

import java.io.File;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBlogPostTestCalss {

	
	public static void main(String[] args) {
		
/*		WebDriver driver = new ChromeDriver();
		//press Ctrl+Shift+o to import all the drivers
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("User.dir") + "/chromedriver.exe");
		driver.manage().window().maximize();
		
		//hit the site URL
		driver.get("https://saucelabs.com/blog");
		
		//
		List<WebElement> topic = driver.findElements(By.className("_7RFW"));
		for(WebElement topicElement : topic) {
			System.out.println(topicElement.getText());
			
		}
		
		
		String fileName = "SauceLabData.xlsx";
		File file = new File(fileName);
		
		Workbook workbook = new XSSB*/
		

		int[] a= {10,20,30,15};
		
		for(int b : a){
		System.out.println(b);
		b++;
		}
		
		

	}

}
