package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.JunitPage1;
import util.BrowserFactory;


public class JunitTest1 {
	
	WebDriver driver;
	String enteredList;
	
	// by creating an Object & by the name of the class
		
		@Test
		
		public void ALetsClickonToggleAL() {
		 driver =	BrowserFactory.init();
		 JunitPage1 JunitPage = PageFactory.initElements(driver, JunitPage1.class);
		 JunitPage.clickonToggleAll();
		 
		  		
		}
				
		@Test
		public void BLetsAddListItem() throws Throwable {
		 driver =	BrowserFactory.init();
		 JunitPage1 JunitPage = PageFactory.initElements(driver, JunitPage1.class);
		 JunitPage.addListItem(enteredList);
		 Thread.sleep(2000);
		 JunitPage.clickonSingleListNremove();
//		 JunitPage.removeList();
		 		
		}
		
//		@Test
		public void CToggleAllNdelete() {
		driver =	BrowserFactory.init();
		JunitPage1 JunitPage = PageFactory.initElements(driver, JunitPage1.class);
		JunitPage.clickonToggleAll();
		JunitPage.removeList();
		
			
		}
		
		

		
		




}
