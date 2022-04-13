package com.ajio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ajio.genericUtility.CommonPropertyUtility;
import com.ajio.genericUtility.CommonWebDriverUtility;
import com.ajio.genericUtility.ConstantPaths;
import com.ajio.objectRepository.D2CFashionPage;
import com.ajio.objectRepository.HomePage;
import com.ajio.objectRepository.KidsPage;
import com.ajio.objectRepository.MyBagPage;
import com.ajio.objectRepository.PopscilePrintShirtwithRaglanSleevePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = null;
		
		String url = CommonPropertyUtility.getDataFromPropertyFile(ConstantPaths.PropertyFilePath, "url");
		String browser = CommonPropertyUtility.getDataFromPropertyFile(ConstantPaths.PropertyFilePath, "browser");
		String timeout = CommonPropertyUtility.getDataFromPropertyFile(ConstantPaths.PropertyFilePath, "timeout");
		long longTimeout = Long.parseLong(timeout);
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(CommonWebDriverUtility.disableNotificationsPopup(driver));
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else
			System.out.println("Browser is not specified");
		
		CommonWebDriverUtility.maximizeWindow(driver);
		CommonWebDriverUtility.implicitWait(driver, longTimeout);
		CommonWebDriverUtility.navigateMainUrl(driver, url);
		
		HomePage homePg = new HomePage(driver);
		homePg.clickKidsLink();
		
		KidsPage kidsPg = new KidsPage(driver);
		kidsPg.clickShirtImg();
		
		D2CFashionPage d2cPg = new D2CFashionPage(driver);
		d2cPg.clickRioGirlShirtImg();
		
		CommonWebDriverUtility.switchWindow(driver, "raglan-sleeve/p");
		
		PopscilePrintShirtwithRaglanSleevePage shirtPg = new PopscilePrintShirtwithRaglanSleevePage(driver);
		shirtPg.clickShirtSize();
		shirtPg.clickAddToBagBtn();
		
		MyBagPage myBagPg= new MyBagPage(driver);
		
		CommonWebDriverUtility.clickByJscript(driver, myBagPg.clickMyBagBtn());
		//CommonWebDriverUtility.clickByJscript(driver, myBagPg.clickDeleteBtn());
		
		CommonWebDriverUtility.closeAllWindows(driver);
	}
}
