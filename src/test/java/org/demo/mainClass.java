package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mainClass extends BaseClass{
public static void main(String[] args) {
	
	browserLaunch();
	launchUrl("https://www.facebook.com/");
	WebElement btn = driver.findElement(By.name("login"));
	textGet(btn);
	titleGet();
	currentUrl();
	WebElement userName = driver.findElement(By.id("email"));
	sendValue(userName, "Ariharan");
	btnClick(btn);
}

}
