package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ac {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\A\\Webdriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en)");
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("8654345677");
	}

}
