package capstone_runnerclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Capstone.Capstone_Project.BaseClass;
import com.Capstone.Capstone_Project.POMClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Capstone_Runner extends BaseClass{
	
		
		@BeforeTest
		public void beforetest() {
			getdriver ("chrome");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			url("https://wordpress.org/");
				
		
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//			driver.get("https://wordpress.org/");
		}
		
		@Test
		public void VerifyPageTitle () throws InterruptedException{
			PageFactory.initElements(driver, POMClass.class);
			String title = driver.getTitle();
			System.out.println("PageTitle:" + title);
			
			//Extend
			click(POMClass.Extend);
			sleep(4000);

			//Get WordPress
			click(POMClass.Click_WordPress);
			sleep(4000);
			String expectedtext = "Get WordPress";
			String actualtext = text(POMClass.Get_WordPress);
			Assert.assertEquals(expectedtext, actualtext);
			System.out.println("Text is :" + actualtext);
				
			//Community
			click(POMClass.Community);
			sleep(4000);
			click(POMClass.Photo_Directory);
			
			click(POMClass.searchbox);
			String searchtext ="black dog";
			parameter(POMClass.searchbox, searchtext);
			click(POMClass.searchicon);
			Display(POMClass.picture);
			click(POMClass.picture);
			scrolldown(driver);
			sleep(4000);
				
				
		}
		
			
		@AfterTest
		public void aftertest() {
			
			driver.quit();
		}

	}


