package com.ajio.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBagPage {
	
	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement deleteBtn;
	
	@FindBy(css = "a[href='/cart']")
	private WebElement myBagBtn;
	
	public MyBagPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickDeleteBtn() {
		deleteBtn.click();
		return deleteBtn;
	}
	
	public WebElement clickMyBagBtn() {
		myBagBtn.click();
		return myBagBtn;
	}
}
