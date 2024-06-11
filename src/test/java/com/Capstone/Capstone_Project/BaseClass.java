package com.Capstone.Capstone_Project;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	//WebDriver
			public static WebDriver driver;
				
			public static void getdriver(String browser) {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Z00530863\\eclipse-workspace\\Capstone_Project\\chromedriver\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				else if (browser.equalsIgnoreCase("firefox")) {
							
				}
				}
			
			//URL	
			public static void url(String url) {
			driver.get(url);
			}			
			
			//ThreadSleep
			public static void sleep(int millisecs)throws InterruptedException {
				Thread.sleep(millisecs);	
				}
			
			//SendKeys
			public static void parameter(WebElement element, String value) {
				element.sendKeys(value);
			}
			
			//ActionClass
			public static void actions(WebElement element) {
				Actions action =new Actions(driver);
				action.moveToElement(element).build().perform();
			}
			
			//DropDown
			public static void select(WebElement element, String value) {
				Select select =new Select (element);
				select.selectByVisibleText(value);
			}
			
			//isDisplayed
			public boolean Display(WebElement element) {
				boolean Display = element.isDisplayed();
				return Display;
			}
			
			//isEnabled
			public boolean VerifyTextBox(WebElement element) {
				boolean VerifyTextBox = element.isEnabled();
				return VerifyTextBox;
			}
			
			//isSelected
			public boolean VerifyCheckBox(WebElement element) {
				boolean VerifyCheckBox = element.isSelected();
				return VerifyCheckBox;
			}
			
			//Text
			
			public String text(WebElement element) {
				return element.getText();
			}
					
			//WebDriver_Wait
			public static void explicitwait(WebElement element) {
				WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(10));
				explicit.until(ExpectedConditions.elementToBeClickable(element)).click();
			}
			
			//ImplicitWait
			public static void implicitwait(WebElement element) {
				
			}
			
			//JavaScriptExecutor
			public static void scrolldown(WebDriver driver) {
				JavascriptExecutor jscript=(JavascriptExecutor) driver;
				jscript.executeScript("window.scrollBy(0,600);");
			}
			
			//JavaScriptExecutor
			public static void scrollup(WebElement element) {
				JavascriptExecutor jscript1=(JavascriptExecutor) driver;
				jscript1.executeScript("window.scrollBy(0,100);");
			}
			
			//Screenshot
//			public static void screenshot(String name)throws Exception {
//				TakesScreenshot screen = (TakesScreenshot) driver;
//				File source = screen.getScreenshotAs(OutputType.FILE);
//				File destination = new File("");
//				FileUtils.copyFile(source, destination);
//			}
			
			//Clear
			public static void clear(WebElement element) {
				element.clear();
			}
			
			//Click
			public static void click(WebElement element) {
				element.click();
			}
			
			//Close
			public static void close(WebElement element) {
				driver.close();
			}
			
			//Quit
			public static void quit(WebElement element) {
				driver.quit();
			}

		}



