package com.ajio.genericUtility;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonWebDriverUtility {
	
	public static ChromeOptions disableNotificationsPopup(WebDriver driver) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		return options;
	}
	
	public static void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void implicitWait(WebDriver driver, long wait) {
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	
	public static void navigateMainUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public static Set<String> switchWindow(WebDriver driver, String partialLink) {
		Set<String> widList = driver.getWindowHandles();
		for (String id : widList) {
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains(partialLink)) {
				break;
			}
		}
		return widList;
	}
	
	public static void closeAllWindows(WebDriver driver) {
		driver.quit();
	}
	
	public static void clickByJscript(WebDriver driver, WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);
	}
}
