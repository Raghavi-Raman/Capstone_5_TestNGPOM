package com.Capstone.Capstone_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMClass extends BaseClass {

	
			//Extend
			@FindBy(xpath="//button[@aria-label='Extend submenu']")
			public static WebElement Extend;
				
			//GetWordPress
			@FindBy (xpath="//a[contains(text(),'Get WordPress')]")
			public static WebElement Click_WordPress;
			
			@FindBy (xpath="//h1[contains(text(),'Get WordPress')]")
			public static WebElement Get_WordPress;
			
			//Community
			
			@FindBy (xpath="//span[text()='Community']")
			public static WebElement Community;
			
			@FindBy (xpath="//span[text()='Photo Directory']")
			public static WebElement Photo_Directory;
			
			@FindBy (className="search-field")
			public static WebElement searchbox;
			
			@FindBy (xpath="//i[@class='dashicons dashicons-search']")
			public static WebElement searchicon;
			
			@FindBy (xpath="//img[@alt='Black dog, border collie lying sunbathing']")
			public static WebElement picture;
			
			
	}


