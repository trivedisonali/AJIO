package com.ajio.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsPage {
	
	@FindBy(css = "[href='/s/starting-at-rs-199-4625-8751']")
	private WebElement shirtImg;
	
	public KidsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickShirtImg() {
		shirtImg.click();
		return shirtImg;
	}
}
