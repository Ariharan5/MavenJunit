package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
    static Actions a;
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static  void textGet(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static  void titleGet() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void sendValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void btnClick(WebElement element) {
		element.click();

	}
	

	

}
