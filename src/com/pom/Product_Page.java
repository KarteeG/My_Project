package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
	
	private WebDriver driver;
	
	@FindBy (xpath = "(//input[@type='radio'])[6]")
	private WebElement large;
	
	@FindBy (xpath = "(//input[@type='checkbox'])[2]")
	private WebElement cb;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement text;
	
	@FindBy (id = "input-option217")
	private WebElement dd;
	
	@FindBy (id = "input-option209")
	private WebElement textArea;
	
	@FindBy (id = "button-upload222")
	private WebElement upload;
	
	@FindBy (name = "quantity")
	private WebElement qty;
	
	@FindBy (id = "button-cart")
	private WebElement addToCart;

	public Product_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLarge() {
		return large;
	}

	public WebElement getCb() {
		return cb;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getDd() {
		return dd;
	}

	public WebElement getTextArea() {
		return textArea;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	
	

}
