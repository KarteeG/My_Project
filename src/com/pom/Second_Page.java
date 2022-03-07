package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_Page {

		
		private WebDriver driver;
		
		@FindBy (xpath = "//img[@src=\"http://tutorialsninja.com/demo/image/cache/catalog/demo/apple_cinema_30-228x228.jpg\"]")
		private WebElement monitor;

		public Second_Page(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
		}


		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getMonitor() {
			return monitor;
		}
		
		
		
		
}
