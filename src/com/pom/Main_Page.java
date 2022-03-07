package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Page {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[@href=\"http://tutorialsninja.com/demo/index.php?route=product/category&path=25\"]")
	private WebElement com;

	public Main_Page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCom() {
		return com;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	

}
