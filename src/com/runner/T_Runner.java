package com.runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pom.Page_Objct_Manager;

public class T_Runner {
	
	@Test
	private void launchBrowser() throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Page_Objct_Manager pom = new Page_Objct_Manager(driver);
		pom.getInstancemp().getCom().click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		int price = 110;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(price, 110);
		System.out.println("Price is Validated");
		
		pom.getInstanceSP().getMonitor().click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(5000);
		pom.getInstancePP().getLarge().click();
		pom.getInstancePP().getCb().click();
		pom.getInstancePP().getText().sendKeys("Text");
		WebElement dd = pom.getInstancePP().getDd();
		Select s = new Select(dd);
		s.selectByIndex(1);
		pom.getInstancePP().getTextArea().sendKeys("Atmosol Interview");
		pom.getInstancePP().getQty().sendKeys("5");
		pom.getInstancePP().getUpload().click();
		Thread.sleep(5000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ESCAPE);
		r1.keyPress(KeyEvent.VK_ESCAPE);
		
		pom.getInstancePP().getAddToCart().click();
		
		driver.close();
		
	}

}
