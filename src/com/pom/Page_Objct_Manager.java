package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Objct_Manager {
	
	private WebDriver driver;
	
	private Main_Page mp;
	private Second_Page sp;
	private Product_Page pp;
	
	public Page_Objct_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Main_Page getInstancemp() {
		if (mp == null) {
			mp = new Main_Page(driver);
		}
		return mp;
	}
	
	public Second_Page getInstanceSP() {
		if (sp == null) {
			sp = new Second_Page(driver);
		}
		return sp;
	}
	
	public Product_Page getInstancePP() {
		if (pp == null) {
			pp = new Product_Page(driver);
		}
		return pp;
	}

}
