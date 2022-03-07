package com.runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseclass.Base_Class;
import com.pom.Page_Objct_Manager;

public class Test_Runner extends Base_Class{
		
		public static WebDriver driver = launchBroser("chrome");
		Page_Objct_Manager pom = new Page_Objct_Manager(driver);
		
		@Test(priority = 1)
		private void launchBrowser()  {
			driver.get("http://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
		}
		
	
		@Test(priority = 2)
		private void first_Page() throws InterruptedException, AWTException {
			Thread.sleep(3000);
			pom.getInstancemp().getCom().click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		@Test(priority = 3)
		private void secondPage() {
			int price = 110;
			SoftAssert s = new SoftAssert();
			s.assertEquals(price, 110);
			
			pom.getInstanceSP().getMonitor().click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
		}
		
		@Test(priority = 4)
		@Parameters({"Text","Textarea"})
		private void finalPage(@Optional("Text")String Text,@Optional("Atomosol Interview")String Textarea) throws AWTException, InterruptedException {
			
			Thread.sleep(5000);
			pom.getInstancePP().getLarge().click();
			pom.getInstancePP().getCb().click();
			pom.getInstancePP().getText().sendKeys(Text);
			WebElement dd = pom.getInstancePP().getDd();
			Select s = new Select(dd);
			s.selectByIndex(1);
			pom.getInstancePP().getTextArea().sendKeys(Textarea);
			pom.getInstancePP().getQty().sendKeys("5");
			pom.getInstancePP().getUpload().click();
			Thread.sleep(5000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyPress(KeyEvent.VK_ESCAPE);
			
			pom.getInstancePP().getAddToCart().click();
			
			driver.close();
		}
		
			
			

}
