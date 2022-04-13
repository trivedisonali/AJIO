package com.ajio.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D2CFashionPage {
	
	@FindBy(xpath = "//div[text()='Popscile Print Shirt with Raglan Sleeve']")
	private WebElement shirtImg;
	
	public D2CFashionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickRioGirlShirtImg() {
		shirtImg.click();
		return shirtImg;
	}
}
