package com.ajio.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopscilePrintShirtwithRaglanSleevePage {
	@FindBy(xpath = "//span[text()='8-9Y']")
	private WebElement shirtSize;
	
	@FindBy(className = "btn-gold")
	private WebElement addToBagBtn;
	
	public PopscilePrintShirtwithRaglanSleevePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickShirtSize() {
		shirtSize.click();
		return shirtSize;
	}
	
	public WebElement clickAddToBagBtn() {
		addToBagBtn.click();
		return addToBagBtn;
	}
}
